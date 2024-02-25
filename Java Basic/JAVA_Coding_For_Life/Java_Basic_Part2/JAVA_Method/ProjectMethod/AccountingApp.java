
public class AccountingApp {
    
    public static  double valueOfSupply = 10000.0;;
    public static  double vatRate = 0.1;
    
    public static void main(String[] args) {
        
        // 공급가액
        // double valueOfSupply = 10000.0;
        
        // 부가가치세율
        // double vatRate = 0.1;
        
        // 부가세
        //double vat = valueOfSupply * vatRate;
        // double vat = getVAT();
        // 합계
        //double total = valueOfSupply + vat;
        // double total = getTotal();
        
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total of supply : " + getTotal());
        
    }
    
    public static double getVAT(){
         return valueOfSupply * vatRate;
    }
    
    public static double getTotal(){
        return valueOfSupply + getVAT();
    }
}
