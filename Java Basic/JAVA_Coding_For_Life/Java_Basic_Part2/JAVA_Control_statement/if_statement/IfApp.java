
public class IfApp {
    
    /*
        조건문 안에 조건문 가능    
    */
    public static void main(String[] args) {
        
        System.out.println("a");
        // if(false){
        //     System.out.println(1);    
        // }
        // else {
        //     if(true){
        //         System.out.println(2);        
        //     }
        //     else{
        //         System.out.println(3);        
        //     }            
        // }
        
        
        if(false){
            System.out.println(1);    
        }
        else if(true){
            System.out.println(2);    
        }
        else{
            System.out.println(3);        
        }
                
                        
    
        System.out.println("b");
    }
}
