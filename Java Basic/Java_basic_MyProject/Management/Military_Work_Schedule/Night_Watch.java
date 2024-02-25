import java.util.Scanner;
// 불침번
public class Night_Watch {
    public int point,number;
    Scanner sc = new Scanner(System.in);
    public Night_Watch(int point){
        
        System.out.println("몇번 초 이십니까? (1 ~ 5번) 숫자만 입력해주세요");
        number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("");
                System.out.println("불침번 1번초 시작합니다.");
                System.out.println("불침번 1번초 근무 시간 (22:00 ~ 23:40)입니다.");
                System.out.println("해당 피로도 점수는 2점입니다.");
                this.point += point + 2;
                break;
            case 2:
                System.out.println("");
                System.out.println("불침번 1번초 시작합니다.");
                System.out.println("불침번 1번초 근무 시간 (23:40 ~ 01:20)입니다.");
                System.out.println("해당 피로도 점수는 4점입니다.");
                this.point += point + 4;
                break;
            case 3:
                System.out.println("");
                System.out.println("불침번 1번초 시작합니다.");
                System.out.println("불침번 1번초 근무 시간 (01:20 ~ 03:00)입니다.");
                System.out.println("해당 피로도 점수는 3점입니다.");
                this.point += point + 3;
                break;
            case 4:
                System.out.println("");
                System.out.println("불침번 1번초 시작합니다.");
                System.out.println("불침번 1번초 근무 시간 (03:00 ~ 04:40)입니다.");
                System.out.println("해당 피로도 점수는 4점입니다.");
                this.point += point + 4;
                break;
            case 5:
                System.out.println("");
                System.out.println("불침번 1번초 시작합니다.");
                System.out.println("불침번 1번초 근무 시간 (04:40 ~ 06:30)입니다.");
                System.out.println("해당 피로도 점수는 2점입니다.");
                this.point += point + 2;
                break;
            default: 
                System.out.println("잘못된 입력입니다. 종료합니다.");
                System.exit(0);               
        }       
        
    }
    
    public int Point(){        
        return this.point;
    }
    
}

