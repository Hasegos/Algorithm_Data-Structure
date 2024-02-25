// package ControlMethod;

public class RunSupportThreads {
    
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        // sample.checkThreadState1();
        sample.checkJoin();
    }
    public void checkThreadState1(){
        SleepThread thread = new SleepThread(2000);
        try{
            
            System.out.println("thread state = " + thread.getState());
            // 쓰레드 시작
            thread.start();
            // 쓰레드가 도달안함
            System.out.println("thread state(after start) = " + thread.getState());
            
            // 쓰레드가 2초간 잠자는 모드
            Thread.sleep(1000);
            System.out.println("thread state(after 1 sec) = " + thread.getState());
            
            // 쓰레드 끝날때 까지 기다림
            thread.join();
            // 쓰레드 종료
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    
    public void checkJoin(){
        SleepThread thread = new SleepThread(2000);
        try{
            // 종료시간 > 정지 시간
            thread.start();
            thread.join(5000);
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
