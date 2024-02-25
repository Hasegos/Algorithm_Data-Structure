import java.util.*;
public class RectApp_2번째_변형 {    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rect_2번째_변형 data = new Rect_2번째_변형(); //  객체 생성
        Rect_2번째_변형.name = "ulsan";
        System.out.print("높이:");
        data.setWidth(scanner.nextInt()); // 입력 함수에 입력해주기
        System.out.print("넓이:");
        data.setHeight(scanner.nextInt());
        System.out.println("이름:"+Rect_2번째_변형.name+" 높이:"+data.getHeight()+
        "==>면적: "+data.getArea()); // 출력 함수들 출력


        Rect_2번째_변형 data2 = new Rect_2번째_변형(); //  객체 생성
        Rect_2번째_변형.name = "seoul";
        System.out.print("높이:");
        data2.setWidth(scanner.nextInt());
        System.out.print("넓이:");
        data2.setHeight(scanner.nextInt());
        System.out.println("이름:"+Rect_2번째_변형.name+" 높이:"+data2.getHeight()+
        "==>면적: "+data2.getArea());

        System.out.println(Rect_2번째_변형.name);        

        scanner.close();
        
    }    
    
    
}
