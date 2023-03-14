package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0){
            for (int i = 1; i <= cathetusLength; i++) {
                for (int j = cathetusLength; j >= 1; j--)
                    if(j <= i)
                        System.out.print(j);
                    else System.out.print(" ");
                for (int j = 2; j <= cathetusLength; j++) {
                    if(j <= i)
                        System.out.print(j);
                }
                System.out.println();
            }
        } else
            System.out.print("");
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
