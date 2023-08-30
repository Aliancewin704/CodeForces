package org.example.One_thousand_one_hundred.Special_numbers;

//https://codeforces.com/problemset/problem/1594/B


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ReadInputWriteOutputExample {

    public static PrintWriter out;

    static int n, k;
    static final int MOD = 1000000007;

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

    public static int power(int base, int exp) {
        BigInteger ans = BigInteger.valueOf(base).pow(exp).mod(BigInteger.valueOf(MOD));
        return ans.intValue();
    }

    public static long specialNumbers() {
        byte[] arr = new byte[200];
        long sum = 0;
        String binaryString = Integer.toBinaryString(k);
        StringBuilder stringBuilder = new StringBuilder(binaryString);
        stringBuilder.reverse();
        binaryString = stringBuilder.toString();
        for (int i = 0; i < binaryString.length(); i++) {
           arr[i] = (byte) binaryString.charAt(i);
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 49){
                sum += power(n,i);
            }
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int amount = Reader.nextInt();
        long ans = 0;

        for (int i = 0; i < amount; i++) {
            n = Reader.nextInt();
            k = Reader.nextInt();
            ans = specialNumbers();
            System.out.println(ans % MOD);
        }
        // Отправить накопленный вывод на stdout
        out.close();
    }
}