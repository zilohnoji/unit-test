package com.donatoordep;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Roda os testes em ordem alfabetica
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByNameTest {


    @Test
    void testC() {
        System.out.println("Running test C");
    }

    @Test
    void testD() {
        System.out.println("Running test D");
    }

    @Test
    void testA() {
        System.out.println("Running test A");
    }

    @Test
    void testB() {
        System.out.println("Running test B");
    }
}
