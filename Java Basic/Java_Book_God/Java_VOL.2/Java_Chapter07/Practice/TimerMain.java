// package Practice;

public class TimerMain {
    
    public static void main(String[] args) {
        MyTimerThread thread1 = new MyTimerThread();
        TeacherTimerThread thread2 = new TeacherTimerThread();
        
        thread1.start();
        thread2.start();
    }
}
