/*
 * msd21_schweighofer_andreas
 * Class for calculating
 * Author:       Andreas Schweighofer
 * Last Change:  06.04.2022
 */

package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger();
    public Calculator() {
    }

    public double add(double number1, double number2) {
        logger.debug("Parameter 1: " + number1 + " | Parameter2: " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Parameter 1: " + number1 + " | Parameter2: " + number2);
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        logger.debug("Parameter 1: " + number1 + " | Parameter2: " + number2);
        return number1 * number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException {
        if (number2 != 0)
            return number1 / number2;
        else {
            logger.error("Division by zero");
            throw new ArithmeticException();
        }
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
