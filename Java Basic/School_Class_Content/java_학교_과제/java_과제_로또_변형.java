import java.util.*;
public class java_과제_로또_변형 {  
    public static void main (String[] args){    
            Scanner scanner = new Scanner(System.in);
            int num =0; num = scanner.nextInt();
            for(int i = 0; i < num; i++)
            {
                revalue();
            }         
            scanner.close();
    }
    static void revalue()
    {
        int count = 0; int[] num = new int[7];
        int tmp = 0, check = 0;
        while (count!=7)
        {
            tmp = (int)((Math.random()*45)+1);
            for(int i=0; i <count; i++)
            {
                if(tmp == num[i])
                {
                check = 1;
                break;
                }
            }
            if(check == 1)
            {
                check = 0;
                continue;
            }
            num[count] = tmp;
            count ++;
        }    
        
        for(int i=0; i < 7; i++)
        {
            if(i ==6)
            {
                System.out.print("보너스 숫자"+num[i]);
            }
            else
            {
                System.out.print((i+1)+"번"+num[i]+" ");
            }
        }
        
        System.out.println();
    }
}
