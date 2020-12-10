package edu.epam.shape.util;

import java.nio.charset.Charset;
import java.util.Random;

public class StringNameCreator {
    public static String createName() {
        int nameSize = 10;
        byte[] array = new byte[256];
        new Random().nextBytes(array);
        String randomString = new String(array, Charset.forName("UTF-8"));
        StringBuffer name = new StringBuffer();
        for (int k = 0; k < randomString.length(); k++) {
            char ch = randomString.charAt(k);
            if (((ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')
                    || (ch >= '0' && ch <= '9'))
                    && (nameSize > 0)) {
                name.append(ch);
                nameSize--;
            }
        }
        return name.toString();
    }
}
