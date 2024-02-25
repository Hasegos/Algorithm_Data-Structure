package java_책_4단원;

public class Circle_배열_만들기 {
    int radius;
    public Circle_배열_만들기(int radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return 3.14 *radius * radius;
    }
    
    public static void main(String[] args) {
        Circle_배열_만들기 [] c = new Circle_배열_만들기[5]; // Circle 배열에 대한 래퍼런스 c선언 후 5개 배열공간만들기
         // 클래스에대한 배열 공간 만들기
        for(int i = 0;  i < c.length; i++)
        {
            c[i] = new Circle_배열_만들기(i); // 각 원소에 객체 호출
        }
        for(int i = 0;  i < c.length; i++)
        {
            System.out.print((int)(c[i].getArea())+" ");
        }        
    }
    
}
