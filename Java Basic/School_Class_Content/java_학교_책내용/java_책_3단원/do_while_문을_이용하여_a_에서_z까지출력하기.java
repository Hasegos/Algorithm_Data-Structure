package java_책_3단원;
public class do_while_문을_이용하여_a_에서_z까지출력하기 {
 
    public static void main(String[] args) {
        
        char a = 'a';

        do {
            System.out.print(a); // 문자 출력
            a = (char)(a+1); // 아스코드 번호로 하고 그걸 문자로 변환
        }while(a <='z');
    }
    
}
