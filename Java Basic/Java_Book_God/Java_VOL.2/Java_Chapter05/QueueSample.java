// package Java_Chapter05;
import java.util.LinkedList;

public class QueueSample {
    
    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList1();
    }
    
    public void checkLinkedList1(){
        LinkedList<String> link = new LinkedList<>();
        link.add("A");
        // void 타입 가장 앞에 추가
        link.addFirst("B");
        System.out.println(link);
        // boolean 타입 가장 앞에 추가
        link.offerFirst("C");
        System.out.println(link);
        // void 타입 가장 뒤에 추가
        link.addLast("D");
        System.out.println(link);
        // boolean 타입 가장 뒤에 추가
        link.offer("E");
        System.out.println(link);
        // boolean 타입 가장 뒤에 추가
        link.offerLast("F");
        System.out.println(link);
        // void 타입 가장 앞에 추가        
        link.push("G");
        System.out.println(link);
        // boolean 타입 가장 뒤에 추가
        link.add(0,"H");
        System.out.println(link);
        // 해당 위치의 값을 바꾼다.        
        System.out.println("EX = " + link.set(0, "I"));
        System.out.println(link);
    }
}
