package com.EirScientific;

public class Challenger {
    private int x;
    private int y;

    public Challenger() {
        this.x = 0;
        this.y = 0;
    }

    public Challenger(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printNumber()
    {
        for (int i=getMin(); i<=getMax(); i++)
        {
            System.out.println(i);
        }
    }

    private int getMin()
    {
        if (x < y) { return x; }
        else { return y; }
    }

    private int getMax()
    {
        if (x > y) { return x; }
        else { return y; }
    }
}
