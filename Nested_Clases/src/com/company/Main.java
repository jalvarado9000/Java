package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        in.Greetig();

    }
}
