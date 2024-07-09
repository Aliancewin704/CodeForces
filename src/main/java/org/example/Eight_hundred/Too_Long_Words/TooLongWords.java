package org.example.Eight_hundred.Too_Long_Words;

public class TooLongWords {

    public static String tooLongWords(String s) {
        if (s.length() > 10) {
            char start = s.charAt(0);
            char end = s.charAt(s.length() - 1);
            String length = Integer.toString(s.substring(1, s.length() - 1).length());
            return start + length + end;
        }
        return s;
    }

}
