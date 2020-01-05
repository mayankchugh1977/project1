package com.upgrad.hash;

import java.util.*;

class checkEmailInArray {
    public static void main(String[] args)
    {
        String[] emails = {"chandler.bing@xyz.com","ross.geller@xyz.com","rachel.greene@xyz.com","joey.tribbiani@xyz.com","monica.geller@xyz.com","phoebe.buffay@xyz.com","sheldon.copper@xyz.com","marie.george@xyz.com"};

        String NewEmail="monica.geller@xyz.com";


        //upgrad solution
        int i=0;

        for (String s: emails)
        {
            if(NewEmail == s)
                break;

            i++;
        }
        if(i==emails.length) System.out.println("-1");
        else System.out.println(i);


        // Write your code here
        boolean emailExistsYn = false;
        for(int j = 0; j < emails.length; j++){
            if(emails[j].equalsIgnoreCase(NewEmail)){
                emailExistsYn = true;
                System.out.println(j);
                break;
            }
        }

        if(!emailExistsYn){
            System.out.println("-1");
        }


    }
}
