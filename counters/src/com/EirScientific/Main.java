package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        Counter my_counter = new Counter();
        Counter her_counter = new Counter();

        for (int i=0; i<5; i++)
        {
            my_counter.increment();
            her_counter.decrement();
        }
        System.out.println(my_counter.getCount());
        System.out.println(her_counter.getCount());
    }
}
