/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 관계 연산자(true, false)

package section_03.operator;

public class operator1_6 {
    public static void main(String[] args) {
        int myAge = 30;
        boolean value = (myAge > 25); // 괄호를 사용하는 이유는 가독성이 좋은 코드를 만들기 위함
        System.out.println(value);

        boolean val = (5 > 2) && (5 < 3);   // 논리곱, 둘 다 참이어야 참
        boolean val2 = (5 > 2) || (5 < 2);  // 논리합, 둘 중 하나만 참이어도 참
        boolean val3 = !(5 > 2);            // 부정, 참이면 거짓, 거짓이면 참

        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
    }
}
