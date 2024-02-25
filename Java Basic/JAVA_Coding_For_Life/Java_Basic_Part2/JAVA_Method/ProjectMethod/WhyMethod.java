import java.io.IOException;
import java.io.FileWriter;

public class WhyMethod {
    /*
      Refactor -> Extract Method(자동으로 메소드화 시켜줌)
      파라미터(parameter) : 매개변수
      함수안에 흘려보내는 값으로 매개한다해서 매개변수
    */      
   
    
    // String[] args : 문자열 배열 값을 받음
    public static void main(String[] args) throws IOException {
        
        
                     //인자, argument  
       // printTwoTimes("a","-");
       System.out.println(twoTimes("a","-"));
        
       // writeFileTwoTimes("a","*");
       FileWriter fw =new FileWriter("out.txt");
       fw.write(twoTimes("a","*"));
       fw.close(); 
        
       // printTwoTimes("a","&");
       // 실제로 동작하지는 않음 (예시일뿐)
       Email.send("egoing@a.com", "two times a",twoTimes("a", "&"));
       // printTwoTimes("b","!");
    }
    
    
   
    public static String twoTimes(String text,String delimiter){
        String out = "";
        out += delimiter +"\n";
        out += text +"\n";
        
        return out;
    }
    /*
    public static void printTwoTimes(String text, String delimiter){
       System.out.println(delimiter); 
       System.out.println(text);
       System.out.println(text);
    }    
    
    public static void writeFileTwoTimes(String text, String delimiter) throws IOException{
        FileWriter fw = new FileWriter("output.txt");
        fw.write(delimiter + "\n");
        fw.write(text + "\n");
        fw.write(text +  "\n");
        fw.close();
    }
    */
    
    /*
    public static void printTwoTimesA(){
       System.out.println("-"); 
       System.out.println("A");
       System.out.println("A");
    }

    public static void printTwoTimesB(){
       System.out.println("-"); 
       System.out.println("B");
       System.out.println("B");
    }
    */
}
