package com.donatoordep;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

@DisplayName("Test")
public class ArraysCompareTest {

    @Test
    void test() {

        // Criação de dois arrays
        int[] numbers = {25, 8, 21, 32, 3};
        int[] expectedArray = {3, 8, 21, 25, 32};

        // Ordenando o numbers de forma crescente
        Arrays.sort(numbers);

        // Verificando se numbers está em forma crescente (Como queremos)
        assertArrayEquals(numbers, expectedArray);
    }



    // O teste deve ocorrer no máximo até 1 segundo
    // @Timeout(1)
    @Test
    // O teste deve ocorrer em 15 milisegundos
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance() {
        int[] numbers = {25, 8, 21, 32, 3};
        for (int i = 0; i < 100000000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
