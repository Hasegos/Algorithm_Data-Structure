package java_책_3단원;
import java.util.*;
public class 실습문제_3단원_4번문제 {    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char day[] ={'일','월','화','수','목','금','토'};
        while(true)
        {
            
            try
            {
            int num = 0, result = 0;
            System.out.print("정수를 입력하세요>>");
            num = scanner.nextInt();
            if(num < 0)
            {
                System.out.println("프로그램을종료합니다...");
                scanner.close();
                return;
            }
            result = num % 7;
            for(int j = 0; j <  7;  j++)
                {
                if(result == j)
                    {
                        System.out.println(day[j]);
                    }
                }     
            }
            catch(InputMismatchException e)
            {
                System.out.println("경고! 수를 입력하지않았습니다.");
                scanner.next();
            }
        }      
    }
}
