package java_책_3단원;
import java.util.*;
public class break_문을_이용하여_while_문벗어나기 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit을 입력하면 종료합니다.");
        while(true)
        {
            String text =scanner.nextLine();
            if(text.equals("exit")) // equals 는 문자열 비교시 사용한다.
            {
                break; // 종료
            }
        }
        System.out.println("종료합니다");
        scanner.close();
    }
    
}
