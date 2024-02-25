
public class InnerSample {
    
    /*
        static Nested가 아닌 경우
        해당 클래스를 인스턴스화 시키고 클래스 내부에 있는 클래스 타입
        으로 그전에 만든 인스턴스화 시킨변수의 해당 클래스를 새로 인스턴스화 시킨다.
        즉, 클래스 존속이 아니기때문에 새로운 인스턴스화를 해야한다.
    */
    
    
    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }
    public void makeInnerObject(){
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        inner.setValue(3);
        System.out.println(inner.getValue());
        
    }
}
