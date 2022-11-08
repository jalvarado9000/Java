package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String foo = "cabron accion pajacion filtracion titereo te doy con la full";
        String bar[] = foo.split(" ");

        char word = 'a';

        for(int i = 0; i < bar.length; i++){

            for(int x = 0; x < bar[i].length(); x++)
            if(word == bar[i].charAt(x)){
                System.out.println(bar[i]);
                x = bar[i].length();
            }

        }


    }
}
