
/*
 * 반복문 만들기(While)
 * ------------------------------
 * while 문을 이용하여 1부터 10까지의 합 구하기
 */ 

package section_04.loop;

public class loop1_1 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은" + sum +" 입니다");
    }
}

