
public class NestedValueReference {
    // 밖에 있는 변수를 안에 존재하는 static Nested 클래스와 Nested 클래스가 참조가능
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;
    // staticNested 클래스는 static 변수만 참조가 가능하다.
    static class StaticNested {
        public void setValue(){
            staticInt = 14;
        }
    }
    // 내부 클래스와 익명 클래스는 클래스의 어떤 변수도 참조가 가능하다.
    class Inner {
        public void setValue(){
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }
    public void setValue() {
        EventListener listener = new EventListener() {
             public void onClick(){
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
             }
        };
    }
}
