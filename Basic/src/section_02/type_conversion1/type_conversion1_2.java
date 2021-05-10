/*
 * Date: 2021-05-10
 * Author: 이오니
 * Project: [자바 초보탈출 30일]
 * Section: 04일차
 * Subject: "형 변환(Type Conversion)_(3)"
 */

 // 연산 중 형 변환

package section_02.type_conversion1;

public class type_conversion1_2 {
    public static void main(String[] args) {
        double dNum1 = 1.2;
        float fNum2 = 0.9F;

        int iNum3 = (int)dNum1 + (int)fNum2;    // 두 실수가 각각 int로 형 변환되어 더해짐 (1 + 0 = 1)
        int iNum4 = (int)(dNum1 + fNum2);       // 두 실수의 합이 먼저 계산된 후 int로 형 변환 (1.2 + 0.9 = 2.1 = 2)
        
        System.out.println(iNum3);
        System.out.println(iNum4);
    }
    
}


