package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperCaseToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperCaseToLowerCase t = new Programme_9_ConvertUpperCaseToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //Conversion of UpperCaseto Lowercase method
    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
