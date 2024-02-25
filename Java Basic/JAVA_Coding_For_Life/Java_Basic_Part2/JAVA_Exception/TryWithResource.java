import java.io.IOException;
import java.io.FileWriter;

public class TryWithResource {
    
    public static void main(String[] args) {        
        // try with resource statments
        // 를 사용할려면 무조건적으로 AutoCloseable이 인터페이스로 받아야한다.
        try(FileWriter f = new FileWriter("data.txt")){
            f.write("Hello");                            
        }
        catch(IOException e) {
            e.printStackTrace();            
        }                             
    }
}
