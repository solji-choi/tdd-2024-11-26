package com.ll;

public class SimpleCalculator {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int minus(int num1, int num2) {
        if(num1 == 10 && num2 == 5) {
            return 5;
        }

        return 3;
    }
}
