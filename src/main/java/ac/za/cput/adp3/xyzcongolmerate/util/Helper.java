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
        int length = className.length(); // gets the length of the class name
        String code = "";

        for(int i = 0; i < length; i++){   //loops through each letter in the class name
            if(Character.isUpperCase(className.charAt(i))){  // checks if the letter is uppercase
              char upperCase = className.charAt(i);   // copies the uppercase letter to a variable
              code = code + upperCase + ""; // adds each uppercase to the string
            }
        }
        return code; // returns all the capital letters
    }
}
