import java.util.Scanner;

/**
 * CHECKLIST
 * Need to define my variables
 * Create the prompts for the user input
 * Use the If/Else statements to make use of the input
 * Use the modular(%) to divide numbers to check whether it is even or not.
 * Use tied boolean conditionals to validate input
 * Ask the user if they want to terminate the program
 */


public class Main {

    public static void main(String[] args) {
        //Define them variables son.

        String cont = "y"; //defines my program loop
        String userName;
        int userInput;
        int userInput2;
        int userInput3;


        //Creating the prompts
        System.out.println("What is your name?");

        //Setting up the scanner called input
        Scanner input = new Scanner(System.in);

        userName = (input.next());

        System.out.println("Thank you, " + userName);

    }
}
