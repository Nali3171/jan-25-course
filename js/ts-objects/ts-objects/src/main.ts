import './style.css'

//Objects
//objest are a way of storing (related) information in a single variable
//object literal notation

const myArray: any[] = ['Remi', 35, true];

const person = {
  //[key]: [value] => also called a property
  // key descries the value it is associated with
  //a value can be ANY data type BY DEFAULT
  name: 'Remi',
  age: 35,
  ukBased: true,
  citiesHasLived: ['London', 'paris', 'sydney'],
  citizenship: {
    aus: true,
    fr: true,
    uk: false,
  }
};
// how do we access and modify existing objects?
// using . dot notation
console.log('person object:', person);
console.log('person age:', person.age);
console.log('person name:', person.name);
//reassigning
person.name = 'Sam';
console.log('person name:', person.name);
person.citiesHasLived.push("Brighton");
console.log(person.citiesHasLived);


// How can we restrict types in out object in TS?
// using tyoe to give a DEFINITION of an object

type Citizen = {
name: string;
age: number;
isBritish: boolean;
'my key Name': string;
};

const john: Citizen = {
  name: "John",
  age: 23,
  isBritish: true,
  'my key Name': "my key value",
};
console.log(john['my key Name']);

// How can we use type alias to have object consistency?
// interfaces = a type for objects
// YOU CAN NOT EXTEND TYPES

interface Animal{
  species: string;

}
interface Cat extends Animal {
    isAnnoying: boolean;
}

const garfield : Cat ={
  species: 'cat',
  isAnnoying: true,
}

// How to copy objects?
const myArrayNums: number[] = [1, 2, 3]
const myCopyArr: number[] = [...myArrayNums];
console.log(myCopyArr);



//copying objects key by key:


//JSON - Javascript object Notation


console.log('person cities:', person.citiesHasLived);
console.log('person cities:', person.citiesHasLived.length);
console.log('person cities:', person.citiesHasLived.length.toString());


// using the [] bracket notation
console.log('Age, bracket notation:', person['age']);
console.log('Name, bracket notation:', person['name']);
console.log('Age, bracket notation:', person['age']);


// PM lesson 21/01


// difference between interface and type
// Interface can be extended in and from

// Object destructuring


// how to access al the Key/Value pairs

//const allKeys = Object.keys(doggy);
//console.log(allKeys);
//const allValues = Object.values(doggy);
//console.log(allValues);


// checking that a property exists
//const hasABreed = doggy.hasOwnProperty('breed');
//console.log(hasABreed);

