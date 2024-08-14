package zm.gov.helsb.portal.helsbstudentauth.helpers;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class PasswordGeneratorHelper {

    public static String generatePassword(int n) {
        byte[] array = new byte[256];
        new Random().nextBytes(array);
        String randomString
                = new String(array, StandardCharsets.UTF_8);
        StringBuilder ra = new StringBuilder();
        String AlphaNumericString
                = randomString
                .replaceAll("[^A-Za-z0-9]", "");
        for (int k = 0; k < AlphaNumericString.length(); k++) {
            if (Character.isLetter(AlphaNumericString.charAt(k))
                    && (n > 0)
                    || Character.isDigit(AlphaNumericString.charAt(k))
                    && (n > 0)) {
                ra.append(AlphaNumericString.charAt(k));
                n--;
            }
        }
        return ra.toString();
    }
}
