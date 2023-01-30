package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat(); 
        output("Blick von aussen: " + cat);
        output(cat.tellYourAddress());

        output("-------------------------");

        Cat cat2 = new Cat();
        output("Blick von aussen: " + cat2);
        output(cat2.tellYourAddress());

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

