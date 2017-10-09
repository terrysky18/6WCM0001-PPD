package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        String train1_destination = "Edinburgh";
        int train1_number = 2;
        int train1_capacity = 205;
        Train train1 = new Train(train1_destination,
                                train1_number, train1_capacity);

        System.out.println(train1);
    }
}
