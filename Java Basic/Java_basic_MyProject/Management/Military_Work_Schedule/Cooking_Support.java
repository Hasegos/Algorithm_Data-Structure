// static을 사용시 생성자에도 return 타입 써야한다.
// 취사지원
public class Cooking_Support {
    public int point = 0;
    public Cooking_Support(int point){        
        System.out.println("");
        System.out.println("취사지원 근무를 시작합니다.");
        System.out.println("취사지원 근무 시간 (06:50 ~ 08:15) (11:10 ~ 13:30) (17:10 ~ 18:30)입니다.");
        System.out.println("취사지원 근무 전체 한번 할때마다 5점 추가됩니다.");
        Cooking_Number cn = new Cooking_Number();
        System.out.println("");
        System.out.println("해당 총 피로도 점수는 5점입니다.");
        this.point += point + 5;
    }
    
    public int Point(){
        return this.point;
    }
}

class Cooking_Number{
    
    public Cooking_Number(){
        System.out.println("월요일 : 취사지원");
        System.out.println("화요일 : 취사지원");
        System.out.println("수요일 : 취사지원");
        System.out.println("목요일 : 취사지원");
        System.out.println("금요일 : 취사지원");
        
    }
}
