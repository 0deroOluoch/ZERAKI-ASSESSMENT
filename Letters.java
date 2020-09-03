package com.appnetics;
import java.util.Scanner;

public class Letters {

    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a word or a phrase"); //Prompt the user to input a phrase to be reversed

        String userInput = scannerObject.nextLine();  // Read user input
        System.out.println("Your entered : " + userInput);//Display to the user, what was entered
        scannerObject.close();

        //Manipulate the user input.
        int inputCharacterLength = userInput.length();
        int inputCharacterGrouping = 4;

        if(inputCharacterLength<inputCharacterGrouping){
            System.out.println(" Your phrase has less that Four Characters, no reversing.");
            //The logic is aborted if the user inputs a string with less than four characters.
        }else {
            System.out.println("Input reversed as : "+reverseStringCharacter(
                    userInput,
                    inputCharacterGrouping,
                    inputCharacterLength)
            );
        }
    }


    //Function to manipulate the string , grouping them into four subsets.
    static String reverseStringCharacter(String s, int numberOfCharGrouping, int stringLength)
    {
        for (int i = 0; i < s.length();)
        {
            if (i + numberOfCharGrouping > stringLength)
                break;

            s = s.substring(0, i)
                    +
                    new String(
                            new StringBuilder(s.substring(i, i + numberOfCharGrouping))
                                    .reverse())
                    + s.substring(i + numberOfCharGrouping);
            i += 2 * numberOfCharGrouping;

		//The code here, groups the chacaters int ot defined number of strings groups
		//The first group is reversed, then the function loops to see if there any any pats of the string that are remaingin
		//This is done by adding 2 * numberOfCharGrouping, in a loop, untill the string is fully modidified.

        }
        return s;
    }
}
