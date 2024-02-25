import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.DimmingLights;

public class OKJavaGoInHomeInput {
    
    /*
         args(매개변수) : parameter(파라미터)
         String[] : 문자로된 배열    
         Organize Favorites에 add 후 자주사용하는 프로그램 추가가능
         agrs 라는 파라미터에 run configuration 사용해서 미리 argument 지정하면,
         따로 입력받는 값 없이 사용됨
         명령어 실행에서 제일중요한것 : 현재위치(pwd) 
    */    
    
    public static void main(String[] args) {
        
        System.out.println("Country : " + agrs[1]);
        String id = args[0]; 
        
        // String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a ID");
        
        Elevator myElevator = new Elevator(id); 
        myElevator.callForUp(1);
        
        // Sevurity off
        Security mySecurity = new Security(id);
        mySecurity.off();       
        

        // Light on      
        Lighting floorLamp = new Lighting(id +"/ Hall Lamp");
        floorLamp.on();  
        
        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}
