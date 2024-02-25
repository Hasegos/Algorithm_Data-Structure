import java.util.Scanner;

// 불침번 cctv일경우
public class Cctv_Night_Watch{
    public int point,number;
    public String order;
    Scanner sc = new Scanner(System.in);
    public Cctv_Night_Watch(int point){
        
        System.out.println("몇번 초 이십니까? (1 ~ 5번) 숫자만 입력해주세요");
        number = sc.nextInt();
        System.out.println("cctv 먼저 들어 가시나요? 불침번 먼저 들어 가시나요? ");
        System.out.println("cctv 일경우 cctv를 입력해주시고 불침번이면 불침번을 입력해주세요 ");        
        // 개행처리
        sc.nextLine();
        order = sc.nextLine();
        switch(number){
            case 1:
                if(order.equals("cctv")){
                    System.out.println("");
                    System.out.println("cctv 불침번 1번초 시작합니다.");                
                    System.out.println("cctv 근무 시간  (22:00 ~ 22:30)(23:00 ~ 23:30)(00:00 ~ 00:30)입니다.");
                    System.out.println("불침번 근무 시간  (22:30 ~ 23:00)(23:30 ~ 00:00)입니다.");                     
                }
                else if(order.equals("불침번")){
                    System.out.println("");
                    System.out.println("cctv 불침번 1번초 시작합니다.");                
                    System.out.println("cctv 근무 시간  (22:30 ~ 23:00)(23:30 ~ 00:00)입니다.");  
                    System.out.println("불침번 근무 시간  (22:00 ~ 22:30)(23:00 ~ 23:30)(00:00 ~ 00:30)입니다.");                    
                }
                else{
                    System.out.println("잘못된 입력입니다. 종료합니다.");
                    System.exit(0);    
                }
                System.out.println("해당 피로도 점수는 2점입니다.");
                this.point = point + 2;
                break;
            case 2:
                if(order.equals("cctv")){
                    System.out.println("");
                    System.out.println("cctv 불침번 2번초 시작합니다.");                
                    System.out.println("cctv 근무 시간  (00:30 ~ 01:00)(02:00 ~ 02:30)입니다.");
                    System.out.println("불침번 근무 시간  (01:30 ~ 02:00)(02:30 ~ 03:00)입니다.");                     
                }
                else if(order.equals("불침번")){
                    System.out.println("");
                    System.out.println("cctv 불침번 2번초 시작합니다.");
                    System.out.println("cctv 근무 시간  (01:30 ~ 02:00)(02:30 ~ 03:00)입니다.");                    
                    System.out.println("불침번 근무 시간  (00:30 ~ 01:00)(02:00 ~ 02:30)입니다.");                    
                }
                else{
                    System.out.println("잘못된 입력입니다. 종료합니다.");
                    System.exit(0);    
                }
                System.out.println("해당 피로도 점수는 4점입니다.");
                this.point = point + 4;
                break;
            case 3:
                if(order.equals("cctv")){
                    System.out.println("");
                    System.out.println("cctv 불침번 3번초 시작합니다.");                
                    System.out.println("cctv 근무 시간  (03:00 ~ 03:30)(04:00 ~ 04:30)입니다.");
                    System.out.println("불침번 근무 시간  (03:30 ~ 04:00)(04:30 ~ 05:00)입니다.");                     
                }
                else if(order.equals("불침번")){
                    System.out.println("");
                    System.out.println("cctv 불침번 3번초 시작합니다.");
                    System.out.println("cctv 근무 시간  (03:30 ~ 04:00)(04:30 ~ 05:00)입니다.");  
                    System.out.println("불침번 근무 시간  (03:00 ~ 03:30)(04:00 ~ 04:30)입니다.");                                       
                }
                else{
                    System.out.println("잘못된 입력입니다. 종료합니다.");
                    System.exit(0);    
                }
                System.out.println("해당 피로도 점수는 3점입니다.");
                this.point = point + 3;
                break;
            case 4:
                if(order.equals("cctv")){
                    System.out.println("");
                    System.out.println("cctv 불침번 4번초 시작합니다.");                
                    System.out.println("cctv 근무 시간  (05:00 ~ 05:30)(06:00 ~ 06:30)입니다.");
                    System.out.println("불침번 근무 시간  (05:30 ~ 06:00)(06:30 ~ 07:00)입니다.");                     
                }
                else if(order.equals("불침번")){
                    System.out.println("");
                    System.out.println("cctv 불침번 4번초 시작합니다.");                
                    System.out.println("cctv 근무 시간  (05:30 ~ 06:00)(06:30 ~ 07:00)입니다.");
                    System.out.println("불침번 근무 시간  (05:00 ~ 05:30)(06:00 ~ 06:30)입니다.");                                        
                }
                else{
                    System.out.println("잘못된 입력입니다. 종료합니다.");
                    System.exit(0);    
                }
                System.out.println("해당 피로도 점수는 4점입니다.");
                this.point = point + 4;
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
