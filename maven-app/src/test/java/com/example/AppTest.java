package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void addsTwoNumbers() {
        assertEquals(4, App.add(2, 2));
    }

    @Test
    void greetsByName() {
        assertEquals("Hello, Omnia!", App.greeting("  Omnia  "));
    }

    @Test
    void greetsStrangerOnBlankName() {
        assertEquals("Hello, stranger!", App.greeting("   "));
    }
}
