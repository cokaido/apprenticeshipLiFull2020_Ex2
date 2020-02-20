import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LeapYearShould {

    @Test
    public void return_true_if_2000_is_a_leap_year(){

        LeapYear leapYear = new LeapYear();

        assertEquals(true, leapYear.isLeapYear(2000));
    }

    @Test
    public void return_false_if_2001_is_not_a_leap_year(){

        LeapYear leapYear = new LeapYear();

        assertEquals(false, leapYear.isLeapYear(2001));
    }
}
