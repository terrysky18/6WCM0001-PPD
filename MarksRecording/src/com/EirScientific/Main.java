package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        int[] my_marks = {12, 45, 34, 78, 55, 63};
        MarksArray csm1 = new MarksArray(my_marks);

        System.out.println(csm1.sizeof());
        csm1.listMarks();
        csm1.assessMarks();
        System.out.println("Mean mark = " + Integer.toString(csm1.meanMark()));
        int[] temp1 = csm1.aboveAverage();
        csm1.printAboveAverage();

        System.out.println(csm1.get(0));
        System.out.println(csm1.get(4));
        System.out.println(csm1.get(9));

        csm1.append(108);
        csm1.listMarks();
        csm1.assessMarks();

        System.out.println("Mean mark = " + Integer.toString(csm1.meanMark()));
        csm1.printAboveAverage();

        csm1.append(75);
        csm1.listMarks();
        csm1.assessMarks();

        System.out.println("Mean mark = " + Integer.toString(csm1.meanMark()));
        csm1.printAboveAverage();

        csm1.put(3, 101);
        csm1.put(5, 13);
        csm1.listMarks();
        csm1.assessMarks();

        System.out.println("Mean mark = " + Integer.toString(csm1.meanMark()));

        int[] my_marks2 = {31, 32, 33, 34, 35, 36};
        MarksArray csm2 = new MarksArray(my_marks2);
        System.out.println("Mean mark = " + Integer.toString(csm2.meanMark()));
        csm2.printAboveAverage();

        System.out.println("All above 45:  " + Integer.toString(csm1.numberOfPasses()));
        System.out.println("Total passes = " + Integer.toString(csm1.numberOfPasses(100)));
        System.out.println("Total passes = " + Integer.toString(csm2.numberOfPasses(35)));

        System.out.println("Highest mark = " + Integer.toString(csm1.highestMark()));
        System.out.println("Lowest mark = " + Integer.toString(csm1.lowestMark()));

        System.out.println(Integer.toString(csm1.getRange()));
        System.out.println(Integer.toString(csm1.bestStudent()));
    }
}
