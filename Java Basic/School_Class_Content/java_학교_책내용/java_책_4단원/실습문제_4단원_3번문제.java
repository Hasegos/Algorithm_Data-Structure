package java_책_4단원;
import java.util.*;
class Rect
{
    private int width , height ;
    public Rect(int width , int height)
    {
        this.width = width ; this.height = height;
    }
    public int getArea()
    {
        return width * height;
    }
}

public class 실습문제_4단원_3번문제 {
    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        Rect[] Rect = new Rect[4];
        int sum = 0;
        for(int i = 0; i < Rect.length; i++)
        {
            System.out.print((i+1)+" 너비와 높이 >>");
            Rect[i] = new Rect(scanner.nextInt(),scanner.nextInt());
            sum += Rect[i].getArea();            
        }
        System.out.println("저장하였습니다...");
        System.out.println("사각형의 전체 합은 "+sum);
       
        scanner.close();
    }
    
}
