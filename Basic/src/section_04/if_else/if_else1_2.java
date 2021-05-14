/*
 * Date: 2021-05-13
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 07일차
 * Subject: "조건문"
 */


/*
 * 성적에 따른 등급 계산하기(1)
 * ------------------------------
 * 100 ~ 90점은  A
 * 89 ~ 80점은   B
 * 69 ~ 60점은   D
 * 나머지는      F
 * `int`형 변수 `score`와 `char`형 변수 `grade`를 사용하여 `score`에 따른 `grade` 출력해보기
 */ 

package section_04.if_else;

public class if_else1_2 {
    public static void main(String[] args) {

        int score = 85;
        char grade = 'A';

            if (score >= 90) {
                grade = 'A';
            }

            else if (score >= 80) {
                grade = 'B';
            }

            else if (score >= 60) {
                grade = 'C';
            }

            else {
                grade = 'D';
            }

        System.out.println(score + "점, " + grade + "등급 입니다");
    }
}
