package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;

public class UserFactory {

    public static User buildUser(String userEmail, String firstName, String lastName) {
        return new User.Builder()
                .userEmail(userEmail)
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
