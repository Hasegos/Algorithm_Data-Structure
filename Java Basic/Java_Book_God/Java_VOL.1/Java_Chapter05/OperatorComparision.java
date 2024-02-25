
public class OperatorComparision {
    
    public static void main(String[] args) {
        OperatorComparision operator = new OperatorComparision();
        operator.comparision();
        operator.comparision2();
        operator.comparision3();
    }
    public void comparision(){
        int intValues1 = 1;
        int intValues2 = 2;
        int intValues3 = 1;
        
        System.out.println(intValues1 == intValues2);
        System.out.println(intValues1 == intValues3);
        
        
        System.out.println(intValues1 != intValues2);
        System.out.println(intValues1 != intValues3);
    }
    public void comparision2(){
        char charValue = 'a';
        System.out.println(97 == charValue);   
        int intValue = 1;
        double doubleValue = 1.0;      
        System.out.println(intValue == doubleValue);       
    }
    public void comparision3(){
        boolean booleanValue = true;
        System.out.println(booleanValue == false);           
    }
}
