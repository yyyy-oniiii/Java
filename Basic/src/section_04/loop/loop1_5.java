
/*
 * 반복문 만들기(for문) (2)
 * ------------------------------
 * for 문의 구조는 다음과 같다
 * 
 *      for (초기화식; 조건식; 수행문)
 *      {
 *          System.out.println(출력);
 *      }    
 * 
 * 조건식이 참을 만족하지 않으면 for 문은 끝난다.
 */ 

// 1부터 10까지의 모든 정수를 더한 값을 출력하기

package section_04.loop;

public class loop1_5 {
    public static void main(String[] args) {
        int num;    
        int sum;    // 변수 생성

        for (num = 1, sum = 0; num <= 10; num++)
        {
            sum += num;
        }
        System.out.println("1부터 10까지의 합은" + sum + "입니다");

    }
}
