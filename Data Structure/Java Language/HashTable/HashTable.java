package HashTable;
import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;
/*
    일반적인 HashTable(해시 테이블) 사용법
    
    HashTable
    1. key와 value에 null 값 허용안함.
    2. 중복 허용안함(값이 중복되도 가능하지만 key는 유일무이해야함)
    3. 동기화 사용함(여러 쓰레드에서 동시에 접근가능)
*/
public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();

        // hashtable 값 추가
        hashtable.put("수성","5,790만 km");
        hashtable.put("금성","1억821만 km");
        hashtable.put("지구","1억4,960만 km");
        hashtable.put("화성","2억 2,739만 km");
        hashtable.put("목성","7억 7,792만 km");
        hashtable.put("토성","14억 3,018만 km");
        hashtable.put("천완성","28억 6,933만 km");
        hashtable.put("해완성","45억 745만 km");


        // Set과 Iterator 사용해서 값 가져오기
        Set<String> set =  hashtable.keySet();
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            // key 값 가져오기
            String key = iter.next();
            System.out.println("Key : " + key + "   value : " + hashtable.get(key));
        }
    }
}
