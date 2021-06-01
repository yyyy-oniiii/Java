/**
 * continue 문 (1)
 */


 // 1부터 100까지의 수를 더할 때 홀수일 때만 더하고 짝수일 때는 더하지 않는 프로그램
 // 조건이 참이고, continue 를 만나면 증감식을 수행한다
 // 조건이 거짓이면 continue 이후 문을 수행한다

package section_04.loop;

public class loop1_9 {
    public static void main(String[] args) {
        int total = 0;
        int num;

        for (num = 1; num <= 100; num++) {
            if (num % 2 == 0)   // num 값이 짝수인 경우
            continue;           // 이후 수행을 생략하고 num++ 수행
            total += num;       // num 값이 홀수인 경우에만 수행
        }
        System.out.println("1부터 100까지 홀수의 합은" + total + "입니다");
    }
}
