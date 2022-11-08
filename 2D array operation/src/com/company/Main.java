/*
16. 2D Array operations
Write a program that creates a two-dimensional array initialized with test data. Use any
primitive data type that you wish. The program should have the following methods:
• getTotal. This method should accept a two-dimensional array as its argument and
return the total of all the values in the array.
• getAverage. This method should accept a two-dimensional array as its argument and
return the average of all the values in the array.
• getRowTotal. This method should accept a two-dimensional array as its first argu-
ment and an integer as its second argument. The second argument should be the sub-
script of a row in the array. The method should return the total of the values in the
specified row.
• getColumnTotal. This method should accept a two-dimensional array as its first argu-
ment and an integer as its second argument. The second argument should be the sub-
script of a column in the array. The method should return the total of the values in the
specified column.
• getHighestInRow. This method should accept a two-dimensional array as its first
argument and an integer as its second argument. The second argument should be the
subscript of a row in the array. The method should return the highest value in the
specified row of the array.
• getLowestInRow. This method should accept a two-dimensional array as its first argu-
ment and an integer as its second argument. The second argument should be the sub-
script of a row in the array. The method should return the lowest value in the specified
row of the array.
Demonstrate each of the methods in this program.
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] numbers =
                        {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        Scanner input = new Scanner(System.in);

        System.out.println("Select a number and i will tell you facts about the 2D Array");
        int num = input.nextInt();

        TestData test = new TestData();
        System.out.println("the total of numbers of the array is: " + test.getTotal(numbers));
        System.out.println("the average number of the array is: " + test.getAverage(numbers));
        System.out.println("the total of row #" + num + " is: " + test.getTotalRow(numbers,num));
        System.out.println("the total of column #" + num + " is: " + test.getTotalColumn(numbers,num));
        System.out.println("the highest number in row # " + num + " is: " + test.getHighestRow(numbers,num));
        System.out.println("the lowest number in row # " + num + " is: " + test.getLowestRow(numbers,num));


    }
}
