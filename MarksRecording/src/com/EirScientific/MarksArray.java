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
    }
    public int length()
    {
        return array_length;
    }

    @Override
    public String toString() {
        return "MarksArray{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }
}
