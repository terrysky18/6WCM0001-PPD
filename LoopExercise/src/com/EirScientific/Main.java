package com.EirScientific;

public class Main {

    public static void main(String[] args) {
	    LoopExercise my_loop = new LoopExercise();

	    my_loop.printRange(18);
	    my_loop.printRange(5, 15);
	    my_loop.printRange(21, 3);
	    my_loop.printRange(3, 3);

	    my_loop.printRangeSum(2, 8);
	    my_loop.printRangeSum(10, 4);
	    my_loop.printRangeSum(108, 108);

	    my_loop.printPattern(4);
	    my_loop.printPattern(12);
	    my_loop.printPattern(-3);
    }
}
