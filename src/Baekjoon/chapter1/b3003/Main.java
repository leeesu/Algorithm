package Baekjoon.chapter1.b3003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int q = scan.nextInt();
        int l = scan.nextInt();
        int b = scan.nextInt();
        int n = scan.nextInt();
        int p = scan.nextInt();

        System.out.printf("%d %d %d %d %d %d\n",1-k, 1-q, 2-l, 2-b, 2-n, 8-p);

    }
}
