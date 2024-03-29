/*
10. Lottery Application
Write a Lottery class that simulates a lottery. The class should have an array of five integers
named lotteryNumbers. The constructor should use the Random class (from the Java API) to
generate a random number in the range of 0 through 9 for each element in the array. The
class should also have a method that accepts an array of five integers that represent a per-
son’s lottery picks. The method is to compare the corresponding elements in the two arrays
and return the number of digits that match. For example, the following shows the
lotteryNumbers array and the user’s array with sample numbers stored in each. There are
two matching digits (elements 2 and 4).
lotteryNumbers array:
7 4 9 1 3
User’s array:
4 2 9 7 3
In addition, the class should have a method that returns a copy of the lotteryNumbers array.
Demonstrate the class in a program that asks the user to enter five numbers. The program
should display the number of digits that match the randomly generated lottery numbers. If
all of the digits match, display a message proclaiming the user a grand prize winner.
 */

package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Lottery results = new Lottery();
        int userPicks[] = {1,2,3,4,5};



        System.out.println("these are the numbers that match " + results.sameNumbers(userPicks));
        System.out.println("the Winning numbers are: " + Arrays.toString(results.WinningNumbers()));



    }
}
