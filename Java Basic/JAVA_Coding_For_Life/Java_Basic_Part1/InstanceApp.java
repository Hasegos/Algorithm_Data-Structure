import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class InstanceApp {
    /*
    
        API DOCUMENTATION JAVA -> 자바 관련 공식 사이트        
        
        
        instance란 객체가 메모리에 할당되어 실제 사용될 때
        object(객체)란 이름(name)과 값(value)으로 구성된 프로퍼티(property)의 정렬되지 않은 집합.
        oop(object-oriented-programming)란 객체 지향 프로그램        
        
        
        
        instance를 사용하는 이유
        간단한 예로 PrintWriter.write("result1.txt","Hello 1"); 사용 할 수 있다고 하자.
        만약, 파일에 있는 내용을 바꾸고 싶으면 우리는 해당 메소드를 쓴곳에가서 직접 바꿀 수 밖에없다.
        그러나 우리는 PrintWriter라는 객체를 instance화 시킬 수 있으며,
        사용 시 PrintWriter라는 타입 변수에 변수값의 메소드를 불러 해당 내용만 수정시키면 간단하게 해결할 수 있기때문에 사용한다.        
        
        
        constructor(생성자)가 없으면 instance 불가능.
        
        instance 사용 조건
        constructor(생성자)가 해당 객체에 존재해야 instance(인스턴스)를 시켜 사용 할 수 있다.
        
        
        
    */  
    
    public static void main(String[] args) throws FileNotFoundException {
        
         PrintWriter p1 = new PrintWriter("result1.txt");
         p1.write("Hello 1");
         p1.close();        
        
        
         PrintWriter p2 = new PrintWriter("result2.txt");
         p2.write("Hello 2");
         p2.close();  
         
        
        System.out.println(p1.toString());
        p2.toString(); 
        p2.write("Hello 2");
        
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        // PrintWriter.write("result1.txt","Hello 1");
        
        
        
    }
}
