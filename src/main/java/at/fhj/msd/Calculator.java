/*
 * msd21_schweighofer_andreas
 * Class for calculating
 * Author:       Andreas Schweighofer
 * Last Change:  06.04.2022
 */

package at.fhj.msd;

public class Calculator {

    public Calculator() {
    }

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    public int factorial(int num) {
        if (num < 0)
            return 0;
        else if (num == 0 || num == 1)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
