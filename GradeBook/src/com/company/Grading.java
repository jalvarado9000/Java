package com.company;
import java.util.Scanner;

public class Grading {
    private String name;
    private int s = 2;
    private char letter_grade[] = new char[s];
    private double score_test[] = new double[s];
    private double total_score = 0;
    private double average_num = 0;
    private char average_char = ' ';


    public Grading(){
        Scanner input = new Scanner(System.in);
        System.out.println("what is the name of student");
        name = input.nextLine();

        for(int i = 0; i < s; i++) {
            System.out.println("what is the grade of the student");
            char c = input.nextLine().toUpperCase().charAt(0);
            letter_grade[i] = c;
        }
        for(int i = 0; i < s; i++) {
            System.out.println("what is the score of the student");
            double num = input.nextDouble();
            score_test[i] = num;
            System.out.println(score_test[i]);
            total_score+=num;

        }

    }

    public String getName() {
        return name;
    }

    public char[] getLetter_grade() {
        return letter_grade;
    }

    public double[] getScore_test() {
        return score_test;
    }

    public double average_score(){
       average_num = total_score/s;
       return average_num;
    }
    public char average_grade(){
        if(average_num >= 90)
            average_char = 'A';
        else if(average_num <=89 && average_num > 80)
            average_char = 'B';
        else if(average_num <=79 && average_num > 70)
            average_char = 'C';
        else if(average_num <=69 && average_num > 60)
            average_char = 'D';
        else
            average_char = 'F';

        return average_char;

    }

}
