/*
 * Date: 2021-05-12
 * Author: Yon
 * Project: [자바 초보탈출 30일]
 * Section: 06일차
 * Subject: "비트연산자 &, ^, |, ~"
 */


  // 비트연산자 연습해보기

package section_03.bit_operator;

public class bit_operator1_1 {
    public static void main(String[] args) {
        int num1 = 5;                   // 2진수 변환값: 00000101
        int num2 = 10;                  // 2진수 변환값: 00001010
        
        int result = num1 & num2;       // &: 둘 다 1일 경우에만 1 출력
        int result2 = num1 | num2;      // |: 둘 중 하나라도 1이면 1 출력
        int result3 = num1 ^ num2;      // ^: 같은 값이면 0, 다른 값이면 1
        int result4 = ~num2;            // ~: 0은 1로, 1은 0으로

        System.out.println(result);     // &
        System.out.println(result2);    // |
        System.out.println(result3);    // ^
        System.out.println(result4);    // ~
    }
}




