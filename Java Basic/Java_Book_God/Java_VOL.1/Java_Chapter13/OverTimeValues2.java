
public enum OverTimeValues2 {
    // 추가적으로 enum을 맘대로 상속 받을 수 없다.
    // 이미 java.lang.Enum으로부터 상속 받았기 때문이다.
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;
    OverTimeValues2(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }
}
