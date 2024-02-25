
// 주둔지 경계동초
public class Post {
    public int point;
    public Post(int point){
        System.out.println("");
        System.out.println("주둔지 경계동초 근무 시작합니다.");
        System.out.println("주둔지 경계동초 근무시간 (06시50분 ~ 07시10분) (18시 ~ 18시 20분)입니다.");
        System.out.println("주둔지 경계동초 전체 할때마다 1점씩 추가됩니다.");
        System.out.println("해당 근무 피로도는 1점입니다.");
        this.point += point + 1;
    }
    public int Point(){
        return this.point;
    }
}
