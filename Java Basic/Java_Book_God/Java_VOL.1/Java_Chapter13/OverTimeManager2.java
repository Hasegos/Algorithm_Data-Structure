
public class OverTimeManager2 {
    public static void main(String[] args) {
        // 여기서 value2는 OverTimeValues2의 FIVE_HOUR 상수를 할당했다.        
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
        // 주의할점은 value2의 amount 값을 호출하는게 아니라 
        // OverTimeValues2에 존재하는 FIVE_HOUR를 저장한 value2를 호출한것이다.
        System.out.println(value2);
        System.out.println(value2.getAmount());
        
        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;        
        // 30000 / 1 이 출력된다. 순서차이 enum에 존재하는 상수 순서 차이
        System.out.println(value2.compareTo(value3));
    }
}
