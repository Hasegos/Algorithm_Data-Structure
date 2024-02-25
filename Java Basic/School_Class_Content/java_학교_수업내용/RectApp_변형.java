import java.util.*;
public class RectApp_변형 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rect_변형[] data = new Rect_변형[5]; // Rect_변형 클래스로 객체 만들기 

        for(int i = 0;  i < data.length; i++)
        {
            data[i] = new Rect_변형();
            System.out.print("넓이:");
            data[i].setWidth(scanner.nextInt()); // 입력받을 함수에 숫자입력
            System.out.print("높이:");
            data[i].setHeight(scanner.nextInt());
        }
        for(Rect_변형 tmp : data )
        {
            System.out.println("넓이:"+tmp.getWidth()+"높이:"+tmp.getWidth()+"==>면적:"+tmp.getArea());
        }
        scanner.close();

    }
    
}
