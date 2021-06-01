/*
 * Date: 2021-05-10
 * Author: 이오니
 * Project: [자바 초보탈출 30일]
 * Section: 04일차
 * Subject: "형 변환(Type Conversion)_(2)"
 */

 /* 명시적 형 변환의 조건(묵시적 형 변환의 반대 개념)
    1) 바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는 경우, 강제 형 변환 필요
    2) 더 정밀한 자료형에서 덜 정밀한 자료형으로 대입하는 경우, 강제 형 변환 필요
 */ 

package section_02.type_conversion1;

public class type_conversion1_1 {
    public static void main(String[] args) {
        int iNum = 10;
        byte bNum = (byte)iNum; // 강제로 형을 변환하려면, 변환할 형을 괄호로 명시해야 함
        System.out.println(iNum);
        System.out.println(bNum);

        double dNum = 3.14;
        int iNum3 = (int)dNum;  // 실수 자료형 double을 정수자료형 int로 변환 (이 경우, 소수점 이하 부분은 생략되고 정수부분만 대입됨)
        System.out.println(dNum);
        System.out.println(iNum3);
        
    }
}
