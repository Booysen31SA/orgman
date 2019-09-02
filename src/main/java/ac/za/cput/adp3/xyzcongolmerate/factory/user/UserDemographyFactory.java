package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;

import java.util.Date;

public class UserDemographyFactory {

    public static UserDemography buildUserDemography(String userEmail, String userTitle, String genderId, String raceId, Date dateOfBirth) {
        return new UserDemography(userEmail, userTitle, genderId, raceId, dateOfBirth);
    }
}
