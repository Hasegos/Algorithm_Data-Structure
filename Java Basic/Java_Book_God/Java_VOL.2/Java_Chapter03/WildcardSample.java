
public class WildcardSample {
    
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }
    /*
        어떤 객체를 wildcard로 선언하고, 그 객체의 값을 가져올 수는 있지만,
        특정 타입으로 값을 지정하는 것이 불가능
    */
    public void callWildcardMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }
    // 여기 매개변수를 다른 타입으로 받을순없다.
    // 이를 해결한 것이 ?(wildcard 타입) 이다.
    public void wildcardStringMethod(WildcardGeneric<?> c){
        Object value = c.getWildcard();
        if(value instanceof String){
            System.out.println(value);    
        }        
    }
}
