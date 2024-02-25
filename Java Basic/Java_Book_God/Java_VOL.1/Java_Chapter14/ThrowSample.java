
public class ThrowSample {
    /*
        1. throws로 예외를 던지면 그 던진 메소드를 호출하는 메소드는
        try{} - catch()를 해줘야한다.
        2. 호출한 메소드(main)일경우 다시 throws 를 해주면된다.
    */
    
    
    public static void main(String[] args) throws Exception{
        ThrowSample sample = new ThrowSample();        
        sample.throwException(13);        
        try{                        
            sample.throwException(13);
        }
        /*
        catch(Exception e){
            
        }
        */        
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void throwException(int number) throws Exception{
        /*
            try{
                if(number > 12){
                    throw new Exception("Number is over than 12");
                }
                System.out.println("Number is " + number);
            }        
            catch(Exception e){
                e.printStackTrace();
            }
        */
        
        if(number > 12){
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
        
    }
    public void mutiThrows() throws NullPointerException , Exception{        
        
    }
}
