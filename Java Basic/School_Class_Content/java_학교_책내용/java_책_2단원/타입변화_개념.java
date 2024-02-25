package java_책_2단원;

public class 타입변화_개념 {
    
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b+i); // bite 가 int 형으로 자동변환(bite가 int형보다 바이트 수가 적기에) 
        System.out.println(10/4);// 몫 출력
        System.out.println(10.0/4); // 실수와 정수 이기에 정수가 실수형으로 바뀜 
        System.out.println((char)0x12340041); //정수형이 문자형으로 바뀜
        System.out.println((int)2.9 + 1.8); // 2.9 int형으로 바뀌어서 3.8 나옴 0. 삭제
        System.out.println((int)2.9 * 1.8); // 2.9 int형으로 바뀌어서 3.6 나옴 0. 삭제
        System.out.println((int)2.9 + (int)1.8); //2.9 int형으로 바뀌고 1.8도 int형으로 바뀌어서 3나옴 0. 삭제
        
        return;
    }

}
