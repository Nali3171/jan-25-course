import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        int favNum;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("what is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What is your favourite real number?");
        favNum = keyboard.nextInt();
        keyboard.nextLine();
        favNum *= 2;



        System.out.println("Hello, " + name);
        System.out.println("My AGE IS " + age );
        System.out.println("my fav number is " + favNum );









    }//end main
}
