// package Java_Chapter07;
 
public class EndlessThread extends Thread{
    // 여기서 사용하는 slepp() 메소드는 try-catch를 사용해줘야한다.
    public void run(){
        while(true){
            try{
                System.out.println(System.currentTimeMillis());        
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }       
    }
}
