package com.company;

import java.util.Scanner;


public class class7{
    public static String name = "priya";
    double ans;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("please enter your age:");
        int age = scanner.nextInt();

        if(age >=18)
        {
            System.out.println("you are eligible to vote");
        }else
            {
             System.out.println("you are not eligible to vote");
            }

    }



}
