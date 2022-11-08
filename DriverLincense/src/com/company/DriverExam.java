package com.company;
import java.util.Scanner;

public class DriverExam {

    private char answers[] = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
    private char selection[] = new char[20];
    private int missed[] = new int[20];
    private int correct = 0;
    private int incorrect = 0;

    public void Question(){
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean flag = false;
        for(int i = 0; i < answers.length; i++){
            do {
                System.out.println("Question #" + (i + 1) + " answer");
                char c = input.nextLine().toUpperCase().charAt(0);
                if (c < 'E') {
                    selection[i] = c;
                    flag = false;
                }
                else
                    flag = true;
            }while(flag);

            if(selection[i] == answers[i])
                correct++;
            else{
                SetquestionsMissed(x,i+1);
                x++;
            }

        }


    }


    public boolean pass(){
        if(correct < 15)
            return false;
        else
            return true;

    }


    public int totalCorrect(){
        return correct;
    }

    public int totalIncorrect(){
        incorrect = 20 - correct;
        return incorrect;
    }

    public void SetquestionsMissed(int x,int i){
        missed[x] = i;
    }

    public void GetquestionsMissed() {
        for (int i = 0; i < incorrect; i++) {
            System.out.print(missed[i]);
            System.out.print(". ");
        }
    }



}
