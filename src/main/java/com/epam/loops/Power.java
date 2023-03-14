package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int num = numberToPrint;
        while (--power > 0)
            numberToPrint *= num;
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
