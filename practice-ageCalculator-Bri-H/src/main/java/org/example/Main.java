package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create a new Scanner object that reads from System.in
        Scanner scanner = new Scanner(System.in);
        //Take in an age from the user.
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Calculate the years left until they are 100 years old
        int yearsTo100 = 100 - age;

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Return a message to tell the user many many years they have until they are
        //100.
        System.out.println("You have " + yearsTo100 + " years until you are 100 years old.");
    }
}