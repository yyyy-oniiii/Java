/*
 * Date: 2021-05-11
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 05일차
 * Subject: "기본 연산자"
 */


 // 증감연산자 (++) (--)


package section_03.operator;

public class operator1_5 {
    public static void main(String[] args) {
        int gameScore = 150;            // 게임에서 획득한 점수는 150점임

        int lastScore1 = ++gameScore;   // 먼저 gameScore에 1을 더한 뒤 lastScore1에 대입
        System.out.println(lastScore1); // 151

        int lastScore2 = --gameScore;   // 먼저 gameScore에서 1을 뺀 뒤 lastScore2에 대입
        System.out.println(lastScore2); // 150

        int gameScore2 = 140;
        int lastScore3 = gameScore2++;
        int lastScore4 = gameScore2--;
        int lastScore5 = gameScore2--;
        System.out.println(lastScore3); // 140, 문장이 끝난 뒤 141이 됨
        System.out.println(lastScore4); // 141, 문장이 끝난 뒤 140이 됨
        System.out.println(lastScore5); // 140, 문장이 끝난 뒤 139가 됨
        

    }    
}
