package com.EirScientific;

public class FuzzBuzzer {
    public FuzzBuzzer() {
    }

    public void printNumber(int num_param)
    {
        if (divideBy3(num_param) && divideBy5(num_param) && num_param!=0)
        {
            System.out.println("FuzzBuzz");
        }
        else if (divideBy3(num_param) && num_param!=0)
        {
            System.out.println("Fuzz");
        }
        else if (divideBy5(num_param) && num_param!=0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(num_param);
        }
    }

    private boolean divideBy3(int num_param)
    {
        return num_param % 3 == 0;
    }

    private boolean divideBy5(int num_param)
    {
        return num_param % 5 == 0;
    }
}
