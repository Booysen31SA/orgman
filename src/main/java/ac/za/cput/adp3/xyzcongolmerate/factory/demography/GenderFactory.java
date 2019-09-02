package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;

public class GenderFactory {

    private static final String SUFFIX = Helper.getSuffixFromClassName(GenderFactory.class); // Expecting GF from (G)ender(F)actory.

    public static Gender buildGender(String genderDescription) {
        return new Gender.Builder()
                .genderId(Helper.generateRandomGivenSuffix(SUFFIX))
                .genderDescription(genderDescription)
                .build();
    }
}
