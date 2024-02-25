public class java_14주차_4_ColorPoint extends java_14주차_4_point{
    // 서브 클래스 (자식) extends 슈퍼 클래스 (부모) 
    private String color;
    void setColor(String color){
        this.color = color;
    }
    void showXYColor(){
        System.out.print(color);
        showXY();
    }    
    
}
