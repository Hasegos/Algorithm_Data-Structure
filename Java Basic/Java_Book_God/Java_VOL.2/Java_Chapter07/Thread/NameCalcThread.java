// package Java_Chapter07;
 
public class NameCalcThread extends Thread {
    
    // 쓰레드가 가진 메소드에서는 매개변수를 해결할수없다.
    // 그래서 따로 인스턴스 변수를 이용해서 해결한다.
    private int calcNumber;
    public NameCalcThread(String name, int calcNumber){
        super(name);
        this.calcNumber = calcNumber;
    }
    
    public void run(){
        calcNumber++;
    }
}
