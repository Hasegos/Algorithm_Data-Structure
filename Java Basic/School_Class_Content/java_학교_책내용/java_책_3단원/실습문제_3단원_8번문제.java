package java_책_3단원;
import java.util.*;
public class 실습문제_3단원_8번문제 {
    
    public static void main(String[] args) {
        // equals 문자열 비교
        Scanner scanner = new Scanner(System.in);
        String str[] = {"가위","바위","보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");        
        String hand;       
        while(true)
        {
            System.out.print("가위 바위 보!>>");
            hand = scanner.nextLine();            
            if(hand.equals("그만"))
            {
                
                System.out.println("게임을 종료합니다...");
                scanner.close();
                return;
            }
            int n = (int)(Math.random()*3);          
            if(str[n].equals("가위")) // 가위
            {                
               if(hand.equals("가위"))
               {
                   System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
               }
               else if(hand.equals("보"))
               {
                   System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
               }
               else if(hand.equals("바위"))
               {
                   System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
               }
            }
            else if(str[n].equals("보")) // 보
            {
                if(hand.equals("보"))
                {
                    System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
                }
                else if(hand.equals("가위"))
                {
                    System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
                }
                else if(hand.equals("바위"))
                {
                    System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
                }               
            }
            else // 바위
            {
                if(hand.equals("바위"))
                {
                    System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
                }
                else if(hand.equals("보"))
                {
                    System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
                }
                else if(hand.equals("가위"))
                {
                    System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
                }
            }
        }
    }
}
