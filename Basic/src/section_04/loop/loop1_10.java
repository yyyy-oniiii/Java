/**
 * continue 문(2)
 */


 // 1부터 100까지 수 중에서 3의 배수만 출력하는 코드

package section_04.loop;

public class loop1_10 {
    public static void main(String[] args) {
        int num;
        for (num = 1; num <= 100; num++) {
            if (num % 3 != 0)
            continue;
        System.out.println(num);
        }
    }
}
