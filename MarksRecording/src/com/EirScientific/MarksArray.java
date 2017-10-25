package com.EirScientific;

import java.util.Arrays;

public class MarksArray {
    private int[] marks;
    private int array_length;

    public MarksArray(int[] marks) {
        this.marks = marks;
        this.array_length = marks.length;
    }

    public int get(int index)
    {
        if (index >= 0 && index < array_length)
        {
            return marks[index];
        }
        else
        {
            return -1;
        }
    }
    public int sizeof()
    {
        return array_length;
    }

    public void put(int index, int value)
    {
        if (index >= 0 && index < array_length)
        {
            marks[index] = value;
        }
    }

    public void append(int value)
    {
        int[] new_array = new int[array_length+1];
        for (int i=0; i<array_length; i++)
        {
            new_array[i] = marks[i];
        }
        new_array[array_length] = value;
        marks = new_array;
        array_length = marks.length;
    }

    public void listMarks()
    {
        for (int mark : marks)
        {
            System.out.println(Integer.toString(mark));
        }
    }

    @Override
    public String toString() {
        return "MarksArray{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }
}
