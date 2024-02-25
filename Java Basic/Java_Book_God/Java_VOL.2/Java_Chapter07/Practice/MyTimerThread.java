// package Practice;
import java.util.Date;

public class MyTimerThread extends Thread{
    
    public void run(){        
        printCurrentTime();
    }    
    
    public void printCurrentTime(){
        int loop = 0;
        Date date = new Date();
        while(loop < 10){
            try{                
                long current = System.currentTimeMillis() % 1000;
                System.out.println(date.toString() +" " + current);
                Thread.sleep(1000);
                loop++;    
            }
            catch(InterruptedException e){
                e.printStackTrace();                
            }           
        }           
    }
}
