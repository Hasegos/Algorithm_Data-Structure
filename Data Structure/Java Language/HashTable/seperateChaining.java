package HashTable;
import java.util.LinkedList;
import java.util.Scanner;
/*
    Seperate Chaining(분리 연결법)

    HashTable : (key와 value)을 1:1 매칭해서 저장시킨다.
    키만 알면 값을 바로 가져올 수 있어서 찾기가 빠르다.
    그러므로 Big-O : O(1) 이다.
    하지만 해시 충돌(hash collision)로 인해 key값은 다르나 같은 hash에 존재할 수 있다.
    그래서 이경우에는 Big-O : O(n)이다.
    이를 해결한 방법중 하나가 Separate Chaining(분리 연결법)이다.
    Separate Chaining는 같은 hash에 저장시 linkedlist로 연결시켜 저장하는 방식이다.
    대신,이진 트리 탐색으로 만들었기 때문에 밸런스가 좋아야함.

    + 해시 함수 : 임의의 길이를 갖는 임의의 데이터에 대해 고정된 길이의 데이터로 매핑
      그래서  같은 key -> 같은 value / 다른 key -> 같은 value 로 인해 해시충돌이 일어난다.
*/
public class seperateChaining {  
    class Node{
        private String key;
        private String value;
      
        public Node(String key, String value){
            this.key = key;
            this.value = value;
        }
    }  
    // 클래스 Node 타입으로 table 배열 생성    
    private LinkedList<Node>[]table ;     
    // HashTable 생성  <- 제네릭 배열은 생성하면안됨.
    public seperateChaining(int size){        
        table = new LinkedList[size];        
    }
    // hashcode를 통해 구분
    public Long gethashCode(String key){      
        Long hashcode = 0L; 
        for(char c : key.toCharArray()){
            hashcode += 31 * (long)c;
        }        
        return hashcode;
    }
    // 배열 공간 생성을 위해
    public int getIndex(long hashcode){        
        return (int)(hashcode % table.length);
    }
    // 해당 배열공간에 값이 존재하면 반환
    Node searchNode(int index, String key){
        LinkedList<Node> indexList = table[index];
        
        for(Node n : indexList){
            if(n.key.equals(key)){
                return n;
            }
        }
        return null;
    }
    // key와 value값 입력
    public void put(String key, String value){
        Long gethashCode = gethashCode(key);
        int getIndex = getIndex(gethashCode);
        // table 배열에 값이 존재하지않으면
        if(table[getIndex] == null){
            table[getIndex] = new LinkedList<Node>();
            table[getIndex].add(new Node(key, value));
        }
        // table 배열에 값이 존재하면
        else{
            // 진짜 존재하는지 확인
            Node searched = searchNode(getIndex,key);
            if(searched != null){
                searched.value = value;
            }
            else{
                table[getIndex].add(new Node(key, value));
            }
        }
    }
    // 해당 키의 값 가져오기
    public String get(String key){
        Long gethashCode = gethashCode(key);
        int getIndex = getIndex(gethashCode);

        Node searched = searchNode(getIndex,key);
        if(searched == null) return "";
        else  return searched.value;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        System.out.println();
        System.out.println("몇개의 키와 값을 입력할지 입력해주세요.");
        System.out.print("입력 >>>>>  ");
        int number = sc.nextInt();
        String[] key = new String[number];
        seperateChaining table = new seperateChaining(number);
        sc.nextLine();
        for(int i = 0; i < number; i++){                        
            System.out.println((i+1) + "번째");
            System.out.print("키 :  ");
            key[i] = sc.nextLine();           
            System.out.print("값 :  ");                        
            table.put(key[i],sc.nextLine());
        }        
        
        for(int i = 0 ; i < number; i++){
            System.out.println("들어가 있는 키 : " + key[i]);
            System.out.println("해당 키의 값 : " + table.get(key[i]));            
        }
        sc.close();       
    }   
}