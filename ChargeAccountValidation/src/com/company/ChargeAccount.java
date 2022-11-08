package com.company;

import java.util.ArrayList;

public class ChargeAccount {
   private static ArrayList<Integer> account = new ArrayList<Integer>();

    public ChargeAccount(){
        account.add(321);
        account.add(123);
    }

    public static boolean getNumber(int ac){


        for(int i = 0; i < account.size(); i++) {
            if (ac == account.get(i))
                return true;
        }
        return false;

        }

    }




