
public class FinalVariable {
    final int instanceVariable = 1;
    // final로 선언된 변수는 이미 초기화한 값이 있으면, 바꿀 수 없다(상수)
    public void method(final int parameter){
        final int localVariable;
        localVariable = 2;
        localVariable = 3;
        parameter = 4;
    }
}
