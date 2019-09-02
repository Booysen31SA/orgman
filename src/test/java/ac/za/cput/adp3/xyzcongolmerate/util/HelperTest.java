package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelperTest {

    private static final String SUFFIX = Helper.getSuffixFromClassName(GenderFactory.class); // Expecting GF from (G)ender(F)actory.
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getSuffixFromClassName() {
        System.out.println("SUFFIX should be GF");
        assertEquals(SUFFIX, "GF");
    }
}