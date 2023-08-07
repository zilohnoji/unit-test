package com.donatoordep;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test operators in SimpleMath Class")
public class SimpleMathTest {

    SimpleMath math;

    // Esse método irá iniciar antes de todos os outros métodos
    @BeforeAll
    static void beforeAllMethod() {
        System.out.println("Running @BeforeAll method");
    }

    // Esse método irá iniciar depois de todos os outros métodos
    @AfterAll
    static void afterAllMethod() {
        System.out.println("Running @AfterAll method");
    }

    // Esse método irá iniciar antes da execução de cada método
    @BeforeEach
    void beforeEachMethod() {
        this.math = new SimpleMath();
        System.out.println("Running @BeforeEach method");
    }

    // Esse método irá iniciar depois após a execução de cada método
    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method");
    }

    // Nomeclatura test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    // Altera o nome do teste para maior legibilidade
    void testSum_When_SixDotTwoIsAddedTwo_ShouldReturnEightDotTwo() {
        // AAA (Triple AAA) - Arrange, Act e Assert
        // Given / Arrange - Critério inicial, cenário inicial das classes (setar configurações, iniciar variaveis)
        Double firstNumber = 6.2D;
        Double secondNumber = 2D;
        Double expected = 8.2D;

        // When / Act- Dispara o gatilho, inicia a execução do cenário.
        Double actual = math.sum(firstNumber, secondNumber);

        // Then / Assert - Avaliação do resultado, verifica se corresponde ao esperado.
        // Lazy Assert Message (Só será executada se o teste falhar) + Performance.
        assertEquals(expected, actual, () -> String.format("%.2f + %.2f not produces %.2f", firstNumber, secondNumber, expected));
        System.out.println("Running testSum method");
    }

    @Test
    @Disabled("TODO: We need still work on it!") // Desabilitando o teste
    @DisplayName("Test 10 - 2 = 8")
    void testSubtraction_WHEN_TenAddedTwo_ShouldReturnEight() {
        Double firstNumber = 10D;
        Double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 8D;

        assertEquals(expected, actual, () -> String.format("%.2f - %.2f not produces %.2f", firstNumber, secondNumber, expected));
        System.out.println("Running testSubtraction method");
    }

    @Test
    @DisplayName("Test 5 * 2 = 10")
    void testMultiplication_WHEN_FiveIsMultipliedByTwo_ShouldReturnTen() {
        Double firstNumber = 5D;
        Double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 10D;

        assertEquals(expected, actual, () -> String.format("%.2f * %.2f not produces %.2f", firstNumber, secondNumber, expected));
        System.out.println("Running testMultiplication method");
    }

    @Test
    @DisplayName("Test (10 + 8) / 2 = 9")
    void testMean_WHEN_TenSumEightDividedByTwo_ShouldReturnNine() {
        Double firstNumber = 10D;
        Double secondNumber = 8D;

        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 9D;

        assertEquals(expected, actual, () -> String.format("((%.2f + %.2f) / 2) not produces %.2f", firstNumber, secondNumber, expected));
        System.out.println("Running testMean method");
    }
}
