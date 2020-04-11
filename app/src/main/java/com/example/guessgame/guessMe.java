package com.example.guessgame;

import java.lang.*;
import java.util.Random;
import java.util.Scanner;


public class guessMe {
    public static void main(String[] args) {
        System.out.println("Hello , What is your name : ");
        Scanner username =new Scanner (System.in);
        String usernameString= username.nextLine();

        Scanner usernum;
        int  usernumVal;
        boolean win=false;



        int myRandomNum=new Random().nextInt(20)+1;

        System.out.println("myRandomNum is "+myRandomNum);
        for(int i=1;i<5;i++) {
            if(!(win)) {

                System.out.println("try num :" + i + " guess number :");
                usernum = new Scanner(System.in);
                usernumVal = Integer.parseInt(username.nextLine());
                // System.out.println("done "+ usernumVal);
                if (usernumVal > myRandomNum) {
                    System.out.println("opps  ,  guess num smaller ");

                } else if (usernumVal < myRandomNum) {
                    System.out.println("opps  ,  guess num bigger ");

                } else {
                    System.out.println("waaaaw, congrates you are the winner ");
                    win = true;

                }
            }

        }

        if(!(win)){
            System.out.println("game over,    you lost   ");


        }
        System.out.println("**************End game***************");

    }
}
