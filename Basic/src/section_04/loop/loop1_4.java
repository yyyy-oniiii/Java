
/*
 * 반복문 만들기(for문) (1)
 * ------------------------------
 * for 문의 구조는 다음과 같다
 * 
 *      for (초기화식; 조건식; 수행문)
 *      {
 *          System.out.println(출력);
 *      }    
 * 
 * 조건식이 참을 만족하지 않으면 수행문 없이 바로 출력한다
 */ 


package section_04.loop;

public class loop1_4 {
    public static void main(String[] args) {
        // num이 1부터 10이 될 때까지 num 값을 증가하며 반복한다
        int num;
        for (num = 1; num <= 10; num++)
        {
            System.out.println(num);
        }
    }
}
