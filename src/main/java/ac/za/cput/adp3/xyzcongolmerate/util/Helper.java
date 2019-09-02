package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass); // gets the name of the class
        int lengthOfClassName = className.length(); // gets the length of the class name
        String upperCaseLetters = "";

        for(int i = 0; i < lengthOfClassName; i++){   //loops through each letter in the class name
            if(Character.isUpperCase(className.charAt(i))){  // checks if the letter is uppercase
              char upperCase = className.charAt(i);   // copies the uppercase letter to a variable
                upperCaseLetters = upperCaseLetters + upperCase + ""; // adds each uppercase to the string
            }
        }
        return upperCaseLetters; // returns all the capital letters
    }
}
