package section_03.section_03_quiz;

public class section_03_quiz_04 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        boolean result;

        result = ((num1 > 10 ) && (num2 > 10));
        System.out.println(result);             // false

        result = ((num1 > 10) || (num2 > 10));    
        System.out.println(result);             // true
        System.out.println(!result);            // false
    }
}
