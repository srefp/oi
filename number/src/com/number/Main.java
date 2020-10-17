package com.number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long p = scanner.nextLong();
        System.out.println(f(a, b, p));
    }

    public static long f(long a, long b, long p) {
        long result = 1%p;
        while (b != 0) {
            if ((b&1) == 1) {
                result = result*a%p;
            }
            a = a*a%p;
            b>>=1;
        }

        return result;
    }
}
