import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
    
    public static void main(String[] args) { 
        // try catch finally
        FileWriter f = null;        
        try{      
            f = new FileWriter("data.txt");
            f.write("Hello");            
        }
        catch(IOException e){
            e.printStackTrace();
        }
        // try 안에 Exception이 발생했건 안했건 무조건 finally이 실행이 된다.        
        finally{
            // 만약에 f가 null이 아니라면
            if(f != null){
                try{
                    // close를 하기 전에 예외가 발생할 수 있기때문에 finally로 처리해야 합니다.
                    f.close();        
                }
                catch(IOException e){
                    e.printStackTrace();
                }                
            }            
        }           
        
    }
}
