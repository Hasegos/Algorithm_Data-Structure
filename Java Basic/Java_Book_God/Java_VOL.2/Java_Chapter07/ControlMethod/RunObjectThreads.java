// package ControlMethod;

public class RunObjectThreads {
    
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        // sample.checkThreadState2();
        sample.checkThreadState3();
    }
    public void checkThreadState2(){
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try{
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());
            
            // TIMED_WAITING이 아니라 WAITING으로 나온이유는 thread내에서 wait()시켜버림.
            Thread.sleep(100);            
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());
            
            // 여기서는 단일 쓰레드 깨운 대상은 monitor.wait()로 자고있는 애를 깨움
            synchronized(monitor){
                monitor.notify();
            }
            
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());
            
            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    
    public void checkThreadState3(){
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try{
            System.out.println("thread state = " + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState());
                        
            Thread.sleep(100);            
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());
                        
            synchronized(monitor){
                /*
                    thread2는 wait()때문에 영원한 잠을 자서 종료가안된다.
                    그래서 notify()를 한번더 해주거나 notifyAll()를 해줘야한다.    
                */
                // monitor.notify();
                // monitor.notify();
                monitor.notifyAll();
            }
            
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());
            
            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
            
            thread2.join();
            System.out.println("thread2 state(after join) = " + thread2.getState());
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
