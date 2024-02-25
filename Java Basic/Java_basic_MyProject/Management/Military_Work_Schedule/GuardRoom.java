
// 위병소 관리 시스템
public class GuardRoom {
    public int point;  
    public GuardRoom(int point){
     this.point = point;   
    }
    public void Number(int number){
        
        System.out.println("위병소 "+number +"번초 입니다.");
        System.out.println("위병소 근무 한번당 3점입니다.");
        if(number == 1){
            System.out.println("기상 시간 : 05시 30분 입니다.");        
            System.out.println("조기 기상이 포함되어 있습니다.");       
            System.out.println("조기 기상일 경우 점수 1점입니다.");
            System.out.println("근무 시간 (06:00 ~ 08:00) , (12:00 ~ 14:00), (18:00 ~ 20:00) 입니다.");
            System.out.println("해당 피로도 점수는 6점입니다.");
            this.point += 6;   
        }
        else if(number == 2){
            System.out.println("기상 시간 : 정상 기상입니다.");
            System.out.println("근무 시간 (08:00 ~ 10:00) , (14:00 ~ 16:00), (20:00 ~ 22:00) 입니다.");
            System.out.println("해당 피로도 점수는 5점입니다.");
            this.point += 5;   
        }
        // 3번초라고 가정
        else{
            System.out.println("기상 시간 : 정상 기상입니다.");
            System.out.println("근무 시간 (10:00 ~ 12:00) , (16:00 ~ 18:00)입니다.");
            System.out.println("해당 피로도 점수는 4점입니다.");
            this.point += 4;
        }       
    }   
    public int Point(){
        return this.point;
    }
}
