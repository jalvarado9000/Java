package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
    //public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {








    public static void main(String[] args) {
	// write your code here

        List <Integer> listOne = new ArrayList<Integer>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);
        List <Integer> listTwo = new ArrayList<Integer>();
        listTwo.add(4);
        listTwo.add(5);
        listTwo.add(6);


        List<Integer> array = new ArrayList<Integer>();


        int sizeOne = listOne.size();
        int sizeTwo = listTwo.size();
        boolean isBigger = false;
        boolean isSame = false;
        int countdown = 0;


        if (sizeOne == sizeTwo) {
            countdown = (sizeOne) * 2;
            isSame = true;
        }
        else if (sizeOne < sizeTwo){
            countdown = (sizeOne) * 2;
        }
        else {
            countdown = (sizeTwo) * 2;
            isBigger = true;
        }

        int u = 0;
        for(int i = 0; i < countdown; i++) {
            if (i % 2 == 0 || i % 2 == 1) {
                if(i%2 == 0) {
                    array.add(listOne.get(u));
                }
                else
                    array.add(listTwo.get(u++));

            }



        }

        if(isBigger) {


            for (int i = u; i < listOne.size(); i++)
                array.add(listOne.get(i));
                System.out.println(array);
        }
        else if(isSame)
            System.out.println(array);
        else {
            for (int i = u ; i < listTwo.size(); i++)
                array.add(listTwo.get(i));
                System.out.println(array);
        }




















































/*
        if (sizeOne == sizeTwo) {
            countdown = sizeOne*2;
            isSame = true;
        }


        for(int i = 0,u = 0 ; i < countdown; i++) {
            if (i % 2 == 0 || i % 2 == 1) {
                if(i%2 == 0) {
                    array.add(listOne.get(u));
                }
                else
                    array.add(listTwo.get(u++));

                }



                }


        for(int i = 0; i < 6; i++)
            System.out.println(array.get(i));


*/
































    }
}
