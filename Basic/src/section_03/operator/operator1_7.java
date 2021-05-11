/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 논리 연산 - 단락 회로 평가(모든 항이 실행되지 않는 경우)

package section_03.operator;

public class operator1_7 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // 앞 항의 결과가 거짓이므로 이 문장은 실행되지 않는다
        System.out.println(value);  // false 출력
        System.out.println(num1);   // 문장이 실행되지 않았으므로 num1 값 그대로 출력
        System.out.println(i);      // 문장이 실행되지 않았으므로 i값 그대로 출력

        int num2 = 10;
        int i2 = 2;
        boolean value2 = ((num2 = num2 + 3) > 10) || ((i2 = i2 + 2) > 10); // 둘 둥 앞 항의 결과가 참이므로 이 문장은 실행됨
        System.out.println(value2); // true 출력
        System.out.println(num2);   // 문장이 실행되었으므로 num2 = 13(참)
        System.out.println(i2);     // 문장이 실행되었으므로 i2 값 그대로 출력(거짓)
    }
}
