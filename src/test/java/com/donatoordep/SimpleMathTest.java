package com.donatoordep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.sum(firstNumber, secondNumber);
        Double expected = 8.2D;

        // Lazy Assert Message (Só será executada se o teste falhar) + Performance.
        assertEquals(expected, actual, () -> String.format("%.2f + %.2f not produces %.2f",
                firstNumber, secondNumber, expected));
    }

    @Test
    void testsubtraction() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 8D;

        // Lazy Assert Message (Só será executada se o teste falhar) + Performance.
        assertEquals(expected, actual, () -> String.format("%.2f - %.2f not produces %.2f",
                firstNumber, secondNumber, expected));
    }

    @Test
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 5D;
        Double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 10D;

        // Lazy Assert Message (Só será executada se o teste falhar) + Performance.
        assertEquals(expected, actual, () -> String.format("%.2f * %.2f not produces %.2f",
                firstNumber, secondNumber, expected));
    }

    @Test
    void testMean(){
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 8D;

        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 9D;

        // Lazy Assert Message (Só será executada se o teste falhar) + Performance.
        assertEquals(expected, actual, () -> String.format("((%.2f + %.2f) / 2) not produces %.2f",
                firstNumber, secondNumber, expected));
    }
}
