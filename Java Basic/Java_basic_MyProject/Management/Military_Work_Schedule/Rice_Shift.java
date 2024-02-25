

public class Rice_Shift {
    public int point;
    public Rice_Shift(int point){
        
       System.out.println("");   
       System.out.println("밥교대 입니다.");
       System.out.println("밥교대 시작으로 하겠습니다.");
       System.out.println("조기 기상이 포함되어 있습니다.");       
       System.out.println("조기 기상일 경우 점수 1점입니다.");
       System.out.println("위병 조장 근무 한번당 4점입니다.");       
       System.out.println("밥교대 근무 한번당 1점입니다.");   
       Order2 or2 = new Order2();       
       System.out.println("해당 피로도 점수는  13점 입니다.");
       this.point += point + 13; 
       System.out.println("주말은 제외합니다.");        
        
        
    }
    // 밥교대 근무 시간 알려주기
    public static void Print(){
        System.out.println("밥교대 근무 시간 (06시 50분 ~ 08시) (11시 30분 ~ 13시) (17시 30분 ~ 18시) 입니다.");        
    }
    public int Point(){
        return this.point;        
    }
}
// 밥교대 시작
class Order2{
    
    public Order2(){
       System.out.println(""); 
       System.out.println("월요일 : 밥교대");
       System.out.println("밥교대 근무 시간 (06시 50분 ~ 08시) (11시 30분 ~ 13시) (17시 30분 ~ 18시) 입니다.");   
       System.out.println("");
        
       System.out.println("화요일 : 위병조장");
       Guard_Leader.Print();
       System.out.println("");
        
       System.out.println("수요일 : 밥교대");
       System.out.println("밥교대 근무 시간 (06시 50분 ~ 08시) (11시 30분 ~ 13시) (17시 30분 ~ 18시) 입니다.");
       System.out.println(""); 
        
       System.out.println("목요일 : 위병조장");     
       Guard_Leader.Print();
       System.out.println(""); 
        
       System.out.println("금요일 : 밥교대");
       System.out.println("밥교대 근무 시간 (06시 50분 ~ 08시) (11시 30분 ~ 13시) (17시 30분 ~ 18시) 입니다.");
       System.out.println(""); 
    }  
}