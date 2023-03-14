package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int k = 1;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if(j >= cathetusLength - k)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
            k++;
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
