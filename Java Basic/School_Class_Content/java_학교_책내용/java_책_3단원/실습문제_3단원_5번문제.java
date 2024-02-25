package java_책_3단원;
import java.util.*;

public class 실습문제_3단원_5번문제 {
    
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int[] num = new int[10];        
        int tmp = 0;
        for(int i = 0 ; i < 10; i++)
        {
            num[i] = scanner.nextInt();            
        }
        for(int i = 0 ; i < 10; i++)
        {   
            for(int j = 0 ; j < 10; j++)     
            {
                if(num[i] > num[j])
                {
                    tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }                                   
        }
        for(int i = 9 ; i > -1; i--)
        {
            System.out.print(num[i]+"\t");          
        }        
        scanner.close();
    }
    
}
