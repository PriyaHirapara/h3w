package com.company;

class account {// define a student obj clss
 int a = 5; // globel instanc variable
 int b =4; // globel instanc variable
 int ans; // globel instanc variable
  public void add(){ // instance method
     ans = a + b;
     System.out.println(" addition of a+b = " + ans); // printingout addition of instance variable
 }
     public static void main(String[]args ){ // main method
         account acc = new account(); // creat object.
         acc.add(); //call method by help of object
     }
 }



