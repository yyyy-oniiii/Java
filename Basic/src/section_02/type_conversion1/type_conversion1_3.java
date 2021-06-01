/*
 *   Q. 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해볼 것
 *   Ref: Do it! 자바 프로그래밍 입문 69p 연습문제 Q4
 */

package section_02.type_conversion1;

public class type_conversion1_3 {
    public static void main(String[] args) {

        int iNum5 = 10;
        float fNum5 = 2.0F;

        int iSum = (int)iNum5 + (int)fNum5; 
        int iSub = (int)iNum5 - (int)fNum5;
        int iDiv = (int)iNum5 / (int)fNum5;
        int iTime = (int)iNum5 * (int)fNum5;
        
        System.out.println(iSum);
        System.out.println(iSub);
        System.out.println(iDiv);
        System.out.println(iTime);
    }
}
