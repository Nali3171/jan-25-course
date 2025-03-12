package src.main.java.org.example;

public class IceCreamDemo {

    public static void main(String[] args) {
IceCream myIC = new IceCream("chocolate", 3, 2);
        IceCream yourIC = new IceCream("Vanilla",2 ,1 );

        myIC.addTopping("nuts");
        myIC.addTopping("cherries");

        yourIC.addTopping("Sprinkles");
        yourIC.addTopping("sauce");

        printIC(myIC);
        printIC(yourIC);

        }//end of main
    public static void printIC(IceCream iceCream){
        System.out.println(iceCream.getName());
        System.out.println("Cost: £ " + iceCream.getCost());
        System.out.println("Topped with: ");
        iceCream.printToppings();
        System.out.println();


    }

    }

