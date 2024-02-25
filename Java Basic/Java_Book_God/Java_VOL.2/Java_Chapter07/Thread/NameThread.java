// package Java_Chapter07;
 
public class NameThread extends Thread{
    
    public NameThread(){
        super("ThreadName");
    }  
    // 여기서 만약 어떤값을 전달하고 싶을때 쓰레드가 가진 메소드로는 해결이 불가능하다.
    public void run() {
        
    }
}
