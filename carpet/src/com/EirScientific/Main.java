package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        int desired_width = 5;
        String choice_description = "An oriental carpet with exotic patterns; made from Assyrian fabrics";
        Carpet my_carpet = new Carpet(choice_description, desired_width);

        System.out.println(my_carpet);
        double my_cost = my_carpet.getBill(22);
        System.out.println("My carpet bill:  " + my_cost);

        int other_width = 9;
        String other_description = "An Medival European theme carpet; made from Italian fabrics";
        double other_price = 12.99;
        Carpet other_carpet = new Carpet(other_description, other_width, other_price);

        System.out.println(other_carpet);
        double other_cost = other_carpet.getBill(20.5);
        System.out.println("Other carpet choice:  " + other_cost);
    }
}
