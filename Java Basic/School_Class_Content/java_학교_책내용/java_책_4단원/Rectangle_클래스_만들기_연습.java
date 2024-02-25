package java_책_4단원;
import java.util.*;

class Rectangle{

    int width = 0;
    int height = 0;
    public int getArea()
    {
        return width * height;
    }
}
public class Rectangle_클래스_만들기_연습 {
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        rect.width  = scanner.nextInt();
        rect.height  = scanner.nextInt();
        System.out.println("사각형의 면적은"+rect.getArea());
        scanner.close();
        
    }
    
}
