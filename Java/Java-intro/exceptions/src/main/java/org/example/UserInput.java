package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    Scanner s = new Scanner(System.in);

    public void getUserInput() {
        try {
            System.out.println("Give me a number smaller than 10");
            int userNumber = s.nextInt();
            if (userNumber >= 10) {
                throw new InputMismatchException("Your number is too large");
            }
            System.out.printf("Thanks. Your number is %d", userNumber);
        } catch (InputMismatchException e) {

            getUserInput();
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
        }
    }

}