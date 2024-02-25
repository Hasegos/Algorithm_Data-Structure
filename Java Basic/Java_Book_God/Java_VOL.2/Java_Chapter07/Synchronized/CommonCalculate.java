// package Synchronized;
 
public class CommonCalculate {
    private int amount;
    private int interest;  
    private Object interestLock = new Object();
    private Object amountLock = new Object();
    public CommonCalculate(){
        amount = 0;        
    }    
    // 부모 객체를 이용해서 잠금 처리
    Object lock = new Object();
    
    public void addInterest(int value){
        synchronized(interestLock){
            interest += value;    
        }        
    }
    
    public void plus(int value){
        /*
            메소드 전체를 묶어버리면 쓸때 없이 대기시간이 길어짐
            필요한 부분만 synchronized사용
            여기서 this는 잠금 처리를 하기 위한 객체를 선언        
            문지기라고 생가가면됨
        */
        synchronized(amountLock){
            amount += value;    
        }        
    }
    
    public void minus(int value){
        synchronized(lock){
            amount -= value;    
        }        
    }
    
    public int getAmount(){
        return amount;
    }
}
