package com.capgemini.pack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @Test
    void testAdd(){
        Calculation object = new Calculation();
        int result = object.add(2,3);
        assertEquals(5,result);
    }

}

