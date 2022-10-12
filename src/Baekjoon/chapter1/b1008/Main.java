package Baekjoon.chapter1.b1008;

import java.util.Scanner;

/*
실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
정수형인 long아닌 실수형인 double이 적합
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        scan.close();
        System.out.println(a/b);
    }
}
