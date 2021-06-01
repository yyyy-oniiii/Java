/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // Q. 다음 예제에서 단락 회로 평가에 주의하여 출력 결과를 예상해보세요!


package section_03.operator;

public class operator1_8 {
    public static void main(String[] args) {
        int num = 5;
        int i = 10;

        boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);  // 논리합, 둘 중 하나라도 참이면 참
        System.out.println(value);  // 앞 항의 결과가 참이므로 true 출력(뒤 항은 살펴볼 필요가 없어 실행조차 되지 않음)
        System.out.println(num);    // 예상값: 50
        System.out.println(i);      // 예상값: 10
    } 
}
