package java_책_3단원;

public class 실습문제_3단원_7번문제 {
    
    public static void main(String[] args) {
        
        
        
        for(int i = 1; i < 100; i++)
        {
            if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) //  3 6 9 기반
            {
                if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) // 30 60 90 일때
                {
                    System.out.println(i+" 박수두번");
                    continue;
                }    
                System.out.println(i+" 박수한번");                          
            }
            if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) //  30 60 90 기반
            {
                if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
                {
                    continue;
                }
                System.out.println(i+" 박수한번"); 
            }                  
        }
    }
}
