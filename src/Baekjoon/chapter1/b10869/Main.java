package Baekjoon.chapter1.b10869;

import java.util.Scanner;
/* 출력값이 다 정수이므로 int를 써도 상관없어보이므로 datatype은 int로 함.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        /*
        long a = scan.nextLong();
        long b = scan.nextLong();
         */

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
