// package Java_Chapter06;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapSample {
    
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMap();
        sample.checkKeySet();
        sample.checkValues();
        sample.checkHashMapEntry();
        sample.checkContains();        
        sample.checkRemove();
    }
    public void checkHashMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        // value 가져오기 없으면 null을 통해 없다는걸 알려줌
        System.out.println(map.get("A"));
        map.put("A", "1");
        System.out.println(map.get("A"));
    }
    
    public void checkKeySet(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("C","c");
        map.put("D","d");
        // keySet 는 키를 가져옴
        Set<String> keySet = map.keySet();
        for(String tempKey : keySet){
            System.out.println(tempKey+ " = " + map.get(tempKey));
        }
    }
    
    public void checkValues(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("C","c");
        map.put("D","d");
        // Collection을 통해 values 가져올수있음
        Collection<String> values = map.values();
        for(String tempValue : values){
            System.out.println(tempValue);
        }
    }
    
    public void checkHashMapEntry(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        
        // Entry 하나씩 키와 값을 둘다 가져올 수 있다.
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> tempEntry : entries){
            System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
        }
    }
    
    public void checkContains(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("Z"));
        System.out.println(map.containsValue("a"));
        System.out.println(map.containsValue("z"));
    }
    
    public void checkRemove(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A","a");
        map.remove("A");        
        
        System.out.println(map.size());
    }
}
