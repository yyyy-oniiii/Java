/*
 * Date: 2021-05-10
 * Author: 이오니
 * Project: [자바 초보탈출 30일]
 * Section: 04일차
 * Subject: "형 변환(Type Conversion)_(1)"
 */

 /* 자동 형 변환(묵시적 형 변환)의 조건
    1) 바이트 크기가 작은 자료형에서 큰 자료형으로 대입 시 형 변환 자동
    2) 덜 정밀한 자료형에서 더 정밀한 자료형으로 대입 시 형 변환 자동
 */ 

package section_02.type_conversion1;

public class type_conversion1_0 {

    public static void main(String[] args) {
        byte bNum = 10;
        int iNum2 = bNum;           // byte 형 값이 int형 변수로 대입된 상황
                                    // byte보다 int의 바이트 크기가 크므로 자동으로 형 변환이 이루어진다
        System.out.println(iNum2);
        System.out.println(bNum);

        int iNum = 20;
        float fNum = iNum;          // int형 값이 float 형 변수로 대입된 상황
        System.out.println(iNum);   // int와 float의 바이트 크기는 동일하지만 float이 더 정밀한 자료형이므로 자동으로 형 변환이 이루어진다
        System.out.println(fNum);
    }
}
