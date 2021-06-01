/*
 *   Q. '글' 이라는 한글 문자의 유니코드 값을 찾아서 char 형으로 선언한 변수에 저장한 뒤 그 변수를 출력하여 확인해 볼 것
 *   Ref: Do it! 자바 프로그래밍 입문 69p 연습문제 Q5
 *   ASCII Ref: http://unicode.org/charts/PDF/UAC00.pdf
 */



package section_02.type_conversion1;

public class type_conversion1_4 {
    public static void main(String[] args) {
        char ch1 = '\uAE00';    // \(백슬래시)u + 해당 아스키코드
        System.out.println(ch1);
    }
}
