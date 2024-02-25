 
public class OperatorMultipleDivision {
    
    public static void main(String[] args) {
        OperatorMultipleDivision sample = new OperatorMultipleDivision();
        sample.multipleDivision();
        sample.divideInt();
        sample.divideInt2();
    }
    
    public void multipleDivision(){
        int intValues1 = 5;
        int intValues2 = 10;
        
        int result = intValues1 * intValues2;
        System.out.println(result);
        result = intValues2 / intValues1;
        System.out.println(result);
    }
    
    public void divideInt(){
        int intValues1 = 5;
        int intValues2 = 10;
        int result = intValues1 / intValues2;
        System.out.println(result);
    }
    public void divideInt2(){
        double intValues1 = 5;
        double intValues2 = 10;
        double result = intValues1 / intValues2;
        System.out.println(result);
    }
}
