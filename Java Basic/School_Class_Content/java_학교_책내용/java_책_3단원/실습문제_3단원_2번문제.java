package java_책_3단원;
import java.util.*;
public class 실습문제_3단원_2번문제 {
   
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int[] num = new int[11];
        System.out.print("정수 10개 입력>>");
        for(int i = 0 ; i < 10; i++)
        {
            num[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < 10; i++)
        {
            if(num[i] % 3 == 0)
            {
                System.out.print(num[i]+" ");
            }
        }
        scanner.close();
    }
    
}
