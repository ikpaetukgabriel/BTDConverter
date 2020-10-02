package com.gabrielikpaetuk;
import java.util.ArrayList; //Imports Array class
import java.util.Scanner; //Imports Scanner class


public class Main {

    //Handles the conversion to decimal
    public int BinaryToDecimal(String strNumber ) {

        //Creates a new character ArrayList
        ArrayList <Character> initialList = new ArrayList <Character>();

        //Creates a new integer ArrayList
        ArrayList<Integer> finalList = new ArrayList<>();

        //Converts to an ArrayList
        char[] charNumber = strNumber.toCharArray();

        //Loops through each character in charNumber and adds it initialList
        for (char i : charNumber){
            initialList.add(i);
        }
        //Finds the size in integer of initialList and assigns it the variable power
        int power = initialList.size();

        //Loops through each character in initialList
        for (char j : initialList){
            int num = Integer.parseInt(String.valueOf(j));
            power -= 1;
            int finalNum = ((int) Math.pow(2,power)*num);

            //Adds the result of finalNum to finalList
            finalList.add(finalNum);
        }
        //Sums up the integer values in finalList
        int sum = 0;
        for (int k : finalList){
            sum += k;
        }
        //Returns the sum of the numbers
        return sum;

    }
    public static void main(String[] args){
        //Creates a new scanner
        Scanner input = new Scanner(System.in);

        //Prints the welcome message
        System.out.println("Welcome, this is a binary to decimal converter.");
        System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
        //Gets the user input
        int response = input.nextInt();

        //Loops through until the user quits
        while (true) {
            if (response != 0 && response != 1){
                System.out.println("Invalid Entry.");
                System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
                response = input.nextInt();
            }

            //Checks if the user wants to continue with the calculation
            if (response == 1){
                System.out.print("Enter Binary number to be converted: ");
                String strNumber = input.next();

                Main obj = new Main();
                System.out.println("Answer --> " + obj.BinaryToDecimal(strNumber));

                System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
                response = input.nextInt();

            } else if (response == 0) { //Checks if the user wants to quit,
                //If yes, prints a good bye message
                System.out.print("Goodbye!!!");
                break;
            }
        }
    }
}
