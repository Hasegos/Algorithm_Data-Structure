package java_책_5단원;

class SuperObject{
    public void paint(){draw();}
    public void draw()
    {
        draw();
        System.out.println("Super Object");
    }
}
class SubObject extends SuperObject{
    public void paint(){super.draw();}
    public void draw()
    {
        System.out.println("Sub Object");
    }
}
public class Check_Time {
    
    public static void main(String[] args) {
        SuperObject b = new SubObject();
        b.paint();  // class SubObject extends SuperObject 라는 클래스의 paint 호출 
                    // 부모인 SuperObject 의 draw() 호출 draw() 실행해서  Sub Object 출력후
                    // Super Object 실행.      
    }
    
}
