import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {
    
    public static void main(String[] args) throws IOException{
        // 예외를 코드를 사용하는 쪽에서 throws 하는 것이다.
        FileWriter f = new FileWriter("./data.txt");
        
        
    }
}
