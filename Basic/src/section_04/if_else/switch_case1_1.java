
/*
 * 순위에 따른 메달 부여
 * ------------------------------
 * 순위에 따라 다른 색깔의 매달을 부여한다
 * 순위에 들지 못하면 'A'값을 부여한다.
 */ 

package section_04.if_else;

public class switch_case1_1 {
    public static void main(String[] args) {

        int ranking = 1;
        String medalColor;

            switch(ranking) {
                case 1: medalColor = "Gold";
                        break;
                case 2: medalColor = "Silver";
                        break;
                case 3: medalColor = "Bronze";
                        break;

                default: 
                        medalColor = "A";
            }
            System.out.println(ranking + " 위에게 " + medalColor + " 메달을 수여합니다");
    }
}
