
public class AuthApp {
    /*
        구름ide에서는 미리 argument 값을 줄수가 없어서  받았다고 가정함.    
        equals() : 문자열 비교로 확인.
        && : 그리고(둘다)
        
        
        Input  ---------->    Program   ------------> OUTPUT
        
    Argument
      File
     Network 
      Audio
     Program 
        
    */
    
    
    
    public static void main(String[] args) {
        
        String name = "egoing";
        System.out.println(name);
        String id = "egoing";
        String inpuId = name;
        
        String pass = "1111";
        String inputPass = "1111";      
        
        System.out.println("Hi.");
        
        
        // if(inputId == id){} 
        // if(inpuId.equals(id)){
        //     if(inputPass.equals(pass)){
        //         System.out.println("Master!");    
        //     }
        //     else{
        //         System.out.println("Wrong Password!");    
        //     }
        // }
        // else{
        //     System.out.println("Who are you?");
        // }
        
        if(inpuId.equals(id) && inputPass.equals(pass)){            
                System.out.println("Master!");    
            }                    
        else{
            System.out.println("Who are you?");
        }       
        
    }  
}
