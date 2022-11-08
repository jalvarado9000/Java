package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    private int size = 5;
    private int[] lotteryNumbers = new int[size];

    public Lottery(){
        Random randomNumbers = new Random();
        for(int i = 0; i < size; i++) {
            int number = randomNumbers.nextInt(10);
            lotteryNumbers[i] = number;
        }
    }

    public ArrayList<Integer> sameNumbers(int[] arr){
        ArrayList<Integer> matching = new ArrayList<>();
        for(int i = 0; i < size; i++){
            if(arr[i] == lotteryNumbers[i])
                matching.add(arr[i]);
        }
        return matching;
    }

    public int getSize() {
        return size;
    }

    public int[] WinningNumbers(){
        int copy[] = new int[size];
        for(int i = 0; i < size; i++){
            copy[i] = lotteryNumbers[i];
        }
        return lotteryNumbers;


    }




}
