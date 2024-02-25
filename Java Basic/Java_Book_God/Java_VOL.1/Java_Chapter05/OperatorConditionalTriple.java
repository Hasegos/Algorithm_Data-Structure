 
public class OperatorConditionalTriple {
    
    public static void main(String[] args) {
        OperatorConditionalTriple operator = new OperatorConditionalTriple();
        operator.doBlindDate(30);
        operator.doBlindDate(80);
    }
    // 삼항 연산자 : 변수 = (boolean 조건) ? 참(true) : 거짓(false)
    public boolean doBlindDate(int point){
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println("point : " + doBlindDateFlag);
        return doBlindDateFlag;
    }
}
