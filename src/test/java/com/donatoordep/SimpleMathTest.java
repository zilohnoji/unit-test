package com.donatoordep;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test operators in SimpleMath Class")
public class SimpleMathTest {

    // Nomeclatura test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("6.2 + 2 = 8.2") // Altera o nome do teste para maior legibilidade
    void testSum_When_SixDotTwoIsAddedTwo_ShouldReturnEightDotTwo() {
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
    @DisplayName("10 - 2 = 8")
    void testSubtraction_WHEN_TenAddedTwo_ShouldReturnEight() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 8D;

        assertEquals(expected, actual, () -> String.format("%.2f - %.2f not produces %.2f",
                firstNumber, secondNumber, expected));
    }

    @Test
    @DisplayName("5 * 2 = 10")
    void testMultiplication_WHEN_FiveIsMultipliedByTwo_ShouldReturnTen() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 5D;
        Double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 10D;

        assertEquals(expected, actual, () -> String.format("%.2f * %.2f not produces %.2f",
                firstNumber, secondNumber, expected));
    }

    @Test
    @DisplayName("(10 + 8) / 2 = 9")
    void testMean_WHEN_TenSumEightDividedByTwo_ShouldReturnNine() {
        SimpleMath math = new SimpleMath();
        Double firstNumber = 10D;
        Double secondNumber = 8D;

        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 9D;

        assertEquals(expected, actual, () -> String.format("((%.2f + %.2f) / 2) not produces %.2f",
                firstNumber, secondNumber, expected));
    }
}
