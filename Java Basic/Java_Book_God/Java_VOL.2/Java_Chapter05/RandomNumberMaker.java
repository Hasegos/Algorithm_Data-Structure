// package Java_Chapter05;
import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    
    public static void main(String[] args) {
        RandomNumberMaker sample = new RandomNumberMaker();        
        sample.makeRandomNumbers(10);        
    }
    public void makeRandomNumbers(int count){
        for(int loop = 0; loop < count; loop++){
            // 매번 객체생성시 메모리 낭비 toString()으로 객체값 불러주기
            System.out.println(getSixNumber().toString());
        }        
    }
    
    public HashSet<Integer> getSixNumber(){
        Random random = new Random();
        HashSet<Integer> randomNumber = new HashSet<Integer>();
        
        while(true){
            if(randomNumber.size() > 5){
                break;
            }
            randomNumber.add(random.nextInt(44) + 1);            
        }       
        return randomNumber;
    }
}
