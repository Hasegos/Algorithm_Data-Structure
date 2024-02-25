package java_책_4단원;
import java.util.*;
class Phone
{
    private String name , tel;
    public Phone(String name, String tel) // 생성자
    {
        this.name = name;
        this.tel = tel;
    }
    public  String getName()
    {
        return name;
    }
    public String getTel()
    {
        return tel;
    }
}
public class 실습문제_4단원_2번문제 {
    
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);        
        Phone[] phone = new Phone[2];
        for(int i = 0; i < phone.length; i++)
        {
            System.out.print("이름과 전화번호 입력 >>");
            phone[i] = new Phone(scanner.next(),scanner.next());
        }
        for(int i = 0; i < phone.length; i++)
        {
            System.out.println(phone[i].getName()+"의 번호 "+phone[i].getTel());
            
        }
        


        scanner.close();
    }
}
