package java_책_3단원;
import java.util.*;
public class continue_문을_이용하여_양수_합구하기 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 5개를 입력하세요.");
        int sum = 0;
        for(int i = 0 ; i < 5; i++)
        {
            int n = scanner.nextInt();
            if(n <=0)
            {
                continue;
            }
            else
            {
                sum +=n;
            }
        } 
        System.out.println(sum);
        scanner.close();       
    }
    
}
