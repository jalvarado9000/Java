/*
A teacher has five students who have taken four tests. The teacher uses the following grading
scale to assign a letter grade to a student, based on the average of his or her four test scores:
Test Score
Letter Grade
90–100 A 80–89 B 70–79 C 60–69 D 0–59 F
Write a class that uses a String array or an ArrayList object to hold the five students’ names,
an array of five characters to hold the five students’ letter grades, and five arrays of four
doubles each to hold each student’s set of test scores. The class should have methods that
return a specific student’s name, the average test score, and a letter grade based on the average.
Demonstrate the class in a program that allows the user to enter each student’s name and his
or her four test scores. It should then display each student’s average test score and letter grade.
Input Validation: Do not accept test scores less than zero or greater than 100.
 */

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Grading student1 = new Grading();
        Grading student2 = new Grading();



        ArrayList<Grading> list = new ArrayList<Grading>();

        list.add(student1);
        list.add(student2);




        for(int i = 0; i < 2; i++) {
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).average_score());
            System.out.println(list.get(i).average_grade());
            System.out.println(Arrays.toString(list.get(i).getScore_test()));
            System.out.println(list.get(i).getLetter_grade());


        }




    }
}
