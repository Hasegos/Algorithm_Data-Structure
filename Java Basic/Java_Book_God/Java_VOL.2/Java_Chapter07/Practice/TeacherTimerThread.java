// package Practice;
import java.util.Date;


public class TeacherTimerThread extends Thread{
    
    public void run(){
        printCurrentTimeFirst();
        printCurrentTime();
    }
    
    public void reduceTimeGap(){
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime % 1000;
        try{
            Thread.sleep(1000 - timeMod);
        }
        catch(Exception e){
            
        }
    }
    public void printCurrentTimeFirst(){
        try{
            int count = 0;
            while(count < 10){
                Thread.sleep(1000);
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime) + " " + currentTime);
                count++;
            }
        }
        catch(Exception e){
            
        }
    }
    public void printCurrentTime(){
        int count = 0;
        try{
            while(count < 10){
                long current = System.currentTimeMillis();
                System.out.println(new Date(current) + " " + current);
                /*
                    0.01초 내의 오차를 보이도록 하기위해서 0.9초 기다리고 나머지 초는
                    1000밀리초에서 현재 시간을 1000으로 나눈 나머지값을 빼준다.
                    즉, 위에 값에서 100밀리초를 뺀거랑 다름이 없으므로(이미 0.9초 기다림) 0.01초에 가까워진다.(10밀리초)
                */
                Thread.sleep(900);
                reduceTimeGap();
                count++;
            }    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
