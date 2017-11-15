package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        int a = -1;
        int b = 12;
        Challenger my_solution = new Challenger(a, b);
        my_solution.printNumber();

        System.out.println();
        a = 3;
        b = 3;
        Challenger my_solution2 = new Challenger(a, b);
        my_solution2.printNumber();
    }
}
