package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int numberOne = 20;
        double numberTwo = 20;
        System.out.printf("%f", numberOne);
        System.out.printf("%d", numberTwo);

        /* Fejlen i "System.out.printf("%f", numberOne);", skyldes at "%f" bruges til at vise "double" værdier.
           Fejlen i "System.out.printf("%d", numberTwo);", skyldes af "%d" bruges til at vise "Int" værdier. */
    }
}
