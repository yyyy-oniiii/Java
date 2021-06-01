package section_04.loop;

public class loop1_8_gugudan {
    public static void main(String[] args) {
        int dan = 3;
        int times;
        for (; dan <= 7; dan++) {
            for (times = 1; times <=9; times++) {   // 내부 반복문은 반드시 초기화를 해주어야 한다
                System.out.println(dan + "X" + times + "=" + dan * times);
            }   
            System.out.println();
        }
            System.out.println("구구단 3단부터 7단까지");
    }   
}
