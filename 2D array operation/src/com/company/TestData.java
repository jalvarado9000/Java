package com.company;

import org.jetbrains.annotations.NotNull;

public class TestData {
    private int total = 0;
    private int average = 0;
    private int row_total = 0;
    private int column_total = 0;
    private int highest_row = 0;
    private int lowest_row = 0;


    public int getTotal(int arr[][]){

        for(int x = 0; x < arr.length;x++){

            for(int y = 0; y < arr.length; y++){
                total+=arr[x][y];
            }
        }
        return total;

    }

    public int getAverage(int arr[][]){

        int temp = 0;
        int avrg = arr.length* arr.length;
        for(int x = 0; x < arr.length;x++){

            for(int y = 0; y < arr.length; y++){
                temp+=arr[x][y];
            }
        }
        average = temp/avrg;
        return average;

    }

    public int getTotalRow(int arr[][],int script){

        for(int x = script, y = 0 ; y < arr.length;y++) {
            row_total += arr[x][y];
        }
        return row_total;

    }

    public int getTotalColumn(int arr[][], int script){

        for(int x = 0, y = script; x < arr.length;x++) {
            column_total += arr[x][y];
        }
        return column_total;

    }

    public int getHighestRow(int arr[][],int script){


        for(int x = script, y = 0 ; y < arr.length;y++) {
            if(highest_row  < arr[x][y] )
                highest_row = arr[x][y];
        }
        return highest_row;


    }

    public int getLowestRow(int arr[][],int script){
            lowest_row = arr[script][0];
        for(int x = script, y = 0 ; y < arr.length;y++) {
            if(lowest_row  > arr[x][y])
                lowest_row = arr[x][y];
        }
        return lowest_row;

}

    }
