package Baekjoon.chapter1.b10430;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();


        System.out.printf("%d\n",(a+b)%c);
        System.out.printf("%d\n",((a%c) + (b%c))%c);
        System.out.printf("%d\n",(a*b)%c);
        System.out.printf("%d\n",((a%c)*(b%c))%c);

    }

}
