package section_03.section_03_quiz;

public class section_03_quiz_06 {
    public static void main(String[] args) {
        int num = 8;

        System.out.println(num += 10);  // num = num + 10 = 18
        System.out.println(num -= 10);  // num = num - 10 = 8 (결과값은 누적된다)
        System.out.println(num >>= 2);  // num = num >> 2 = 0010
    }
    
}
