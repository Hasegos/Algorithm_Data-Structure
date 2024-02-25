package java_책_5단원;

class  Point_1{
    private int x , y; // 한 점을 구성하는 x , y 좌표
    public Point_1()
    {
        this.x = 0; this.y = 0; 
    }
    public Point_1(int x , int y)
    {
        this.x = x; this.y = y; 
    }
    public void showPoint(){ // 점의 좌표 출력
        System.out.println("("+ x +","+ y +")");
    }
    
}
class ColorPoint_1 extends Point_1{
    private String color; // 점의 색
    public ColorPoint_1(int x , int y  ,String color)
    {
        super(1,2);
        this.color = color;
    }
    public  void  showColorPoint()
    {
        System.out.print(color);
        showPoint();
    }
}
public class super를_활용한_ColorPoint_작성 {
    
    public static void main(String[] args) {
        ColorPoint_1 cp = new ColorPoint_1(5, 6, "blue");
        cp.showColorPoint();
    }
}
