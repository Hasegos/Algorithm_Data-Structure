package java_책_3단원;
import java.util.*;
public class 숫자0으로_나누기_시_예외발생으로_응용프로그램_강제종료하는경우 {
    public static void main(String[] args) {
           Scanner scanner  = new Scanner(System.in);
           int dividend; // 나뉨수
           int divisor; // 나눗수

           System.out.print("나뉨수를 입력하세요:");
           dividend = scanner.nextInt();
           System.out.print("나눗수를 입력하세요:");
           divisor = scanner.nextInt();
           System.out.print(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");  
            // 나눗수가 0일때 오류가난다. 그래서 try 로 해결해본다.


           scanner.close();
    }
    
}
