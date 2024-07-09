package org.example.Eight_hundred.Countdown;


public class Countdown {
    
    public static int countdown(String cloak) {
        int count = 0;
        for (int i = 0; i < cloak.length(); i++) {
     
            int num = Integer.parseInt(String.valueOf(cloak.charAt(i)));
            if( num != 0){
                count++;
            }
            
            count+= num;
        }
        int i = Integer.parseInt(String.valueOf(cloak.charAt(cloak.length() - 1))) ;
        if(i != 0 && i != count){
            count--;
        }
        return count;
    }
    
}
