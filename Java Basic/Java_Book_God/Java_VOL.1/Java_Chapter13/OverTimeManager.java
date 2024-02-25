
public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value){
        int amount = 0;
        System.out.println(value);
        switch(value){
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;            
        }
        return amount;
    }
    
    public static void main(String[] args){
        OverTimeManager manager = new OverTimeManager();
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        
        // 위 코드를 풀어 쓰면
        OverTimeValues value = OverTimeValues.THREE_HOUR;
        myAmount = manager.getOverTimeAmount(value);
        
        // enum 이라는 객체를 매개변수를 넘겼는데,
        // 만약 그냥 문자열 값인 "THREE_HOUR" 를 매개변수로 넘기면 큰일난다.
        // 매개변수에서 받는 타입이 다르다.
        
        System.out.println(myAmount);
    }
}
