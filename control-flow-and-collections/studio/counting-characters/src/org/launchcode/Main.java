package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        // Reading from user input
//        Scanner input = new Scanner(System.in);
//        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//
//        //String str = "Google";
//        System.out.println("Please Enter a String: ");
//        String userStr = input.nextLine();
//
//        // Declare the HashMap
//        HashMap <Character, Integer> charCount = new HashMap<>();
//        // Makes the user string case-insensitive
//        userStr = userStr.toLowerCase().replaceAll("[^a-zA-Z]", "");
//        // For loop to iterate through the user String
//        for (int i = userStr.length() - 1; i >= 0; i--) {
//            // Conditional to check if there is already a key with the presented value
//            if (charCount.containsKey(userStr.charAt(i))) {
//                // declare a count variable if the character is already present in the HashMap
//                int count = charCount.get(userStr.charAt(i));
//                // increment the value by 1
//                charCount.put(userStr.charAt(i), ++count);
//            } else {
//                // Creates a new entry for a newly introduced character
//                charCount.put(userStr.charAt(i), 1);
//            }
//        }
//
//        System.out.println(charCount);

        // Trying to read from a file

        File file = new File("C:\\Users\\lhedr\\LaunchCode\\javaPracticeFile.txt");
        Scanner input = new Scanner(file);

        String str = input.nextLine();


        // Declare the HashMap
        HashMap <Character, Integer> charCount = new HashMap<>();
        // Makes the user string case-insensitive
        str = str.toLowerCase().replaceAll("[^a-zA-Z]", "");
        // For loop to iterate through the user String
        for (int i = str.length() - 1; i >= 0; i--) {
            // Conditional to check if there is already a key with the presented value
            if (charCount.containsKey(str.charAt(i))) {
                // declare a count variable if the character is already present in the HashMap
                int count = charCount.get(str.charAt(i));
                // increment the value by 1
                charCount.put(str.charAt(i), ++count);
            } else {
                // Creates a new entry for a newly introduced character
                charCount.put(str.charAt(i), 1);
            }
        }

        System.out.println(charCount);

    }
}
