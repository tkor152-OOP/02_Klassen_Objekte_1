package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabella", "white", 29);

        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getAge()));  

        cat.setFurColor("grey");
        output(cat.getFurColor());

        output("-------------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);

        output(cat2.getName());
        output(cat2.getFurColor());
        output(String.valueOf(cat2.getAge())); 

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

