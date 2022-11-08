package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Long> numbers = new ArrayList<>();
        numbers.add(2L);
        numbers.add(8L);
        numbers.add(4L);
        numbers.add(6L);
        numbers.add(5L);
        //numbers.add(8L);
        System.out.println(doubleSize(numbers,2));






    }

    public static long doubleSize(List<Long> arr, long b){
        if(b < 0 || b >  Math.pow(10,4) || arr.size() < 0 || arr.size() >  Math.pow(10,6))
            return b;

        Collections.sort(arr);
        System.out.println(arr);
        for(int i = 0; i < arr.size(); i++) {
            if (b == arr.get(i))
                b*=2;
            else if(arr.get(i) > Math.pow(10,16) || arr.get(i) < 0)
                return b;



        }

        return b;

    }


}
