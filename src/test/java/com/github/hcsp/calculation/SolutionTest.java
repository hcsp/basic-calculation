package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        assertEquals(4, Solution.calculate(200));
        assertEquals(0, Solution.calculate(42));
    }
}
