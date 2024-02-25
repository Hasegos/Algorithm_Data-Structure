package java_책_3단원;
import java.util.*;
public class 숫자0으로_나누는_예외에_대체하는_try_catch_블록만들기 {
    public static void main(String[] args) {
           Scanner scanner  = new Scanner(System.in);
           int dividend; // 나뉨수
           int divisor; // 나눗수

           System.out.print("나뉨수를 입력하세요:");
           dividend = scanner.nextInt();
           System.out.print("나눗수를 입력하세요:");
           divisor = scanner.nextInt();
           try
            {
                System.out.print(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
            }     
            catch(ArithmeticException e)
            {
                System.out.println("0으로 나눌 수 없습니다!");
            }
            finally
            {
                scanner.close();
            }    
        
    }
}

