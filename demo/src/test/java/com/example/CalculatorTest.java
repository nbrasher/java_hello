package com.example;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {
    @Test
    public void testCalculator_doesSimpleMath () {
        Calculator unitUnderTest = new Calculator();
        int result = unitUnderTest.add(3, 4);

        assertThat(result).isEqualTo(7);
    }
}
