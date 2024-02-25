
public class AccessLevelModifiersMethod {
    
    /*
        private : 같은 클래스 내부에서만 사용 가능  
        
        static - class method
        
        no static - instance method
    */   
    
    public static void main(String[] args) {     
        
        Greeting.hi();
        
    }
    
}
class Greeting{
    // public, protected, default, private
    public static void hi(){
        System.out.println("Hi");
    }
    
}
