package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {




        int gradeBook = 1323;
        int C5 = gradeBook%5;
        int C7 = gradeBook%7; // double
        int C11 = gradeBook%11; // 3 Обчислити суму найбільших елементів кожного рядка матриці
        double [][] A ={{1,2,3,4},
                {5,6,7,8}};

        double [][] B ={{1,2,3,4},
                {5,6,7,8}};

        Matrix m = new Matrix();

        System.out.println("C5="+C5+", C7="+ C7+", C11="+C11);

        try {
            System.out.println("Result: "+ Arrays.deepToString(m.directSum(A,B)));
            System.out.println("MaxElemSum : " + m.getMaxRowSum());
        }catch (NumberFormatException e){
            System.out.println( e.getMessage());
        }

    }
}
