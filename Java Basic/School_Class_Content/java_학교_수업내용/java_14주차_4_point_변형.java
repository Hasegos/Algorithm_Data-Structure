public class java_14주차_4_point_변형 {
    private int x,y;

    public java_14주차_4_point_변형() // 이걸 부모로 가질 클래스에서 
    {                                // 만약 개발자가 어떤 클래스를 가져올지 지정안한다면
        x = y = 0;                   // 가장 컴파일러가 기본껄 가져온다
    }
    public java_14주차_4_point_변형(int x,int y)
    {
        this.x = x; this.y = y;
    }
    void setXY(int x, int y){
        this.x = x;
         this.y =y;
    }
    void showXY(){
        System.out.println("(x:"+ x+", y:"+y+")");
    }
    
}
