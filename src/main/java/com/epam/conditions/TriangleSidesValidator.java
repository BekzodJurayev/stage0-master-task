package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0){
            System.out.println("it's not a triangle");
            return;
        }
        if(firstSide + secondSide <= thirdSide
                || secondSide + thirdSide <= firstSide
                || firstSide + thirdSide <= secondSide){
            System.out.println("it's not a triangle");
            return;
        }
        System.out.println("this is a valid triangle");
    }

}
