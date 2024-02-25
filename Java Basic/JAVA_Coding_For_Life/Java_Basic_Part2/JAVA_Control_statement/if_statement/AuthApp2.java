
public class AuthApp2 {
       
    
    
    public static void main(String[] args) {
        
        String id = "egoing";       
        String inpuId = "egoing";
        
        String pass = "1111";
        String pass2 = "2222";
        String inputPass = "1111";  
        
        
        
        System.out.println("Hi.");       
        
        boolean isRightPass = inputPass.equals(pass) || inputPass.equals(pass2);
       
        
        if(inpuId.equals(id) && isRightPass){            
                System.out.println("Master!");    
            }                    
        else{
            System.out.println("Who are you?");
        }       
        
    }  
}
