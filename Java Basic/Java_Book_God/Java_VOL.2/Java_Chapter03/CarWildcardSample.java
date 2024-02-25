
public class CarWildcardSample {
    
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
        sample.callBusBoundedWildcardMethod();
    }
    public void callBoundedWildcardMethod(){
        // Car 클래스를 제네릭으로 삼는 wildcard 생성
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        // Car 객체 생성
        wildcard.setWildcard(new Car("Mustang"));
        // wildcard의 저장된 Mustang 전달
        boundedWildcardMethod(wildcard);            
    }
    // ?(wildcard 타입)으로 받으면서 Car클래스 확장
    // "? extends 타입" 을 "Bounded Wildcards"라고 불린다.
    // Bounded <- 경계
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
        Car value = c.getWildcard();
        System.out.println(value);
    }
    public void callBusBoundedWildcardMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
    }
}
