public class java_14주차_4_ColorPoint_변형 extends java_14주차_4_point_변형{
    private String color;
    public java_14주차_4_ColorPoint_변형(int x, int y, String color)
    {
        super(x,y); // java_14주차_4_point_변형(x,y) 무조건 1번라인에 와야한다 부모 생성자를 불러낼때는
        this.color =color;
    }
    void setColor(String color){
        this.color = color;
    }
    void showXYColor(){
        System.out.print(color);
        showXY();
    }    
    
}
