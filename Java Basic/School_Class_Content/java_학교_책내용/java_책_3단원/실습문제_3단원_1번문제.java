package java_책_3단원;
import java.util.*;
public class 실습문제_3단원_1번문제 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳 한 문자를 입력하세요");
        String s = scanner.next();
        char c = s.charAt(0);      
        int k = 0 ,count = 97;
        int a=(int)c;
        char b ;
        for(int i = 97; i < 123; i++)
        {
            if(a == i)
            {    
                while(count <= a)        
                {
                    for(int j = 97 + k; j <= a; j++)
                    {
                        b = (char)j;
                        System.out.print(b); 
                                        
                    }
                    System.out.println(); 
                    k++; 
                    count ++;                    
                }            
            }
        }        
        scanner.close();
    }
    
}
