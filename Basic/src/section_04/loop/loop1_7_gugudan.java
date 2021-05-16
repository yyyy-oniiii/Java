/**
 * 중첩된 반복문(구구단 만들기); Nested Loop
 * ------------------------------------------------
 * 반복문 내에 또 다른 반복문을 중첩해서 사용할 수 있음
 */

package section_04.loop;

public class loop1_7_gugudan {
    public static void main(String[] args) {
        int dan;
        int times;

        // 2단부터 9단까지 반복하는 외부 반복문
        for(dan = 2; dan <= 9; dan++) {
            // 각 단에서 1~9를 곱하는 내부 반복문
            for(times = 1; times <= 9; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();   // 한 줄 띄워서 출력
        }
        System.out.println("구구단을 종료합니다");
    }
}
