package org.example.Eight_hundred.Wallet_Exchange;

//https://codeforces.com/problemset/problem/1919/A


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class ReadInputWriteOutputExample {
    
    public static PrintWriter out;
    public static class Reader {
        
        // Класс Reader может быть расширен любыми статическими методами парсинга строки
        
        static BufferedReader reader;
        static StringTokenizer tokenizer;
        
        static void init(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }
        
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }
        
        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        
        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
    
    
    
    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        
        int amount = Reader.nextInt();
        
        for(int i = 0; i < amount; i++) {
            int a = Reader.nextInt();
            int b = Reader.nextInt();
            System.out.println(WalletExchange.walletGame(a, b));
        }
        
        
        // Отправить накопленный вывод на stdout
        out.close();
    }
    
    
}