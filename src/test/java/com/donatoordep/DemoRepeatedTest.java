package com.donatoordep;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest {

    private SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        this.math = new SimpleMath();
        System.out.println("Running @BeforeEach method");
    }

    // Repete o teste 3 vezes
    @RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} " +
            "of {totalRepetitions}!")
    @DisplayName("Test 6.2 / 0 = ArithmeticException()")
    void testDivision_When_FirstNumberDividedByZero_ShouldReturnThrowArithmeticException(
            RepetitionInfo repetitionInfo
    ) {
        System.out.println("Repetition Nº " + repetitionInfo.getCurrentRepetition());
        System.out.println("Of " + repetitionInfo.getTotalRepetitions());

        // Given
        Double firstNumber = 6.2D;
        Double secondNumber = 0D;

        String expected = "Impossible to divide by zero";

        //When & Then
        ArithmeticException actual = assertThrows(ArithmeticException.class,
                () -> {
                    math.division(firstNumber, secondNumber);
                }, () -> "Division by zero should throw and ArithmeticException");

        assertEquals(expected, actual.getMessage(), () -> "Unexpected exception message");
        System.out.println("Running testDivision method");
    }
}
