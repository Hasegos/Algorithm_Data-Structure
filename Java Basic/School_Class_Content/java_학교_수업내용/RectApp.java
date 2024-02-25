import java.util.*;
public class RectApp {
    
    public static void main(String[] args) {
        // 객체 만들기 즉 c의 포인터 개념쓰기
        Scanner  scanner = new Scanner(System.in);
        Rect[] data= new Rect[5]; // Rect 라는 타입으로 배열공간만들기

        for(int i = 0; i < data.length; i++) // 배열수 바뀌는거 예방
        {
            data[i] = new Rect(); // Rect 타입으로 배열공간 만들었기에 객체생성
            System.out.print("넓이:");
            data[i].width = scanner.nextInt(); // 패키지안에있는 Rect 클래스 가져올거기에 넓이가져오고
            System.out.print("높이:");
            data[i].height = scanner.nextInt(); // 이또한 똑같음

        }
        // for(int i = 0; i < data.length; i++)   방법 1
        // {
        //     System.out.println("넓이:"+data[i].width+
        //     "높이:"+data[i].height+"==>면적:"+data[i].getArea()/*data[i] 해당 데이터 값을 주고 리턴값가져오기*/ );
        // }
            for(Rect tmp : data) // 이미 배열공간에 들어간 숫자들만 가져오는거라 상관 x 방법 2
            {
                System.out.println("넓이:"+tmp.width+
             "높이:"+tmp.height+"==>면적:"+tmp.getArea() );
            }   
        scanner.close();
    }
    
}
