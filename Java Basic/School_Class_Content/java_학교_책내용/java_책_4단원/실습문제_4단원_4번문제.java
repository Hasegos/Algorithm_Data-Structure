package java_책_4단원;
import java.util.*;
 //  238 쪽 까지 시험범위 5장 6장 기준으로
        
class Phone{
    private String name , tel;
    public Phone(String name, String tel)
    {
        this.name = name ; this.tel = tel;
    }   
    public String getName()
    {
        return name;
    }
    public String getTel()
    {
        return tel;
    }
    
}
public class 실습문제_4단원_4번문제 {      
    public static void main(String[] args) {       
        
        Scanner scanner = new Scanner(System.in);        
        System.out.print("인원수 >>");
        int num = scanner.nextInt();
        Phone[] Array = new Phone[num];              
              
        for(int i = 0; i < num; i++)
        {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >>");                       
            Array[i] = new Phone(scanner.next(),scanner.next());                                                                  
        }        
        System.out.println("저장되었습니다...");
         while(true)
        {            
            System.out.print("검색할 이름 >>");
            String arr = scanner.next();
           
            for(int i = 0; i < num ; i++)
            {
                if(arr.equals("exit"))
                {                   
                    System.out.println("프로그램을 종료합니다...");
                    scanner.close();  
                    return;                    
                }
                else if(arr.equals(Array[i].getName()))
                {
                    System.out.println(Array[i].getName()+" 번호는"+Array[i].getTel()+ " 입니다.");                    
                }
                else if(!arr.equals(Array[i].getName()) && i == (num - 1)) 
                {
                    System.out.println(arr+"이 없습니다.");
                }             
            }                     
        }             
    }   
}
