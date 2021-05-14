/*
 * Date: 2021-05-13
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 07일차
 * Subject: "조건문"
 */


 // if
 // if-else
 // if-else if-else

/*
 * 놀이공원 입장료 계산하기
 * ------------------------------
 * 미취학-아동(8세 미만)    1,000원
 * 초등학생   (14세 미만)   2,000원
 * 청소년     (20세 미만)   2,500원
 * 성인       (20세 이상)   3,000원

*/ 
package section_04.if_else;

public class if_else1_1 {
    public static void main(String[] args) {
        int age = 10;
        int charge = 1000;
            
            if (age < 8) {
                charge = charge + 500;
                System.out.println("미취학아동");
            }
            
            else if (age < 14) {
                charge = charge + 1000;
                System.out.println("초등학생");

            }

            else if (age < 20) {
                charge = charge + 1500;
                System.out.println("청소년");

            }

            else {
                charge = charge + 2000;
                System.out.println("성인");

            }
            System.out.printf("입장료: " + charge + "원 입니다");   // 여러 문장을 출력할 땐 앞 뒤로 + 기호를 붙여준다.
        }
}
