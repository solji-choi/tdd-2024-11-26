package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void plus1 () { //이런 메소드 하나하나를 테스트 케이스라고 한다
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertEquals(3, rs);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void plus2 () { //이런 메소드 하나하나를 테스트 케이스라고 한다
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2, 10);

        assertEquals(12, rs);
    }

    @Test
    @DisplayName("2 * 10 = 20")
    public void multiply1 () { //이런 메소드 하나하나를 테스트 케이스라고 한다
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(2, 10);

        assertEquals(20, rs);
    }

    @Test
    @DisplayName("5 * 7 = 35")
    public void multiply2 () { //이런 메소드 하나하나를 테스트 케이스라고 한다
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(5, 7);

        assertEquals(35, rs);
    }
}
