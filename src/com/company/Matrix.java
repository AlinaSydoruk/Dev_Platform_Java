package com.company;

public class Matrix {
    public double getMaxRowSum() {
        return maxRowSum;
    }

    private double maxRowSum= 0;
    public double[][] directSum(double[][] A, double[][] B){
        double[][] result = new double[Math.max(A.length , B.length)][Math.max(A[0].length , B[0].length)];

double maxNum = Double.MIN_VALUE;
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[0].length; j++) {

                        double valA = (i < A.length && j < A[0].length) ? A[i][j] : 0.0;
                        double valB = (i < B.length && j < B[0].length) ? B[i][j] : 0.0;
                        result[i][j] = valA + valB;

                        maxNum =  Math.max(result[i][j],maxNum);
                    }
                    maxRowSum += maxNum;
                    maxNum = Double.MIN_VALUE;
                }

        return result;
    }
}
