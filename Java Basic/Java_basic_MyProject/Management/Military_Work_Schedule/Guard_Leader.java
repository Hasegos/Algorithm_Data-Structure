// 위병 조장 관리 시스템

public class Guard_Leader {

    public int point; 
    public  Guard_Leader(int point){
        
       System.out.println(""); 
       System.out.println("위병 조장입니다.");
       System.out.println("위병 조장 시작으로 하겠습니다.");
       System.out.println("조기 기상이 포함되어 있습니다.");
       System.out.println("조기 기상일 경우 점수 1점입니다.");
       System.out.println("위병 조장 근무 한번당 4점입니다.");
       System.out.println("밥교대 근무 한번당 1점입니다.");   
       Order1 or1 = new Order1();       
       System.out.println("해당 피로도 점수는 17점 입니다.");
       this.point += point + 17; 
       System.out.println("주말은 제외합니다."); 
    }

    // 위병조장 시간 알려주기
    public static void Print(){
        System.out.println("위병 조장 근무 시간 (06 ~ 22)시 입니다.");
    }

    public int Point(){
        return this.point;
    }
}

// 위병 조장 시작

class Order1{
    
    public Order1(){
       System.out.println(""); 
       System.out.println("월요일 : 위병조장");
       System.out.println("위병 조장 근무 시간 (06 ~ 22시) 입니다.");
       System.out.println("");
        
       System.out.println("화요일 : 밥교대");
       Rice_Shift.Print();
       System.out.println("");
        
       System.out.println("수요일 : 위병조장");
       System.out.println("위병 조장 근무 시간 (06 ~ 22시) 입니다.");
       System.out.println(""); 
        
       System.out.println("목요일 : 밥교대"); 
       Rice_Shift.Print();
       System.out.println(""); 
        
       System.out.println("금요일 : 위병조장");
       System.out.println("위병 조장 근무 시간 (06 ~ 22시) 입니다.");
       System.out.println(""); 
    }  
}