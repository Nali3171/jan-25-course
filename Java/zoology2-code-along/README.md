# Zoology

A starter application for a Zoo simulation game.

## Branches

Following are the list of branches and what they represent.

| Branch                     | Comments                       |
|----------------------------|--------------------------------|
| branch-01-classes          | Before classes lesson          |
| branch-02-inheritance      | Before inheritance lesson      |
| branch-03-collections      | Before collections lesson      |
| branch-04-static           | Before statics lesson          |
| branch-05-junit            | Before JUnit lesson            |
| branch-06-abstract-classes | Before abstract lesson         |
| branch-07-interfaces       | Before interfaces lesson       |
| branch-08-exceptions       | Before exceptions lesson       |
| branch-09-design-patterns  | Before design patterns lesson  |
| branch-10-lambda-functions | Before lambda functions lesson |
|                            |                                |


## Changes to this branch

An `AnimalFactory` has been added to simplify the creation of all animal classes.

```java
public class AnimalFactory {

    private List<Animal> creationHistory = new ArrayList<>();
    private Map<AnimalType, Set<String>> namesMap = new HashMap<>();

    public <T extends Animal> T create(AnimalType type) {
        return (T) createAnimal(type);
    }

    public Animal createAnimal(AnimalType type) {
        Animal created;

        do {
            created = doCreateAnimal(type);
            if( ! this.namesMap.containsKey( created.getType() ) ) {
                this.namesMap.put( created.getType(), new HashSet<>() );
            }
        } while ( namesMap.get(created.getType()).contains( created.getName() ) );

        creationHistory.add(created);

        namesMap.get(created.getType()).add( created.getName() );

        return created;
    }

    private Animal doCreateAnimal(AnimalType type) {
        switch (type) {
            case tiger:
                return new Tiger( AnimalUtils.nextUniqueId(), AnimalUtils.generateName(), AnimalUtils.generateAge() );
            case llama:
                return new Llama( AnimalUtils.nextUniqueId(), AnimalUtils.generateName(), AnimalUtils.generateAge() );
            case lion:
                return new Lion( AnimalUtils.nextUniqueId(), AnimalUtils.generateName(), AnimalUtils.generateAge() );
            case crocodile:
                return new Crocodile( AnimalUtils.nextUniqueId(), AnimalUtils.generateName(), AnimalUtils.generateAge() );
        }
        throw new IllegalArgumentException(String.format("Animal type %s can't be created", type));
    }

}

```

A `Map` has been added to `Zoo` to speed up animal lookup using its id.

```java
public class Zoo {
    
    // cutdown...

    private Map<Integer, Animal> idMap = new HashMap<>();
    private Map<String, List<Animal>> nameMap = new HashMap<>();

    public void addAnimal(Tiger tiger) {
        this.animals.add(tiger);
        addAnimalToMaps(tiger);
    }

    public void addAnimal(Llama llama) {
        this.animals.add( llama );
        addAnimalToMaps(llama);
    }

    public void addAnimal(Crocodile crocodile) {
        this.animals.add(crocodile);
        addAnimalToMaps(crocodile);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
        addAnimalToMaps(animal);
    }

    private void addAnimalToMaps(Animal animal) {
        this.idMap.put( animal.getId(), animal);
        List<Animal> animalList = this.nameMap.getOrDefault( animal.getName().toLowerCase(), new ArrayList<>() );
        animalList.add(animal);
        this.nameMap.put( animal.getName().toLowerCase(), animalList);
    }

    public Animal findAnimalById(int id) {
        return this.idMap.get(id);
    }

    public List<Animal> findAnimalsByName(String name) {
        return this.nameMap.get( name.toLowerCase() );
    }

}

```

`ZooPlayground` has been updated to use the new A`nimalFactory` class.


### branch-09-design-patterns

Validation has been added to `Animal`, if invalid value is set then an exception is thrown.

```java

public void setName(String name) {
    validateAnimalName(name);
    this.name = name;
}

private void validateAnimalName(String name) {
    if( name == null || "".equals(name.trim()) ) {
        throw new IllegalArgumentException("Name must be a valid name");
    }
}


public void setAge(int age) {
    validateAnimalAge(age);
    this.age = age;
}

private void validateAnimalAge(int age) {
    if (age < 1 || age > 99) {
        throw new IllegalArgumentException("Age must be betweem 1 and 99 years");
    }
}

@Override
public void receiveStar(int stars) {
    validateStars(stars);
    this.stars = Math.min( this.stars + stars, 10  ); // no more than 10 stars!
    this.popularity = (popularity + (stars * 10)) % 100;
}

private void validateStars(int stars) {
    if( stars < 0 || stars > 10 ) {
        throw new IllegalArgumentException("Number of stars must be betweem 1 amd 10");
    }
}
```

`AnimalTest` has also been updated to test the new functionality.


### branch-08-exceptions

A new enum has been added `AnimalSorting`, to define various ways of soring animals.

```java
public enum AnimalSorting {

    byId, byName, byType;

}
```
Two new Comparator implementations have been added, to handling sorting on different fields, for example:

