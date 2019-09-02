package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("OF-995717c2-0a95-455c-914f-fcbaf0cbc655"
                                                         ,"Booysen31.matthew@gmail.com"
                                                         ,"RF-bce42ce8-2e41-4291-bd16-281c073cb144");

        assertNotNull(userRole);
        System.out.println("The Object that was created is : " + userRole);
    }
}