package java_책_2단원;
import java.util.Scanner; // 입력 받기위한 키보드 생성
public class 산술_연산자응용 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  // 키보드를 통해 무엇을 입력받을지 확인
    

    System.out.println("정수를 입력하세요.");
    int time = scanner.nextInt(); // 정수입력
    int second = time % 60;    // 초를 입력받고 60으로 나눈 나머지가 초임.
    int minute = (time / 60) % 60; // 초를 입력받고 60으로 나누고 그 나눈 걸 60으로 나눈 나머지는 분임.
    int hour = (time / 60) / 60; // 초를 입력받고 60으로 나누고 나눈걸 다시 60으로 나누면 시간임.

    System.out.println(time + "초는");
    System.out.println(hour + "시간,");
    System.out.println(minute + "분,");
    System.out.println(second+"초입니다.");
        
    scanner.close();
    return;
    }
    
}
