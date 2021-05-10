/*
 * Date: 2021-05-09
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 03일차
 * Subject: "문자형 변수 선언하기"
 */


package section_02.characterex1;

public class characterex1_0 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);      // 문자 출력
        System.out.println((int)ch1); // 문자에 해당되는 정수 값(ASCII) 출력

        char ch2 = 65;
        System.out.println(ch2);      // 정수 값(ASCII)에 해당되는 문자 출력

        char ch6 = '\uD55C';          // 정수 값(ASCII)에 해당되는 한글 문자 출력

        char ch3 = 'Y';
        char ch4 = 'O';
        char ch5 = 'N';
        System.out.println((int)ch3);
        System.out.println((int)ch4);
        System.out.println((int)ch5); // "Hello"처럼 큰 따옴표로 감싸진 문자열은 기본 자료형으로 표현 불가
                                      // 'A'와 "A"는 전혀 다른 값을 가진다. 
                                      // 문자열을 다룰 땐 String 클래스 사용
                                      // char 형은 음수 값을 표현할 수 없음
        System.out.println(ch6);       
    }
}
