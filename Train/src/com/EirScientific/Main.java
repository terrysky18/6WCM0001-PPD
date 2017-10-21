package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        String train1_destination = "Edinburgh";
        int train1_number = 2;
        int train1_capacity = 205;
        Train train1 = new Train(train1_destination,
                                train1_number, train1_capacity);

        System.out.println(train1);

        String train2_destination = "London";
        int train2_number = 1;
        int train2_capacity = 210;
        int train2_ticket = 62;
        Train train2 = new Train(train2_destination, train2_number,
                            train2_capacity, train2_ticket, "Sean Potter", 1358);

        System.out.println(train2);
    }
}
