import java.util.*;
class Converter{

    private static int rate; // 환율
    static void setRate(int a) //반환 x 환율 저장할공간 필요
    {
        rate = a;
    }
    static double toWon(int a){ // 우리 나라 돈으로 바꿔주는 함수
       return rate * a;
    }
    static double toDolllar(int a){  // 우리 나라돈을 달러로 바꿔주는 함수
         return a/rate;
    }
    
}

public class java_14주차_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율:");
        Converter.setRate(scanner.nextInt());
        System.out.println("100만원은"+Converter.toDolllar(1000000) +"달러입니다.");
        System.out.println("100달러는"+Converter.toWon(100)+"원입니다");
        scanner.close();

    }
    
}
