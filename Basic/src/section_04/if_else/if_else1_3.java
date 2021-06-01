
/*
 * 성적에 따른 등급 계산하기(2)
 * ------------------------------
 * 90점 이상은  A
 * 나머지는     B
 * 
 * 두 가지의 조건만 있을 경우, 조건연산자를 사용한 코드로 구현해보기
 */ 

package section_04.if_else;

public class if_else1_3 {
    public static void main(String[] args) {

        char grade;
        int score;

        score = 85;

        grade = (score >= 90)? 'A' : 'B';

        System.out.println(score + "점," + grade + "등급입니다.");

    }
}
