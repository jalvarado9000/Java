/*
In a program, write a method that accepts two arguments: an array and a number n. Assume
that the array contains integers. The method should display all of the numbers in the array
that are greater than the number n.
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int array[] = {1,3,5,7,9};
        System.out.println("what is the number you think is bigger than numbers in the array");
        int selection = input.nextInt();

        Display(array,selection);




    }

    public static void Display(int[] arr, int n){

        for(int i =0; i < arr.length; i++){
            if(n < arr[i])
                System.out.println(arr[i]);
        }



    }


}
