package java_책_2단원;
public class 비트_시프트_연산자 {
    public static void main(String[] args) {
        short a = (short)0x55ff;
        short b = (short)0x00ff;

        // 비트 연산
        System.out.println("[비트 연산 결과]");
        System.out.printf("%04x\n",(short)(a & b)); // 비트 and
        System.out.printf("%04x\n",(short)(a | b)); // 비트 or
        System.out.printf("%04x\n",(short)(a ^ b)); // 비트 xor
        System.out.printf("%04x\n",(short)(~a)); // 비트 not


        byte c = 20; // 0x14
        byte d = -8; // 0xf8

        //시프트 연산
        System.out.println("[시프트 연산 결과]"); 
        System.out.println(c << 2); // c를 2비트 왼쪽 시프트
        System.out.println(c >> 2); // c를 2비트 오른쪽 시프트. 0 삽입 
        System.out.println(d >> 2); // d를 2비트 오른쪽 시프트. 1 삽입
        System.out.printf("%\n", (d >>> 2)); // d를 2비트 오른쪽 시프트. 0삽입

        return;
    }
    
}
