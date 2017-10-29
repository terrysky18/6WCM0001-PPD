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
        System.out.print("marks=[");
        for (int i=0; i<array_length; i++)
        {
            System.out.print(Integer.toString(marks[i]));
            if (i < array_length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public String assessMark(int mark)
    {
        String score = "";
        if (mark >= 75) { score = "DISTINCTION"; }
        else if (mark < 75 && mark >=45) { score = "PASS"; }
        else { score = "FAIL"; }
        return score;
    }

    public void assessMarks()
    {
        System.out.print("assessment=[");
        for (int i=0; i<array_length; i++)
        {
            System.out.print(assessMark(marks[i]));
            if (i < array_length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int meanMark()
    {
        int average = 0;
        for (int mark : marks)
        {
            average += mark;
        }
        average = average / array_length;
        return average;
    }

    public int[] aboveAverage()
    {
        int my_average = meanMark();
        int totalAbove = 0;
        for (int mark : marks)
        {
            if (mark > my_average) { totalAbove++; }
        }
        int[] allAbove = new int[totalAbove];
        int index = 0;
        for (int mark : marks)
        {
            if (mark > my_average)
            {
                allAbove[index] = mark;
                index++;
            }
        }
        return allAbove;
    }

    public void printAboveAverage()
    {
        int[] aboveAverageList = aboveAverage();
        int list_length = aboveAverageList.length;
        System.out.print("Above average=[");
        for (int i=0; i<list_length; i++)
        {
            System.out.print(Integer.toString(aboveAverageList[i]));
            if (i < list_length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int numberOfPasses()
    {
        /* default passing mark is 45, no parameter is used */
        int total_passes = 0;
        for (int mark : marks)
        {
            if (mark >= 45) { total_passes++; }
        }
        return total_passes;
    }

    public int numberOfPasses(int threshold)
    {
        int total_passes = 0;
        for (int mark : marks)
        {
            if (mark >= threshold) { total_passes++; }
        }
        return total_passes;
    }

    public int highestMark()
    {
        int highestSoFar = -1;
        for (int mark : marks)
        {
            if (highestSoFar < mark) { highestSoFar = mark; }
        }
        return highestSoFar;
    }

    public int lowestMark()
    {
        int lowestSoFar = 1000;
        for (int mark : marks)
        {
            if (lowestSoFar > mark) { lowestSoFar = mark; }
        }
        return lowestSoFar;
    }

    public int getRange()
    {
        return highestMark() - lowestMark();
    }

    public int bestStudent()
    {
        int best_index;
        int best_mark = highestMark();
        for (best_index=0; best_index<array_length; best_index++)
        {
            if (marks[best_index] == best_mark) { break; }
        }
        return best_index;
    }

    @Override
    public String toString() {
        return "MarksArray{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }
}
