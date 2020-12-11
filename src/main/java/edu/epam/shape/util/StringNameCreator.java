package edu.epam.shape.util;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.UUID;

public class StringNameCreator {
    public static String createName() {
        return String.valueOf(UUID.randomUUID());
    }
}
