// package Java_Chapter06;
import java.util.Set;
import java.util.Random;
import java.util.Hashtable;

public class RandomNumberStatistics {
    /*
        Hashtable는 키에 null 저장이안된다.그래서 null로 초기화 시켜주면 저장안됨.
        그리고 반복할때마다 새로운 생성자 생성후 저장하기에 하나밖에 출력이안됨.
    */
    private final int DATA_BOUNDARY = 50;
    // 생성자를 전체 범위로 돌려야 모든 메소드에 적용가능.
    Hashtable<Integer, Integer> hashtable =  new Hashtable<Integer, Integer>();;
    
    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
    }
    
    public void getRandomNumberStatistics(){
        Random random = new Random();
        for(int i = 0; i < 5000; i++){
           int tempNumber = random.nextInt(DATA_BOUNDARY)+1;
           putCurrentNumber(tempNumber);            
        }
        printStatistics();
    }
    public void putCurrentNumber(int tempNumber){        
        if(hashtable.containsKey(tempNumber)){            
            hashtable.put(tempNumber, hashtable.get(tempNumber)+1);            
        }
        else{
            hashtable.put(tempNumber,1);    
        }        
    }
    
    public void printStatistics(){
        Set<Integer> keySet = hashtable.keySet();        
        
        for(int key : keySet){       
            int count = hashtable.get(key);
            System.out.print(key + " = " + count +"\t");     
            if(key % 10 - 1 == 0){
                System.out.println();
            }            
        }
    }
}
