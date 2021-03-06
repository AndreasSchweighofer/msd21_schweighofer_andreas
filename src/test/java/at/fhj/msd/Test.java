package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test {
    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @org.junit.jupiter.api.Test
    public void testAdd10() {
        Assertions.assertEquals(10, calc.add(7, 3));
    }

    @org.junit.jupiter.api.Test
    public void testAdd15() {
        int result = 14 + 1;
        Assertions.assertEquals(result, calc.add(14, 1));
    }

    @org.junit.jupiter.api.Test
    public void testMinus17() {
        int result = 20 - 3;
        Assertions.assertEquals(result, calc.minus(20, 3));
    }

    @org.junit.jupiter.api.Test
    public void testMinus22() {
        Assertions.assertEquals(22, calc.minus(30, 8));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply0() {
        Assertions.assertEquals(0, calc.multiply(155, 0));
    }

    @org.junit.jupiter.api.Test
    public void testMultiply100() {
        int result = 10 * 10;
        Assertions.assertEquals(result, calc.multiply(10, 10));
    }

    @org.junit.jupiter.api.Test
    public void testDivide2() {
        Assertions.assertEquals(2, calc.divide(10, 5));
    }

    @org.junit.jupiter.api.Test
    public void testDivide20() {
        int result = 40 / 2;
        Assertions.assertEquals(result, calc.divide(40, 2));
    }

    @org.junit.jupiter.api.Test
    public void testDivide0() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
    }

    @org.junit.jupiter.api.Test
    public void testFactorialWith6() {
        Assertions.assertEquals(720, calc.factorial(6));
    }

    @org.junit.jupiter.api.Test
    public void testFactorialWith8() {
        Assertions.assertEquals(40320, calc.factorial(8));
    }

    @org.junit.jupiter.api.Test
    public void testFactorialWith0() {
        Assertions.assertEquals(1, calc.factorial(0));
    }

    @org.junit.jupiter.api.Test
    public void testFactorialWithNegative2() {
        Assertions.assertEquals(0, calc.factorial(-2));
    }
}
