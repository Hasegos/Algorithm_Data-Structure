package java_책_2단원;
import java.util.*;
public class final_bonus_문제1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("식을 입력하세요");
        double op1 = scanner.nextInt();
        String operator = scanner.next();
        double op2 = scanner.nextInt();
        double result = 0;
        scanner.close();
        switch(operator)
        {
            case "+":result = op1 + op2; break;
            case "-":result = op1 - op2; break;
            case "*":result = op1 * op2; break;
            case "/":
                if(op2 == 0)
                {
                    System.out.println("0 으로 나눌 수 없습니다.");
                    return;
                }
                result = op1 / op2; break;
       
        default:System.out.println("연산 기호가 잘못되었습니다.");
        }
        System.out.println(result);
        
    }
    
}
