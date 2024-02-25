class Accounting{
    
    public  double valueOfSupply;    
    public static  double vatRate = 0.1;  
    public Accounting(double valueOfSupply){
        this.valueOfSupply = valueOfSupply;
    }
    public double getVAT(){
         return valueOfSupply * vatRate;
    }    
    public double getTotal(){
        return valueOfSupply + getVAT();
    }
}


public class AccountingApp {  
    //..
    /*
    public static  double valueOfSupply;
    //..
    public static  double vatRate = 0.1;
    //.. 
    
    public static double getVAT(){
         return valueOfSupply * vatRate;
    }
    //..
    public static double getTotal(){
        return valueOfSupply + getVAT();
    }
    //..
    */
    
    /*
        인스턴스를 사용하는 경우 : 클래스의 상태가 계속해서 바꿔야 할떄
        추가로 직접적으로 변수를 사용안할시, static을 지워버릴 필요가 없다.
        인스턴스를 써도 class 기반 변수를 바꿀 수 있지만,
        바꿀 시, 다른 인스턴스 변수에 영향이가서 안쓴다.(덮어쓰기가된다.)

        각인스턴스에 공통된 요소는 class기반으로 두고, 그외 부분은 instance로 해결한다.
    */
     public static void main(String[] args) {
         
         Accounting a1 = new Accounting(10000.0);
         // a1.valueOfSupply = 10000.0;
         
         
         Accounting a2 = new Accounting(20000.0);
         // a2.valueOfSupply = 20000.0;
         
         System.out.println("Value of supply : " + a1.valueOfSupply);
         System.out.println("Value of supply : " + a2.valueOfSupply);
         
         System.out.println("VAT : " + a1.getVAT());
         System.out.println("VAT : " + a2.getVAT());
         
         System.out.println("Total of supply : " + a1.getTotal());
         System.out.println("Total of supply : " + a2.getTotal());
         
         
        // Accounting.valueOfSupply = 10000.0;        
        // System.out.println("Value of supply : " + Accounting.valueOfSupply);
        // Accounting.valueOfSupply = 20000.0;        
        // System.out.println("Value of supply : " + Accounting.valueOfSupply);
         
        // Accounting.valueOfSupply = 10000.0;                
        // System.out.println("VAT : " + Accounting.getVAT());
        // Accounting.valueOfSupply = 20000.0;                
        // System.out.println("VAT : " + Accounting.getVAT());
         
        // Accounting.valueOfSupply = 10000.0;                 
        // System.out.println("Total of supply : " + Accounting.getTotal());
        // Accounting.valueOfSupply = 20000.0;                 
        // System.out.println("Total of supply : " + Accounting.getTotal());
         
         
      
        
    }
}


