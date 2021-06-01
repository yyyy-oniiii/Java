
/*
 * 무한 반복문 만들기(Do-While)
 * ------------------------------
 * do-while 문을 이용하여 1부터 10까지 더하는 프로그램 만들기
 */ 

package section_04.loop;

public class loop1_3 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            sum += num; // 조건식이 참이 아니더라도 
            num++;      // 무조건 한 번은 수행하는 블록
        } while (num <= 50);

        System.out.println("1부터 50까지의 합은" + sum + "입니다.");
    }
}
