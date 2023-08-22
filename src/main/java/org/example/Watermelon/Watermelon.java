package org.example.Watermelon;

public class Watermelon {

    public static String sharingWatermelon(int weight){
        if (weight / 2 % 2 == 0){
            return "YES";
        }
        return "NO";
    }
}
