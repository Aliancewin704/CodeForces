package org.example.Eight_hundred.Watermelon;

public class Watermelon {

    public static String sharingWatermelon(int weight) {
        for (int i = 1; i < weight; i++) {
            if (i % 2 == 0) {
                weight -= i;
                if (weight % 2 == 0) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
