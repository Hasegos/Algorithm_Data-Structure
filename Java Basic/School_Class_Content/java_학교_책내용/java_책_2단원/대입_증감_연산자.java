package java_책_2단원;
public class 대입_증감_연산자 {
    public static void main(String[] args) {
        int a=3, b=3, c=3;
        //대입 연산자 사용

        a += 3; // a = a+3 = 6
        b *= 3; // b = b*3 = 9
        c %= 2; // c = c%2 = 1
        System.out.println("a ="+ a +", b ="+ b +", c ="+c);

        int d=3;
        // 증감 연산자 사례
        a = d++; // a 출력후 d 더하기
        System.out.println("a ="+ a +", d ="+d);
        a = ++d; // d 더하고 a 출력하기
        System.out.println("a ="+ a +", d ="+d);
        a = d--; // a 출력후 d 빼기
        System.out.println("a ="+ a +", d ="+d);
        a = --d; // d 빼고 a를 출력하기
        System.out.println("a ="+ a +", d ="+d);

        return;
    }
    
    
}
