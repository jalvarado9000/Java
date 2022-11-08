package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
        boolean moreDesserts = true;

        HashMap<String, Integer> mDessertCount = new HashMap<String, Integer>();//the default constructor
        //HashMap<String, Integer> mDessertCount2 = new HashMap<String, Integer>(10);//the constructor with capacity
        //HashMap<String, Integer> mDessertCount3 = new HashMap<String, Integer>(10,0.5f);//the constructor with capacity and load factor.
        //HashMap<String, Integer> mDessertCount4 = new HashMap<String, Integer>(mDessertCount3);//makes a copy of another hashmap



        do{

            System.out.println("Please enter your favorite dessert ");
            String dessert = scan.nextLine().toUpperCase();


            if(!mDessertCount.containsKey(dessert))
                mDessertCount.put(dessert,1);
            else {
                int updatedCount = mDessertCount.get(dessert) + 1;
                mDessertCount.put(dessert, updatedCount);
            }





            System.out.println("More desserts (Enter 'Y' or 'N'): ");
            moreDesserts = scan.nextLine().toUpperCase().charAt(0) == 'Y';


        }while(moreDesserts);

        System.out.println("\nAll Dessert: ");
        for(String dessert : mDessertCount.keySet()){
            System.out.printf(dessert, mDessertCount.get(dessert));

        }


    }
}
