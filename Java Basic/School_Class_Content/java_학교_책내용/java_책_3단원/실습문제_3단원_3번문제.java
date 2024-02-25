package java_책_3단원;
import java.util.*;
public class 실습문제_3단원_3번문제 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("정수를 입력하세요>>");        
        try
        {
            
            int num = scanner.nextInt(); // 예외 발생없을 시 정수 입력받기
            if(num % 2 == 0)
            {
                System.out.print("짝수");
            }
            else if(num % 2 != 0)
            {
                System.out.print("홀수");
            }
        }
        catch(InputMismatchException e)
        {
            System.out.print("수를 입력하지않아 프로그램 종료합니다");
            scanner.next();
            return;
        }
        finally
        {
            scanner.close();
        }
    }
}
