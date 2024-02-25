import java.util.*;
class Converter{
    // static을  non - static 으로 바꾸면 그전에 작성된 클래스나 메소드를 다시 실행해야함.

    private  int rate = 0; // 환율
     void setRate(int a) //반환 x 환율 저장할공간 필요
    {
         rate = a;
    }
     double toWon(int a){ // 우리 나라 돈으로 바꿔주는 함수

       return rate * a;
    }
     double toDolllar(int a){  // 우리 나라돈을 달러로 바꿔주는 함수

        return a/rate;
    }
    
}

public class java_14주차_3_교수님꺼 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        Converter Japan , Usa ,China;



        Japan = new Converter(); // 일본 객체 생성
        
        System.out.print("일본 환율:");
        Japan.setRate(scanner.nextInt());
        System.out.println("100만원은"+Japan.toDolllar(1000000) +"엔화입니다.");
        System.out.println("100엔화는"+Japan.toWon(100)+"원입니다");
        


        Usa = new Converter();  // 미국 객체 생성        
        System.out.print("미국 환율:");
        Usa.setRate(scanner.nextInt());
        System.out.println("100만원은"+Usa.toDolllar(1000000) +"달러입니다.");
        System.out.println("100달러는"+Usa.toWon(100)+"원입니다");


        China = new Converter(); // 중국 객체 생성
        System.out.print("중국 환율:");
        China.setRate(scanner.nextInt());
        System.out.println("100만원은"+China.toDolllar(1000000) +"위환입니다.");
        System.out.println("100위환는"+China.toWon(100)+"원입니다");

        scanner.close();
    }    
}


