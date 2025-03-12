import java.util.Scanner;

public class Proj2_2_MadLibsClone {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String adjective1;
        String girlsName;
        String Adjective2;
        String Occupation;
        String Place;

        System.out.println("Enter an adjective: ");
        adjective1 = keyboard.nextLine();

        System.out.println("Enter a girls name: ");
        girlsName = keyboard.nextLine();

        System.out.println("Enter another adjective: ");
        Adjective2 = keyboard.nextLine();

        System.out.println("Enter an occupation: ");
        Occupation= keyboard.nextLine();

        System.out.println("Enter the name of a place: ");
        Place = keyboard.nextLine();


        System.out.println("There once was a " + adjective1 + " girl named " + girlsName + " who was a "+ Adjective2 +" " + Occupation + " in the kingdom of "+ Place + " .");
    }
}
