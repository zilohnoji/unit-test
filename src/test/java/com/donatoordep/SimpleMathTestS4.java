package com.donatoordep;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test operators in SimpleMath Class")
public class SimpleMathTestS4 {

    static SimpleMath math;

    // Esse método irá iniciar antes da execução de todos os métodos
    @BeforeAll
    static void beforeAllMethod() {
        math = new SimpleMath();
    }


    @ParameterizedTest
    @ValueSource(strings = {"Pedro", "Gabriel", "Felipe"})
    void testValueSource(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }

    // @MethodSource("testDivisionInputParameters")
    // @MethodSource()
    /*
    @CsvSource({
            "6.2, 2, 3.1",
            "71, 9.3, 7.63",
            "18.3, 3.1, 5.90"
    })*/
    @DisplayName("Test double division [firstNumber, secondNumber, expected]")
    @ParameterizedTest
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivision(
            double firstNumber, double secondNumber, double expected) {

        double actual = math.division(firstNumber, secondNumber);

        // Obs: O delta limita as casas decimais após a virgula.
        assertEquals(expected, actual, 2D, () -> String.format("%f / %f not produces %f",
                firstNumber, secondNumber, expected));
    }


    // static Stream<Arguments> testDivisionInputParameters()
    /*static Stream<Arguments> testDivision() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 9.3D, 7.63D),
                Arguments.of(18.3D, 3.1D, 5.90D)
        );
    }*/
}
