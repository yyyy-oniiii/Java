
// 1부터 더했을 때 합이 500이 넘는 자연수는 얼마인가?

package section_04.loop;

public class loop1_12 {
    public static void main(String[] args) {
        int num;
        int sum = 0;    // 변수 초기화

        for (num = 1; ; num++) {
            sum += num;
            if(sum >= 500)
            break;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
