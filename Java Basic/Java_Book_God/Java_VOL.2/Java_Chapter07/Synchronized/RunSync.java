// package Synchronized;
 
public class RunSync {
    
    public static void main(String[] args) {
        RunSync runSync = new RunSync();        
        for(int loop = 0; loop < 5; loop++){
            runSync.runCommonCalculate();    
        }        
    }
    public void runCommonCalculate(){
        // 같은 객체를 참조할때 유효하다. 다른 객체를 참조하면 synchronized를 안쓰는 것과 동일하다.
        CommonCalculate calc1 = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc1,true);
        
        CommonCalculate calc2 = new CommonCalculate();
        ModifyAmountThread thread2 = new ModifyAmountThread(calc2,true);
        
        thread1.start();
        thread2.start();
        
        // 여기서 plus()를 해놓은 메소드가 Synchronized를 안해놔서
        // 동시에 같은 thread를 돌리기때문에 값 계산이 제대로안되서 코드가 꼬인다.
        try{
            // join() : 쓰레드가 끝날때까지 기다리는 메소드
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + calc.getAmount());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
