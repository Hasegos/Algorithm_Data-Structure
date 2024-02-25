// package Java_Chapter05;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetSample {
    
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String [] cars = new String[]{
            "Tico", "Sonata", "BMW", "Benz",
            "Lexus", "Mustang", "Grandeure",
            "The Beetle", "Mini Cooper", "i30",
            "BMW", "Lexus", "Carnibal", "SM5",
            "SM7", "SM3", "Tico"
        };
        System.out.println(sample.getCarKinds(cars));        
    }
    public int getCarKinds(String[] cars){
        if(cars == null){
            return 0;
        }            
        if(cars.length == 1){
            return 1;    
        }
        // HashSet 타입으로 carSet 만든후 데이터를 추가
        // 데이터 담을수 있는 공간을 리턴해주면 얼마나 들어있는지 확인가능
        Set<String> carSet = new HashSet<>();
        for(String car : cars){
            carSet.add(car);
        }
        printCarSet(carSet);
        return carSet.size();
    }
    
    public void printCarSet(Set<String> carSet){
        for(String temp : carSet){
            System.out.print(temp + " "); 
        }
    }   
    // 뭘 반복할지 값을 넣어야함
    public void printCarSet2(Set<String> carSet){
        Iterator<String> iterator = carSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
