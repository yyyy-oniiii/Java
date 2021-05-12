/*
 *  Do it! Java 프로그래밍 입문
 *  Chapter 03 Quiz (88page ~ ) 
 */


 // Q1
package section_03.section_03_quiz;

public class section_03_quiz_01 {
    public static void main(String[] args) {
        int myAge = 23;     
        int teacherAge = 38;

        boolean value = (myAge > 25);
        System.out.println(value);
        
        System.out.println(myAge <= 25);
        System.out.println(myAge == teacherAge);

        char ch;
        ch = (myAge > teacherAge) ? 'T' : 'F';
        System.out.println(ch);

    }
}
