import java.util.*;

// 중국
class China{

    private  int rate; // 환율
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

// 일본
class Japan{

    private  int rate; // 환율
     void setRate(int a) //반환 x 환율 저장할공간 필요
    {
        rate = a;
    }
     double toWon(int a){ // 우리 나라 돈으로 바꿔주는 함수
       return rate * a;
    }
     double toenhwa(int a){  // 우리 나라돈을 달러로 바꿔주는 함수
         return a/rate;
    }
}

// 미국
class Usa{
    private  int rate; // 환율
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

public class java_14주차_3_내꺼 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 중국
        China num;
        num =  new China();
        System.out.print("중국 환율:");  
        num.setRate(scanner.nextInt());  // 중국의 환율 입력받기
        System.out.println("100만원은"+num.toDolllar(1000000) +"위완입니다.");
        System.out.println("100달러는"+num.toWon(100)+"원입니다");

        // 일본
        Japan num_1;
        num_1 =  new Japan();
        System.out.print("일본 환율:");  
        num_1.setRate(scanner.nextInt());  // 중국의 환율 입력받기
        System.out.println("100만원은"+num_1.toenhwa(1000000) +"엔화입니다.");
        System.out.println("100달러는"+num_1.toWon(100)+"원입니다");
       
        // 미국
        Usa num_2;
        num_2 =  new Usa();
        System.out.print("미국 환율:");  
        num_2.setRate(scanner.nextInt());  // 중국의 환율 입력받기
        System.out.println("100만원은"+num_2.toDolllar(1000000) +"엔화입니다.");
        System.out.println("100달러는"+num_2.toWon(100)+"원입니다");


        scanner.close();

    }
    
}
