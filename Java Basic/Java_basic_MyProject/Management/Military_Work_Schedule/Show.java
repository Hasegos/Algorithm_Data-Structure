import java.util.*;

public class Show { 
    // work : 근무 입력 bool : yes or no 입력    
    public String work,bool;
    // number : 번호 입력
    public int  number;
     // point : 총 피로도 누적 점수
    public static int point;
    
    
    Scanner sc = new Scanner(System.in);     
    
    public Show(int point){    // 여기 point 기존 점수
       
        System.out.println("이번주 당신의 근무는 무엇입니까?");
        System.out.println("");
        System.out.println("1.위병소 2.cctv 3.주둔지 경계동초 4.취사지원 5.불침번");
        System.out.println("");
        System.out.println("해당 근무 번호를 입력하세요!!");
           
        number = sc.nextInt();
        
        // 위병소 
        if(number == 1){            
            System.out.println("위병소 근무 중에 1.사수,부사수 2.위병조장/밥교대 골라주세요");
            System.out.println("숫자만 입력해주세요.");
            number = sc.nextInt();
            switch(number){
                case 1:
                    GuardRoom gd = new GuardRoom(point);            
                    System.out.println("몇 번초 시작입니까?");
                    System.out.println("숫자만 입력해주세요!!!!");
            
                    number = sc.nextInt();
                    // 위병소 번초
                    switch (number){
                        case 1:
                           GuardRoom_Number1 g1 = new GuardRoom_Number1(gd); 
                           this.point = gd.Point();                           
                           System.out.println("");
                           System.out.println("총 피로도 누적은 " + this.point + " 점입니다.");        
                           break;
                        case 2:
                            GuardRoom_Number2 g2 = new GuardRoom_Number2(gd);
                            this.point = gd.Point();                            
                            System.out.println("");
                            System.out.println("총 피로도 누적은 " + this.point + " 점입니다.");
                            break;
                        case 3:
                            GuardRoom_Number3 g3 = new GuardRoom_Number3(gd);
                            this.point = gd.Point();                            
                            System.out.println("");
                            System.out.println("총 피로도 누적은 " + this.point + " 점입니다.");
                            break;
                        default:
                            System.out.println("다른걸 입력하셨습니다. 프로그램 종료합니다.");
                            System.exit(0);
                            break;
                        }
                    break;
                case 2:                   
                    // 위병조장 or 밥교대
                    System.out.println("근무시작 1.위병조장 2.밥교대");
                    System.out.println("해당 근무 번호를 입력해주세요!!");                    
                    // 그전 nextInt()를 할시 \n 이 남아있어서 개행 처리를 해야한다.
                    // 그래서 nextLine()으로 한번더 사용해서 \n없앤다.
                    sc.nextLine();                     
                    number = sc.nextInt();
                    // 순서
                    Guard_Number gn = new Guard_Number(number,point);
                    if(number == 1){                       
                         this.point = gn.point;                        
                         System.out.println("");
                         System.out.println("총 피로도 누적은 " + this.point + " 점입니다.");
                    }
                    else if(number == 2){                        
                         this.point = gn.point;                        
                         System.out.println("");
                         System.out.println("총 피로도 누적은 " + this.point + " 점입니다.");
                    }
                    else{
                        System.out.println("다른걸 입력하셨습니다. 프로그램 종료합니다.");
                        System.exit(0);                      
                    }
                    break;               
                default:
                    System.out.println("다른걸 입력하셨습니다. 프로그램 종료합니다.");
                    System.exit(0);                  
            }
        }        
        // cctv
        else if(number == 2){
            System.out.println("혹시 cctv 불침번 이십니까?");
            System.out.println("맞으면 yes 틀리면 no를 입력해주세요.");
            sc.nextLine();
            bool = sc.nextLine();
            if(bool.equals("yes")){
                Cctv_Night_Watch cnw = new Cctv_Night_Watch(point);
                this.point = cnw.Point();                
                System.out.println("");
                System.out.println("총 피로도 누적은 "+this.point+" 점입니다.");
            }
            else if(bool.equals("no")){
                Cctv ct = new Cctv(point);
                System.out.println("몇 번초 시작입니까?");
                System.out.println("숫자만 입력해주세요!!!!");
                number = sc.nextInt();
                switch(number){
                    case 1:
                        Cctv_Number1 cn1 = new Cctv_Number1(ct);
                        this.point = ct.Point();                        
                        System.out.println("");
                        System.out.println("총 피로도 누적은 "+this.point+" 점입니다.");
                        break;
                    case 2:
                        Cctv_Number2 cn2 = new Cctv_Number2(ct);
                        this.point = ct.Point();                        
                        System.out.println("");
                        System.out.println("총 피로도 누적은 "+this.point+" 점입니다.");
                        break;
                    case 3:
                        Cctv_Number3 cn3 = new Cctv_Number3(ct);
                        this.point = ct.Point();                       
                        System.out.println("");
                        System.out.println("총 피로도 누적은 "+this.point+" 점입니다.");
                        break;
                    case 4:
                        Cctv_Number4 cn4 = new Cctv_Number4(ct);
                        this.point = ct.Point() ;                        
                        System.out.println("");
                        System.out.println("총 피로도 누적은 "+this.point+" 점입니다.");
                        break;
                    default:
                         System.out.println("다른걸 입력하셨습니다. 프로그램 종료합니다.");
                         System.exit(0);
                         break;               
                }                
            }
            else{
                System.out.println("잘못된 입력입니다. 종료합니다.");
                System.exit(0);
            }             
        }
        // 주둔지 경계동초
        else if(number == 3){
           Post ps = new Post(point);            
           this.point = ps.Point();           
           System.out.println(""); 
           System.out.println("총 피로도 누적은 "+this.point+" 점입니다."); 
        }
        // 취사지워
        else if(number == 4){            
            Cooking_Support cs = new Cooking_Support(point);            
            this.point = cs.Point();            
            System.out.println("");
            System.out.println("총 피로도 누적은 "+this.point+" 점입니다."); 
        }
        // 불침번
        else if(number == 5){
            Night_Watch nw = new Night_Watch(point);
            this.point = nw.Point();            
            System.out.println("");
            System.out.println("총 피로도 누적은 "+this.point+" 점입니다."); 
        }
        // 위 근무가 아닌경우
        else{
            System.out.println(work +" 와 같은 근무는 존재하지않습니다. 다시입력해주세요");
            System.exit(0);
        }   
        
    }    
 
    
}
