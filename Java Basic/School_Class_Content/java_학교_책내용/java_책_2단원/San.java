package java_책_2단원;

import java.util.Scanner;  //키보드 생성

public class San {

    public static void main(String[] args) {

        System.out.println("이름,도시,나이,체중,독신 여부를 빈칸으로 분리하여 입력하세요.");// 무엇을 입력할지 쓰기

        Scanner scanner = new Scanner(System.in); //키보드를 통한 입력받기

        String name = scanner.next(); //next() 는 string 즉 문자를 입력받는걸 말한다.
        System.out.println("당신의 이름은"+name+"입니다"); // 입력받은 문자 출력

        String city = scanner.next(); //next() 는 string 즉 문자를 입력받는걸 말한다.
        System.out.println("당신의 도시은"+city+"입니다");// 입력받은 문자 출력

        int age = scanner.nextInt();//nextInt() 는 정수 입력받는걸 말한다.
        System.out.println("당신의 나이는"+age+"살입니다"); // 입력받은 정수 출력.

        double weight = scanner.nextDouble(); //nextDouble() 는 실수를 입력받는걸 말한다.
        System.out.println("당신의 몸무게는"+weight+"kg입니다");// 입려받은 실수 출력

        boolean sigle = scanner.nextBoolean(); //nextBoolean() 는 논리 타임을 받는걸 말한다.
        System.out.println("당신의 독신 여부는"+sigle+"입니다");// 입력받은 논리 타임 출력

        scanner.close();
    }
    
}
