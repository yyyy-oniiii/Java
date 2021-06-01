/*
 * 각 case의 조건이 같은 경우의 작성법
 * ------------------------------
 * 각 달(month)의 일수(days) 세기
 */ 


package section_04.switch_case;

public class switch_case1_2 {
    public static void main(String[] args) {

        int days = 31;
        int month = 4;

        switch(month) {
            
            case 1: case 3 : case 5: case 7 : case 8: case 10 : case 12 : days = 31;
                break;

            case 4: case 6 : case 9 : case 11 : days = 30;
                break;

            case 2 : days = 28;
                break;
        }
        System.out.println(month + "월은" + days + "일 입니다.");
    }
}
