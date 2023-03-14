package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res = 0;

        int x = (int) Math.log10(number);
        while (x >= 0) {
            res += (number % 10) * Math.pow(10, x--);
            number /= 10;
        }
        System.out.println(res);
    }

}
