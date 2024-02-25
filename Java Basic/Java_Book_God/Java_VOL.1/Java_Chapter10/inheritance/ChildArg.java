
public class ChildArg extends ParentArg{
    public ChildArg() {
        // super("ChildArg");
        // 매개변수 없는 부모 생성자를 찾는 것이 기본이기에 매개변수 있는 부모 생성자가 존재시에 super()를 사용해야 한다.
        // 또한 super()를 명시적으로 지정하지 않으면, 컴파일시 자동으로 super()가 추가된다.
        super(null);
        System.out.println("Child Constructor");
    }
}
