package com.EirScientific;

public class Main {

    public static void main(String[] args) {
        int[] my_marks = {12, 45, 34, 78, 55, 63};
        MarksArray csm1 = new MarksArray(my_marks);

        System.out.println(csm1.sizeof());
        System.out.println(csm1);

        System.out.println(csm1.get(0));
        System.out.println(csm1.get(4));
        System.out.println(csm1.get(9));

        csm1.append(108);
        csm1.listMarks();
    }
}
