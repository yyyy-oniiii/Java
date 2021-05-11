/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 총점과 평균 구하기(1)

package section_03.operator;

public class operator1_3 {
    public static void main(String[] args) {

        int mathScore = 90;
        int engScore = 70;
        
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);     // 총점 구하기

        double avgScore = totalScore / 2.0; // 평균 구하기
        System.out.println(avgScore);
    }
    
}
