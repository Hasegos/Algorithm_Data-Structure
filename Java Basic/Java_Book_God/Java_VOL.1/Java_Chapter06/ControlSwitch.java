 
public class ControlSwitch {
    
    /*
        switch 문에서 case문을 한번이라도 통과시키면 다른 조건이 오더라도 계속 진행되며, break를 만나면 종료된다.    
    */
    
    public static void main(String[] args) {
        ControlSwitch control = new ControlSwitch();        
        control.swtichStatement(1);
        control.swtichStatement(2);
        control.swtichStatement(3);
        control.swtichStatement(4);
        control.swtichStatement(6);
        
        control.swtichStatement2(1);
    }
    public void swtichStatement(int numberOfWheel){        
        switch(numberOfWheel){
            case 1:
                System.out.println(numberOfWheel + ": It is one foot bicycle");
                break;
            case 2:
                System.out.println(numberOfWheel + ": It is a motor cycle or bicycle");
                break;
            case 3:
                System.out.println(numberOfWheel + ": It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel + ": It is a car");
                break;            
            default:
                System.out.println(numberOfWheel + ": It is an expensive car.");
                break;
        }
    }
    public void swtichStatement2(int numberOfWheel){        
        switch(numberOfWheel){
            case 1:
                System.out.println(numberOfWheel + ": It is one foot bicycle");
                //break;
            case 2:
                System.out.println(numberOfWheel + ": It is a motor cycle or bicycle");
                //break;
            case 3:
                System.out.println(numberOfWheel + ": It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel + ": It is a car");
                break;            
            default:
                System.out.println(numberOfWheel + ": It is an expensive car.");
                break;
        }
    }
    public void switchCalendar(int loop){
        ControlOfFlow flow = new ControlOfFlow();       
        flow.switchCalendar(loop);
    }
}
