/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 대입 연산자
 // 대입 연산자를 기준으로 왼쪽에 있는 변수를 lValue, 오른쪽에 있는 변수를 rValue라고 함
 // 항상 rValue값을 lValue에 대입하므로, lValue에는 숫자가 올 수 없고 늘 변수나 상수가 와야 함


package section_03.operator;

public class operator1_1 {
    public static void main(String[] args) {
        int age = 24;
        System.out.println(age);

        int mathScore = 70;
        int engScore = 80;
        int totalScore = mathScore + engScore;  // mathScore 값과 engScore 값을 더하여
        System.out.println(totalScore);
    }
}
