package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus () { //이런 메소드 하나하나를 테스트 케이스라고 한다
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1, 2);

        assertEquals(3, rs);
    }
}
