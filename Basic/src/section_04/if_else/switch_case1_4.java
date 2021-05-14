/*
 * Q. 
 * 5층 건물이 있다. 
 * 1층 약국, 2층 정형외과, 3층 피부과, 4층 치과, 5층 헬스클럽
 * 건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있다고 했을 때, 
 * 5층인 경우, '5층 헬스 클럽입니다' 라고 출력해주는 프로그램을 
 * switch 문을 이용해 작성할 것
 */ 

package section_04.if_else;

public class switch_case1_4 {
    public static void main(String[] args) {
        
        int floor = 5;

        switch(floor){
            
            case 1:
            System.out.println(floor + "층, 약국");
            break;

            case 2:
            System.out.println(floor + "층, 정형외과");
            break;

            case 3:
            System.out.println(floor + "층, 피부과");   
            break;

            case 4:
            System.out.println(floor + "층, 치과"); 
            break;

            case 5: 
            System.out.println(floor + "층, 헬스클럽");
            break;

            default:
            System.out.println("버튼을 다시 눌러주세요");
            break;
        }
    }   
}
