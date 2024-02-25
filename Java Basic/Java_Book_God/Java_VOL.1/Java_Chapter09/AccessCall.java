
// 구름ide 사정상 같은 패키지에서 import 작업없이 하겠다.
public class AccessCall {
    
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMethod();
        accessModifier.ackagePrivateMethod();
        accessModifier.privateMethod();
            
    }
}
