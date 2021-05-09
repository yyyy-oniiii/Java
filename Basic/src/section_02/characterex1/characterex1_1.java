/*
 * Date: 2021-05-09
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 03일차
 * Subject: "문자형 변수 선언하기"
 */

// 자료형 없이 변수 선언하기
// 자바 10부터 var 없이 바로 타입을 선언할 수 있음
package section_02.characterex1;

public class characterex1_1 {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "Hello\n";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "Test";
         // str = 3; str 변수는 String 형으로 먼저 선언되었기 때문에 정수값 넣을 수 없음
    }
}