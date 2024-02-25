import java.util.*;
// cctv 
// 점수 수정 가능성 있음
public class Cctv {
    public int point;
    Scanner sc = new Scanner(System.in);
    public Cctv(int point){        
        this.point = point;
    }    
    public void Number(int number){
        
        System.out.println("cctv 근무 " +number+"번초 입니다.");              
        switch(number){
            case 1:
                System.out.println("오전 근무 시간  (07:00 ~ 07:30) (09:00 ~ 09:30) (11:00 ~ 11:30) 입니다.");
                System.out.println("오후 근무 시간  (13:00 ~ 13:30) (15:00 ~ 15:30) (17:00 ~ 17:30) (19:00 ~ 1930) (21:00 ~ 21:30)입니다.");
                System.out.println("해당 피로도 점수는 3점입니다.");                
                this.point +=  3;                
                break;
            case 2:                
                System.out.println("오전 근무 시간  (07:30 ~ 08:00) (09:30 ~ 10:00) (11:30 ~ 12:00) 입니다.");
                System.out.println("오후 근무 시간  (13:30 ~ 14:00) (15:30 ~ 16:00) (17:30 ~ 18:00) (19:30 ~ 20:00) (21:30 ~ 22:00)입니다.");
                System.out.println("해당 피로도 점수는 2점입니다.");
                this.point += 3;
                break;
            case 3:                
                System.out.println("오전 근무 시간  (08:00 ~ 08:30) (10:00 ~ 10:30)  입니다.");
                System.out.println("오후 근무 시간  (12:00 ~ 12:30) (14:00 ~ 14:30) (16:00 ~ 16:30) (18:00 ~ 18:30) (20:00 ~ 20:30) 입니다.");
                System.out.println("해당 피로도 점수는 3점입니다.");
                this.point +=2;
                break;
            case 4:                
                System.out.println("오전 근무 시간  (08:30 ~ 09:00) (10:30 ~ 11:00)입니다.");
                System.out.println("오후 근무 시간  (12:30 ~ 13:00) (14:30 ~ 15:00) (16:30 ~ 17:00) (18:30 ~ 19:00) (20:30 ~ 21:00)입니다.");
                System.out.println("해당 피로도 점수는 2점입니다.");
                this.point +=2;
                break;
            default:
                System.out.println("잘못된 경우입니다.");
                System.exit(0);
        }        
       
    }
    
    public int Point(){
        return this.point;
    }
}





   


     


     


     
