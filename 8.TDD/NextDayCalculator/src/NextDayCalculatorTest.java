import org.junit.Test;
import static org.junit.Assert.*;

public class NextDayCalculatorTest {
    @Test
    public void testNextDayNormalDate() {
        assertArrayEquals(new int[]{2, 1, 2018}, NextDayCalculator.getNextDay(1, 1, 2018));
    }

    @Test
    public void testNextDayEndOfMonth() {
        assertArrayEquals(new int[]{1, 2, 2018}, NextDayCalculator.getNextDay(31, 1, 2018));
        assertArrayEquals(new int[]{1, 5, 2018}, NextDayCalculator.getNextDay(30, 4, 2018));
    }

    @Test
    public void testNextDayEndOfFebruaryNonLeapYear() {
        assertArrayEquals(new int[]{1, 3, 2018}, NextDayCalculator.getNextDay(28, 2, 2018));
    }

    @Test
    public void testNextDayEndOfFebruaryLeapYear() {
        assertArrayEquals(new int[]{1, 3, 2020}, NextDayCalculator.getNextDay(29, 2, 2020));
    }

    @Test
    public void testNextDayEndOfYear() {
        assertArrayEquals(new int[]{1, 1, 2019}, NextDayCalculator.getNextDay(31, 12, 2018));
    }
}
