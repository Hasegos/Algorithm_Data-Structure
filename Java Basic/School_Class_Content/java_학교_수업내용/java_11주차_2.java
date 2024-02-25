import java.util.*;
public class java_11주차_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hap, score ;
        try{
            score = hap = 0;
            for(int i = 0; i < 3; i++)
            {
                System.out.print("값:");
                score = scanner.nextInt();
                hap += score;
            
        }
        System.out.print("합계:"+hap+", 평균"+ hap/score);
    }
    // catch(InputMismatchException e)
    // {
    //     System.out.println("정수값을 입력하세요....");
    // }
    catch(ArithmeticException e)
    {
        System.out.print("0으로 나누면 안됨... 불능입니다.");
    }
    scanner.close();
    }
    
}
