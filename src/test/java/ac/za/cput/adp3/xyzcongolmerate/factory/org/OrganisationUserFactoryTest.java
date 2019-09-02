package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
       OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("OF-c5a7a72e-cc1c-4fcc-a825-40db685fbc5a", "booysen31.matthew@gmail.com");

       assertNotNull(organisationUser);
       System.out.println("The Object Created : " + organisationUser);
    }
}