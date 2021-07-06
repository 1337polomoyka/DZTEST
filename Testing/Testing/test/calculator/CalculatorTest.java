package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void sum() {
        assertEquals(2, Calculator.sum(4, -1));
    }

    @Test
    void sub() {
        assertEquals(2, Calculator.sub(4, 2));
    }

    @Test
    void mul() {
        assertEquals(7, Calculator.mul(7, 1));
    }

    @Test
    void div() {
        assertEquals(0, Calculator.div(1, 2));
    }
}