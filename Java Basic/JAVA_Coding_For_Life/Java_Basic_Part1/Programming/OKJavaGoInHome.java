import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OKJavaGoInHome {
    
    public static void main(String[] args) {
        
        /*
            bug : 우리가 예상치 못한 일이 발생 되는것
            
            debug : 브레이크 포인트를 이용하여 디버깅 모드로 진입
            
            debugging : bug를 잡는 행위
            
            debugger : debugging을 할 때 사용하는 언어  
            
            
            Perspective : 관점
            
            
            input    ->    program   ->   output
        */                        
    
        String id = "JAVA APT 507";
        
        // Elevator call
        Elevator myElevator = new Elevator(id); 
        myElevator.callForUp(1);
        
        // Sevurity off
        Security mySecurity = new Security(id);
        mySecurity.off();       
        

        // Light on      
        Lighting floorLamp = new Lighting(id +"/ Hall Lamp");
        floorLamp.on();      
        
        
    }
    
}
    

