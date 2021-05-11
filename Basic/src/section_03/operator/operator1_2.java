/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 부호연산자 +, - 
 
package section_03.operator;

public class operator1_2 {
    public static void main(String[] args) {
        
        int num = 10;

        System.out.println(+num);   // 값 10이 그대로 출력됨
        System.out.println(-num);   // -10이 출력되지만 num 값이 실제로 변한건 아님
        System.out.println(num);    // 값 10이 그대로 출력됨

        num = -num;                 // num 값을 음수로 바꿔서 다시 num에 대입
        System.out.println(num);    // 값 -10이 출력됨
    }
}
