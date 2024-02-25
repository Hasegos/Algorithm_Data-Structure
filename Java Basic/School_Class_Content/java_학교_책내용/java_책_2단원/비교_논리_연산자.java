package java_책_2단원;
public class 비교_논리_연산자 {
    public static void main(String[] args) {
        System.out.println('a' > 'b');  // false
        System.out.println(3 >= 2); // true
        System.out.println(-1 < 0); // true
        System.out.println(3.45 <= 2); // false
        System.out.println(3 == 2); // false
        System.out.println(3 != 2); // true
        System.out.println(!(3 != 2)); // false
        System.out.println((3 > 2) && (3 > 4)); // false
        System.out.println((3 != 2) /* || (-1 > 0) */ ); // true
        System.out.println((3 != 2) ^ (-1 >0)); // xor 연산자  모두 false 인경우만 false   그러므로 true

        return;
        
    }
    
}
