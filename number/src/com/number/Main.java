package com.number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(f(a, b, p));
    }

    public static int f(int a, int b, int p) {
        int result = 1%p;
        while (b != 0) {
            if ((b&1) == 1) {
                result = (int)1l*result*a%p;
            }
            a = (int)1l*a*a%p;
            b>>=1;
        }

        return result;
    }
}
