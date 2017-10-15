package com.EirScientific;

public class LoopExercise {

    public LoopExercise()
    {
        // empty class constructor
    }

    public void printRange(int value)
    {
        System.out.println("[" + Integer.toString(value) + "]\n");
    }

    public void printRange(int value1, int value2)
    {
        System.out.print("[");
        if (value1 < value2)
        {
            for (int i=value1; i<=value2; i++)
            {
                printElement(i, value2);
            }
        }
        else if (value1 > value2)
        {
            for (int i=value1; i>=value2; i--)
            {
                printElement(i, value2);
            }
        }
        else
        {
            System.out.print(value1);
        }
        System.out.print("]\n");
    }

    public void printRangeSum(int value1, int value2)
    {
        int range_sum = 0;
        if (value1 < value2)
        {
            for (int i=value1; i<=value2; i++)
            {
                range_sum = addAndPrintElement(range_sum, i, value2);
            }
        }
        else if (value1 > value2)
        {
            for (int i=value1; i>=value2; i--)
            {
                range_sum = addAndPrintElement(range_sum, i, value2);
            }
        }
        else
        {
            System.out.print(value1);
            range_sum = range_sum + value1;
        }
        System.out.print(" = " + Integer.toString(range_sum) + "\n");
    }

    private void printElement(int elem, int end_elem)
    {
        System.out.print(Integer.toString(elem));
        if (elem != end_elem)
        {
            System.out.print(", ");
        }
    }

    private int addAndPrintElement(int my_sum, int elem, int end_elem)
    {
        System.out.print(Integer.toString(elem));
        my_sum = my_sum + elem;
        if (elem!=end_elem)
        {
            System.out.print(" + ");
        }
        return my_sum;
    }

    public void printPattern(int num_row)
    {
        if (num_row > 0)
        {
            for (int i=1; i<=num_row; i++)
            {
                for (int j=0; j<i; j++)
                {
                    System.out.print("x");
                }
                System.out.print("\n");
            }
        }
    }
}
