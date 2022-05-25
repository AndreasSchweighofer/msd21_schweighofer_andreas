/*
 * msd21_schweighofer_andreas
 * Main-Class
 * Author:       Andreas Schweighofer
 * Last Change:  06.04.2022
 */

package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main Class
 * @author andreasschweighofer
 */
public class Main {
    /**
     * Logger
     */
    private static Logger logger = LogManager.getLogger();

    /**
     * Main Method
     * @param args arguments
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3,2));
        System.out.println(calc.minus(3,2));
        System.out.println(calc.multiply(3,2));
        System.out.println(calc.divide(3,2));

        System.out.println("-------------------------------");

        logger.info("Hello info logger.");
        logger.error("Hello error logger.");
    }
}
