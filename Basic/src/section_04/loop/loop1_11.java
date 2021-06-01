/**
 * break문 사용해보기
 */


 // 0부터 시작해 1씩 늘리면서 합을 계산할 때 숫자를 몇까지 더하면 100이 넘는가?

package section_04.loop;

public class loop1_11 {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;

        for (num = 0; ; num++) {
            sum += num;
            if(sum >= 100)
            break;
        }

        System.out.println("num: " + num);
        System.out.println("sum: " + sum);
    }
}
