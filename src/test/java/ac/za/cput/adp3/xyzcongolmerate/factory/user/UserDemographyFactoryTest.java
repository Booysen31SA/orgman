package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    @Test
    public void buildUserDemography() {
    Date date = new Date();
    UserDemography userDemography = UserDemographyFactory.buildUserDemography("booysen31.matthew@gmail.com"
                                                                              ,"CEO"
                                                                              ,"GF-79a64e6d-bc3b-44ff-973e-b2eaeacb6b48"
                                                                              ,"RF-50486d41-7697-480e-9a65-c1a8000e653c"
                                                                              ,date);
    assertNotNull(userDemography);
    System.out.println("The Object Created is : "+userDemography);
    }
}