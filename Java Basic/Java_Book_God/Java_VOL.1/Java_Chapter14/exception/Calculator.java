
public class Calculator {
    /*
         1.예외를 발생시키는 메소드 실행
         2.실행시킨 메소드에서 예외 처리를 확인
         3.해당 조건을 충족할떄 어디 메소드에 던질지 객체 생성
         4.예외를 호출한 메소드 구분이 try - catch로 되어있는지 확인
         5.해당 예외 catch 구문 실행
    */
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try{
            calc.printDivide(1,2);        
            calc.printDivide(1,0);
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());    
        }
    }
    public void printDivide(double d1, double d2) throws RuntimeException{
        
        if(d2 == 0){
            throw new RuntimeException("Second value can't be Zero"); // 직접 던저줄때
        }
        double result = d1 / d2;
        System.out.println(result);
        
    }
}
