 
public class ControlIF {
    
    public static void main(String[] args) {
        ControlIF control = new ControlIF();
        control.ifStatement();
        control.ifElseStatement();
    }
    public void ifStatement() {
        if(true);
        if(true) System.out.println("It's true");
        if(true)
            System.out.println("It's also true");
        if(false) System.out.println("It's false");
    }
    public void ifElseStatement(){
        int intValue = 5;
        
        if(intValue > 5) System.out.println("It's bigger than 5");
        else System.out.println("It's smaller or equal than 5");
        
        if(intValue <= 5) System.out.println("It's smaller or equal than 5");
        else System.out.println("It's bigger than 5");
    }
}
