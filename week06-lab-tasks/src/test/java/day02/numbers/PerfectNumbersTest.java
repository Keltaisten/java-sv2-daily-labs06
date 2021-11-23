package day02.numbers;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumbersTest {

    @Test
    public void testCreateIsSixPerfect(){
        assertTrue(new PerfectNumbers().isPerfectNumber(6));
    }

    @Test
    public void testCreateIsEightOneTwoEightPerfect(){
        assertTrue(new PerfectNumbers().isPerfectNumber(8128));
    }

    @Test
    public void testCreateIsSevenTwoFourSixPerfect(){
        assertFalse(new PerfectNumbers().isPerfectNumber(7246));
    }

    @Test
    public void testCreateIsNinePerfect(){
        assertFalse(new PerfectNumbers().isPerfectNumber(9));
    }
}
