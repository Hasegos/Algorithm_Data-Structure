package java_책_4단원;


class Sample 
{
    public int a;
    // private int b;
    int c; // 디폴트 접근 지정자
}
public class 맴버의_접근_지정자 {
    
    public static void main(String[] args) {
        
        Sample sample = new Sample();
        sample.a = 10;
        // sample.b = 10;  여기서 b 는 Sample 클래스 안에서만 쓸 수있다.
        sample.c = 10;
    }
    
}
