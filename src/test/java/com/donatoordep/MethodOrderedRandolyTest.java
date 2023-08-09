package com.donatoordep;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Roda os testes em ordem aleatória (garante que não criemos um teste que dependa de outro).
@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedRandolyTest {

    @Test
    void testA() {
        System.out.println("Running test A");
    }
    @Test
    void testB() {
        System.out.println("Running test B");
    }

    @Test
    void testC() {
        System.out.println("Running test C");
    }
    @Test
    void testD() {
        System.out.println("Running test D");
    }
}
