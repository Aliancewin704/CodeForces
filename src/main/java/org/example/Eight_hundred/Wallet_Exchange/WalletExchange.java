package org.example.Eight_hundred.Wallet_Exchange;


public class WalletExchange {

    public static String walletGame(int a, int b){
        int money = a + b;
        return money % 2 == 0? "Bob": "Alice";
    }
    
}
