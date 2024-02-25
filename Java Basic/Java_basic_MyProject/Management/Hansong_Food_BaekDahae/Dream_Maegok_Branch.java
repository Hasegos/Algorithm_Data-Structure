// package Hansong_Food_BaekDahae;

import java.util.Scanner;

public class Dream_Maegok_Branch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int menu = -1;
        String name = "";
        while(true){
            try{
                System.out.println
                    ("..........................................................");
                System.out.println("1. 거래명세표 입력\t2.종료");
                menu = sc.nextInt();
                if(menu == 1){
                    System.out.println("어디 거래 명세표인가요?");
                    System.out.print("해당 거래명세표 입력해주세요 >>>");                
                    name = sc.nextLine();                    
                }
                else if(menu == 2){
                    System.out.println("다음에 또 거래명세표 이용해주세요 감사합니다 ♡");
                    System.exit(0);
                }
                else {
                    System.out.println("1번과 2번중에 입력해주세요.");
                    System.out.println("다시 입력부탁드립니다.");
                    continue;
                }                
            }
            catch(Exception e){
                sc.nextLine();
                System.out.println("해당 거래명세표는 없습니다.");
                System.out.print("잘못입력하셨습니다.");
                System.out.print("다시입력해주세요.");
                continue;
            }
            switch(name){
                case "052명촌점":
                    System.out.println("1.거래 명세표 보기\t2.총 가격보기");
                    sc.nextLine();
                    menu = sc.nextInt();
                    if(menu == 1){
                        Myeongchon_052 myeongchon = new Myeongchon_052();
                        myeongchon.printMyeongSepyo();
                    }
                    else if(menu == 2){
                        
                    }
                    else {
                        
                    }
                    break;
                case "더+화정점":
                    break;
                case "드림매곡점":
                    break;
                case "드림무거점":
                    break;
                case "매일 서동점":
                    break;
                default:
                    System.out.println("해당 거래명세표는 존재하지않습니다.");
                    break;
            }
        }
    }
}
