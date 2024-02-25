import java.io.FileWriter;
import java.io.IOException;


public class OthersOOP {
    
    public static void main(String[] args) throws IOException{
        
        // class : System, Math, FileWriter
        // instance : f1, f2
        
        
        // Math는 바로 사용함 (일회용 느낌) -> 클래스에 있는 걸 그대로 사용함
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));
        
        // f1에 class FileWriter이라는 복제본을 data.txt 형식으로 저장
        // (일회용 작업용이 아님) -> 긴 맥락을 가지고 작업해되면 클래스를 복제해서 사용함.
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" JAVA");
        
        
        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" JAVA");
        f2.close();
        
        f1.write("!!!");
        f1.close();
    }
    
    
}
