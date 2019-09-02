package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male");

        assertNotNull(gender.getGenderId());
        System.out.println("The Generated ID is : "+ gender.getGenderId());

    }
}