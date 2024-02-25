package java_책_2단원;
import java.util.Scanner; // 키보드 생성
public class 조건문 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 키보드를 통해 무엇을 입력할지 받기


        System.out.print("나이를 입력하세요");
        int age =  scanner.nextInt();
        if((age >= 20) && (age < 30))
        {
             System.out.println("20대입니다");
             System.out.println("20대라서 행복합니다.");
        }

        else
        {
            System.out.println("20대가 아닙니다.");
        }
        
        scanner.close();
    }
    
}
