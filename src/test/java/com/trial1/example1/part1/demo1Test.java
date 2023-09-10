package com.trial1.example1.part1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class demo1Test {
    @Test
    void name() {
        // Create an array of arguments with the name "devil"
        var d1 = new demo1();
        assertEquals(14, d1.add(10, 4));
    }
}