```java
public class SortByAnimalTypeThenName implements Comparator<Animal> {

    @Override
    public int compare(Animal left, Animal right) {
        if( left.getType().equals(right.getType()) ) {
            return left.getName().compareTo( right.getName() );
        }
        return left.getType().compareTo( right.getType() );
    }

}
```

`Animal` now implements `Comparator` and sorts on id.

```java

@Override
public int compareTo(Animal other) {
    // order by id
    return this.id - other.id;
}
```

The `getInformation` method has been spruced up; it now uses ANSI colours to make a more dramatic description, and displays
the new stars.

The `Zoo` has additional method to sort the Animals.

```java
public void listAnimals(AnimalSorting animalSorting) {
    switch (animalSorting) {
        case byName:
            Collections.sort(animals, new SortByAnimalName());
            break;
        case byType:
            Collections.sort(animals, new SortByAnimalTypeThenName());
            break;
        default:
            Collections.sort(animals);
    }
    for (Animal animal : animals) {
        System.out.println(animal.getInformation());
    }
}
```

**Stars**

The ability to give aniamls a star, or vote, has been added.

This is implemented using an interface Starrable, which the Animal class implements.

```java
public interface Starrable {

    void receiveStar(int stars);
    int getStars();

}
```
The implementation is very basic, just using a counter.

```java
@Override
public void receiveStar(int stars) {
    this.stars = Math.min( this.stars + stars, 10  ); // no more than 10 stars!
    this.popularity = (popularity + (stars * 10)) % 100;
}

@Override
public int getStars() {
    return this.stars;
}

public void setStars(int stars) {
    this.stars = stars;
}


```

A helper class for stars has been added - `StarUtils`, this provides some nice functionality, like printing out the stars in an interesting way.


**CommandRunner**

A couple of new commands have been added.

The ability for both a Visitor and ZooKeeper to list animals by type.

A Visitor also has the ability to given an animal a star.


### branch-07-interfaces

An enum has been added to identify the type of an animal.
It has a type and a boolean to indicate whether the animal is pettable or not. This can be used when initalising animals.

```java
public enum AnimalType {

    crocodile, lion, tiger, llama(true), monkey(true);
    boolean pettable = false;

    // default
    AnimalType() {
    }
    AnimalType(boolean pettable) {
        this.pettable = pettable;
    }

    public boolean isPettable() {
        return pettable;
    }
}
```

A couple of new fields have been added to Animal.

```java
protected boolean pettable;
protected int popularity;

// getters and setters
public boolean isPettable() {
    return pettable;
}

public void setPettable(boolean pettable) {
    this.pettable = pettable;
}

public int getPopularity() {
    return popularity;
}

```

The `Animal` class has been made abstract, to prevent it been created directly. Also a couple of abstract methods were added.

```java
public abstract class Animal {

    public abstract AnimalType getType();

    public abstract void makeSound();
    
}

```

Each animal subclass has been modified to implement the abstract methods, for example `Tiger`.

```java
public class Tiger extends Animal {

    public Tiger(int id, String name, int age) {
        super(id, name, age );
    }

    @Override
    public AnimalType getType() {
        return AnimalType.tiger;
    }

    @Override
    public void makeSound() {
        System.out.println("Grrrrrrr!");
    }

}
```

**CommandRunner**

A new command has been added.

The ability for a Visitor to pet an animal.

### branch-06-abstract-classes

In `Animal` a variable to represent hunger has been added.

```java
private static final int HUNGER_LEVEL = 40;

// ...
protected short hunger = 50;

```
Along with some methods to set and get these - but not just standard getters and setters,they are not always appropriate. Note that
`setHunger` is default/package access and is only there for testing.

```java

public short getHunger() {
    return hunger;
}

/**
 * For Testing
 * @param hunger
 */
void setHunger(short hunger) {
    this.hunger = hunger;
}

public boolean isHungry() {
    return this.hunger >= HUNGER_LEVEL;
}

public void feed() {
    hunger -= 10;
    makeSound();
}
```

A whole raft to test classes have been added; to test `Animal`, `Zoo` and `User`.

**CommandRunner**

A couple of new commands have been added.

The ability for both a Visitor and ZooKeeper to visit an animal.

A ZooKeeper also has the ability to feed an animal, and thus decrease its hunger.


### branch-05-junit

A utility class has been added, to help create an animal - `AnimalUtils` - in the `com.nology.zoology.animal` package.

The utils provides **static** methods for generating the next animal id, selecting a random name and generating a random age. All these help 
when creating a new animal of any type. This is a good example of encapsulation - for example the caller of `generateName` doesn't
need to know how it generates the names.

```java
public class AnimalUtils {

    private static int nextId = 0;

    private static final List<String> names = new ArrayList<>();
    private static final Random RANDOM = new Random();

    static {
        names.add("Abbie");
        // ...
    }

    public static int nextUniqueId() {
        return ++nextId;
    }

    public static String generateName() {
        return names.get( RANDOM.nextInt( names.size()) );
    }

    public static int generateAge() {
        return 1 + RANDOM.nextInt(15);
    }

}
```

