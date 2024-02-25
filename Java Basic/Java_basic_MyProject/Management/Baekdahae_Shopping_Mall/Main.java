// package Baekdahae_Shopping_Mall;
/*
    구름ide에서 다른 클래스를 import 하는 작업이 안됨
    그래서 같은 패키지내에 여러 클래스를 만들어서 묶어서 처리할 생각임.

*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdminUtil autil = new AdminUtil(sc);
        ShopUtil util = new ShopUtil(sc);
        int menu = -1;
        
        while(true){
            try{
                System.out.println
                    ("..........................................................");
                System.out.println("1.메인\t  2.관리자\t0.종료");
                System.out.println
                    ("..........................................................");
                System.out.println("메뉴 선택 >>");
                menu = sc.nextInt();
            }            
            catch(Exception E){
                sc.nextLine();
                System.err.println("잘못 입력하셨습니다.");
                System.err.println("1, 2, 0 중에서 입력해주세요.");
                continue;
            }
            if(menu < 0 || menu > 2){
                System.err.println("잘못 입력하셨습니다.");
                System.err.println("1, 2, 0 중에서 입력해주세요.");
                continue;
            }
            else if(menu == 1){
                util.mainPage(sc);
            }
            else if(menu == 2){
                autil.mainPage(sc);
            }
            else {
                System.err.println("백다해 이용해주셔서 감사합니다.");
                System.err.println("다음에 또와주세요.");
                System.out.println
                    ("..........................................................");
                break;
            }
        }       
    }
}
