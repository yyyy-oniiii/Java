/*
 * Date: 2021-05-09
 * Author: Yon Kim
 * Project: [자바 초보탈출 30일]
 * Section: 03일차
 * Subject: "상수 선언하기"
 */

// 항상 변하지 않는 값을 상수(constant)라고 함
// 예약어 final을 사용하여 선언한다

package section_02.constant1;

public class constant1_0 {
    public static void main(String[] args) {
        
        final int MAX_DOG_NUM = 30; // 선언과 동시에 초기화
        
        System.out.print(MAX_DOG_NUM);
    }
}

/*
 * 최대 강아지의 수가 30에서 35로 늘어난다면, 
 * 상수를 선언한 부분의 값만 변경해주면 됨
*/