The ZooPlayground main method has been updated to use the new utilty class. The utility methods help automate creating animals, meaning
we can generate animals in a loop or by promoting the user for number of animals to create.

```java

// or user defined!
Scanner scanner = new Scanner(System.in);

int numTigers = readInteger(scanner, "How many tigers do you want to create? ", 1, 5);
int numLLamas = readInteger(scanner, "How many llamas do you want to create? ", 1, 5);
int numLCrocs = readInteger(scanner, "How many crocodiles do you want to create? ", 1, 5);

for (int i = 0; i < numTigers; i++) {
    zoo.addAnimal(new Tiger( nextUniqueId(), generateName(), generateAge() ));
}
for (int i = 0; i < numLLamas; i++) {
    zoo.addAnimal(new Llama( nextUniqueId(), generateName(), generateAge() ));
}
for (int i = 0; i < numLCrocs; i++) {
    zoo.addAnimal(new Crocodile( nextUniqueId(), generateName(), generateAge() ));
}

System.out.println( zoo.getAnimalCount() );

```
With the method `readInteger` as:

```java
private static int readInteger(Scanner scanner, String prompt, int min, int max) {
    int num = -1;
    while ( num < min || num > max ) {
        System.out.println(prompt);
        num = scanner.nextInt();
        if( num < min || num > max ) {
            System.out.println("Please enter in range of " + min + " and " + max);
        }

    }
    return num;
}
```

### branch-04-static

A new animal, `Lion`, has been added to the zoo.

A 'Zoo' class has been created to hold all our animals. Animals can be added, it can print a list of animals and number of animals in the zoo.
The Zoo stores its animals in an ArrayList, as much simpler than an array.

```java
public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();
    
    public Zoo() {
        System.out.println("Zoo starting up!");
    }

    public void addAnimal(Tiger tiger) {
        this.animals.add(tiger);
    }
    public void addAnimal(Llama llama) {
        this.animals.add( llama );
    }
    public void addAnimal(Crocodile crocodile) {
        this.animals.add( crocodile );
    }
    public void addAnimal(Animal animal) {
        this.animals.add( animal );
    }

    public int getAnimalCount() {
        return this.animals.size();
    }
    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal);
        }
    }

    public void shutdownZoo() {
        System.out.println("Zoo shutdown");
    }
}
```

`ZooPlayground` has been moved to the `com.nology` package.

### Command line

The command package contains a number of classes that implement a simple command line application that allows interaction with the Zoo object.

This makes the Zoology app feel more like a game or sim, rather than just creating and calling methods.

There are two types of user - Visitor and ZooKeeper - each of which can have different commands. 

As the code progresses additional methods/commands will be added to the command runners.

To use the command line:

```java

Zoo zoo = new Zoo();

zoo.addAnimal( new Tiger( nextId++,"Terry", RANDOM.nextInt(10) + 2 ) );
zoo.addAnimal( new Tiger( nextId++,"Cuddles", RANDOM.nextInt(10) + 2 ) );
zoo.addAnimal( new Llama( nextId++, "Larry", RANDOM.nextInt(10) + 2 ));
zoo.addAnimal( new Llama( nextId++, "Legs", RANDOM.nextInt(10) + 2 ));
zoo.addAnimal( new Crocodile( nextId++, "Carol", RANDOM.nextInt(10) + 2 ));
zoo.addAnimal( new Crocodile( nextId++, "Snappy", RANDOM.nextInt(10) + 2 ));

System.out.println( zoo.getAnimalCount() );

UserCommandRunner userCommandRunner = new UserCommandRunner(zoo);

userCommandRunner.runCommands();


```

The command line uses various coding concepts that have not been covered yet, so best to re-visit after a few more lessons.


### branch-03-collections

An `Animal` class has been added to package `com.noligy.zoology.animal`. This represents the general concept of an animal and has the important variables
that all animals have - id, name and age. The class also has a constructor to populate its variables on creation.

The specific animals classes - `Tiger`, `Llama` and `Crocodile` - now inherit from `Animal`. They inherit the common variables and methods and override the two methods where 
they have different behaviours - `makeSound` and `getInformation`. 

The Animal class makes the specific animal classes far simpler, as they inherit most of their behaviour from their parent.

The code in `ZooPlayground` has been updated to use the new classes.


### branch-02-inheritance

Three new animal classes have been added, `Tiger`, `Llama` and `Crocodile`. These are in the `com.noligy.zoology.animal` package.

These represent the three types of animals that will be held in the zoo, more will be added.

They all follow the same structure. There are several instance variables, used to describe the animal, along with getters and setters
to access the variables (encapsulation). There are also a couple of methods - to make a sound and get information.

```java

public class Tiger {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Grrrrrr!");
    }

    public String getInformation() {
        return this.name + " (" + this.id + "), a tiger, is " + this.age + " years old";
    }
}


```

ZooPlayground has been updated to create some animals and call some methods.

A method has been added to simplify creating a Tiger object.

```java
    public Tiger buildTiger(int id, String name, int age) {
        Tiger tiger = new Tiger();
        tiger.setId(id);
        tiger.setName(name);
        tiger.setAge(age);
        return tiger;
    }
```

