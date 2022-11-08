package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 0;

        result = jump(8, 3);
        System.out.println(result);


    }


    public static int jump(int flagHeigth, int bigJump) {

        int cal = flagHeigth / bigJump;

        if (flagHeigth <= 0 || bigJump <= 0)
            return 0;
        else if (flagHeigth == bigJump)
            return 1;
        else {

                cal = cal + (flagHeigth % bigJump);
                if(flagHeigth < bigJump)
                    return cal++;

                return cal;

        }

    }
}
