import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Ignore
    @Test
    public void acceptance_test() {
        assertEquals("MMXIX", RomanNumerals.add("CXXIV", "MDCCCXCV"));
    }
}
