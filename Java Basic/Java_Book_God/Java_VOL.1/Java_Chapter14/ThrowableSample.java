
public class ThrowableSample {
    
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }
    /*
        Exception 과 Error 는 서로 성격이 다르지만 하나로 묶은 부모 클래스 Throwable이 존재한다.
        Exception 이 Throwable에 overriding 한 것들중 제일많이 사용하는 3가지가 존재한다.
        1.getMessage() : 오류 메세지 간단하게 출력
        2.toString() : 오류 메세지 상세하게 출력
        3.printStackTrace() : 가장 첫줄에 예외 메세지 출력
    */       
    
    public void throwable(){
        int[] intArray = new int[5];
        try {
            // intArray = null;
            System.out.println(intArray[5]);
        }
        catch(Throwable t){
            System.out.println(t.getMessage()); // -> null
            System.out.println(t.toString()); // -> java.lang.NullPointerException
            t.printStackTrace(); // -> java.lang.NullPointerException
                                 //            at ThrowableSample.throwable(ThrowableSample.java:20)
                                 //            at ThrowableSample.main(ThrowableSample.java:6)
        }        
    }
}
