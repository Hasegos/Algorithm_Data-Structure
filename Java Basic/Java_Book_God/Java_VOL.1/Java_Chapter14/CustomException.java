
public class CustomException {
    /*
        항상 발생하지않고 실행시 높은 확률로 발생할 경우 : 런타임 예외(runtime Exception)
        이렇게 하면 우리가 만든 MyException에서 확장자를 runtimeException으로 하면된다.
        대신 클래스를 호출하는 다른클래스에서 예외처리 하도록 구조적인 안정장치를 해야한다.
        즉,예외 처리를 한 메소드를 호출시 호출한 메소드가 try-catch를 하는것처럼        
        또한 try-catch로 묶지 않은 메소드를 호출하는 메소드에서 예외를 처리하는 try-catch가 있어야한다.
        catch 구문에서 아무런 작업을 안해서는 절대 안된다.
    */
    
    public static void main(String[] args) {
        CustomException sample = new CustomException();
        try{
            sample.throwMyException(13);            
        }catch(MyException mye){
            mye.printStackTrace();
        }
    }
    
    public void throwMyException(int number) throws MyException{
        try{
            if(number > 12){
                throw new MyException("Number is over than 12");
            }
        }
        catch(MyException e){
            e.printStackTrace();
        }
    }
    
    // Checked
    public void methodCaller(){
        try{
            methodCallee();
        }catch(Exception e){
            // 예외 처리
        }
    }
    // unChecked
    public void methodCallee(){
        // RuntimeException 예외 발생 가능성이 있는 부분
    }
}
