package com.company;

public class Calculator {
    private int C;
    private long a;
    private long b;
    private long n;
    private long m;
    private int result=0;
    public Calculator( int c, long a, long b, long n, long m) {
        C = c;
        this.a = a;
        this.b = b;
        this.n = n;
        this.m = m;
    }

    public int calculator() throws ArithmeticException,NullPointerException, NumberFormatException {


        if (n < a || m < b || a < 0 || b < 0 || n < 0 || m < 0) {
            return result;
        } else if ( a > -C || n < -C) {

            for (long i =  a; i <=  n; i++) {

                int num = (int) (i * C);
                for (long j =  b; j <= m; j++) {
                    if (num == 0){
                        throw new ArithmeticException("a=0 or C=0  division by 0 is prohibited  ");
                    }
                    result += (long) ((i - j) / num);
                }
            }
            return result;
        } else {
            throw new NumberFormatException();
        }

    }
}
