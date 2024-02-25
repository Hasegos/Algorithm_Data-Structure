 
public class OperatorPlusMinus {
    
    public static void main(String[] args) {
        OperatorPlusMinus sample = new OperatorPlusMinus();
        sample.additive();
    }
    public void additive(){
        int intValues1 = 5;
        int intValues2 = 10;
        int result = intValues1 + intValues2;
        System.out.println(result);
        result = intValues2 - intValues1;
        System.out.println(result);
    }
}
