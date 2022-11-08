package com.company;

import java.util.Scanner;


public class Main
{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please select word");
        String word = input.nextLine();

        System.out.println("and a number");
        int num = input.nextInt();

        showChar(word,num);

    }

    public static void showChar(String s, int i){

        char ch = s.charAt(i);
        System.out.println(ch);

    }
}