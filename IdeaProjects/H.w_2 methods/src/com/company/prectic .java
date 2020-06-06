package com.company;
class hw2method {  //Java Program to demonstrate the use of static variable
    static int ans;
    static int a = 1, b = 5, c = 10, d = 20, e = a+b, f = c*b; //static global variable

    static void add( ) { //no return type , no parameter
     ans = d+c; // printout the ans value for addition
        System.out.println("Addition result of "+d+ "+" +c+ " = " +ans); // display the sprint
    }
    static void sub(){
     ans = a-b; // printout the ans value for subtraction
        System.out.println("Subtraction of " +a+ "-" +b+ " = " +ans); // string concatination
    }
    static void multip() { // no return type , no parameters
        System.out.println("Multiphication of 10*5 = " + f); // display the sprint
    }
    static void division(){ //no return type , no parameters
        System.out.println(c + "/"+ b+ "= " + (c/b)); //display the sprint
    }
    static void remirde(){ //no return type , no parameters
        System.out.println(d + " % "+ c+ " = " +(d %c)); // string concatination
    }
    public static void main(String[] args) {
        add();
        sub();
        multip();
        division();
        remirde();
    }
}

