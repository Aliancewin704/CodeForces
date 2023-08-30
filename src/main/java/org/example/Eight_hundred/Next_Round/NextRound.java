package org.example.Eight_hundred.Next_Round;

public class NextRound {

    public static int nextRound(int[] members, int place) {
        if (members[place - 1] <= 0) {
            for (int i = 0; i < members.length; i++) {
                if (members[i] <= 0) return i;
            }
        }
        for (int i = 0; i < members.length; i++) {
            if (members[i] < members[place - 1]) return i;
        }
        return members.length;
    }
}
