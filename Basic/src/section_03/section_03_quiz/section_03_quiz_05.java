package section_03.section_03_quiz;

public class section_03_quiz_05 {
    public static void main(String[] args) {
        int num1 = 2;       // 2진수 변환: 0010
        int num2 = 10;      // 2진수 변환: 1010

        System.out.println(num1 & num2);    // 0010, 10진수 2
        System.out.println(num1 | num2);    // 1010, 10진수 10
        System.out.println(num1 ^ num2);    // 1000
        System.out.println(~num1);          // 0101, 
    }
}
