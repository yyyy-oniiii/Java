/*
 * 문자열을 사용하여 case 문 구현하기
 * ------------------------------
 */ 


package section_04.if_else;

public class switch_case1_3 {
    public static void main(String[] args) {
        String medal = "Silver";

        switch(medal) {
            
            case "Gold":
            System.out.println("금메달 입니다");
            break;

            case "Silver":
            System.out.println("은메달 입니다");    
            break;

            case "Bronze":
            System.out.println("동메달 입니다");
            break;

            default:
            System.out.println("순위권 밖입니다");
            break;
        }
    }
}

