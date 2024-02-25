package java_책_3단원;
import java.util.*;
public class 실습문제_3단원_6번문제 {
    
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        String eng[] = {"student","love","java","happy","future"};
        String kor[] = {"학생","사랑","자바","행복한","미래"};
        String name;
        while(true)
        {

            System.out.print("영어 단어 입력하세요>>");
            name = scanner.nextLine();
            if(name.equals("exit"))
            {
                System.out.println("종료합니다...");
                scanner.close();
                return;
            }            
            if(name.equals(eng[0]))
            {
                System.out.println(kor[0]);                  
            }            
            else if(name.equals(eng[1]))
            {
                System.out.println(kor[1]);                  
            }
            else if(name.equals(eng[2]))
            {
                System.out.println(kor[2]);                  
            }
            else if(name.equals(eng[3]))
            {
                System.out.println(kor[3]);                  
            }
            else if(name.equals(eng[4]))
            {
                System.out.println(kor[4]);                  
            }
            else
            {
                System.out.println("그런단어 없습니다.");                
            }            
        }        
    }
}
