import java.util.Scanner;
import java.util.ArrayList;
public class Military_Work_Schedule {
    /*
        군대 근무표 피로도 만들기
        1. 위병소 2.주둔지 경계동초 3.cctv 근무 4.취사지원 5.불침번
        
        피로도 점수를 만들어서 다음에 근무를 들어갈지 말지 결정하는 프로젝트
    
        점수 1 ~ 5점
    
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // point : 총 피로도 누적 점수
        int point = 0;        
        String run;
       
        
        ArrayList<Show> show = new ArrayList<Show>();
        show.add(new Show(point));                
        while(true){                    
            point = Show.point;
            System.out.println("근무를 더적으시겠습니까?");
            System.out.println("더 하실거면 yes 를 안하실거면 no 를 적어주세요");
            run = sc.nextLine();
            
            if(run.equals("yes")){                
                show.add(new Show(point));                
            }
            else if(run.equals("no")){
                break;
            }
            else {
                System.out.println("잘못된 입력입니다. 프로그램 종료합니다.");
                System.exit(0);                
            }
            
            
        }
        
    }
}

