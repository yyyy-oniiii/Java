/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 총점과 평균 구하기(2)
 // Q. 국어점수를 의미하는 korScore 변수를 추가하고, 국어점수까지 포함한 총점과 평균점수를 구해보세요

package section_03.operator;

public class operator1_4 {
    public static void main(String[] args) {
        
        int mathScore = 50;
        int engScore = 65;
        int korScore = 90;
        int totalScore = mathScore + engScore + korScore;
        System.out.println("총점은: " + totalScore);

        double avgScore = totalScore / 3.0;
        System.out.println("평균은: " + avgScore);
    
    } //main

}  //class

