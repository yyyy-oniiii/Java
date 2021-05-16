/*
 * for 문의 예제
 * --------------------------------------------
 * "안녕하세요1, 안녕하세요2..., 안녕하세요10" 
 * 까지 차례로 출력하는 프로그램을 작성해보기
 */
package section_04.loop;

public class loop1_6 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        for (num = 1; num <= 10; num++)
        {
            System.out.println("안녕하세요" + num);
        }
        System.out.println("만나서 반가웠어요!");
    }
}
