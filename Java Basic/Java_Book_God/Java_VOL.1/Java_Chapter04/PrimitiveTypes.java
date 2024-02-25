
public class PrimitiveTypes {
    /*
        float : 32비트 (부호(1) + 지수(8) + 가수(23))
        double : 64비트 (부호(1) + 지수(11) + 가수(52))
    */    
    
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkByte();
        types.checkChar();
        types.defaultValues();
    }
    
    public void checkByte(){
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin = " + byteMin);
        System.out.println("byteMax = " + byteMax);
        byteMin = (byte)(byteMin - 1);
        byteMax = (byte)(byteMax + 1);
        System.out.println("byteMin - 1 = " + byteMin);
        System.out.println("byteMax + 1 = " + byteMax);        
    }
    public void checkOtherTypes(){
        short shortMax = 32767;
        int intMax = 2147483647;
        // long 타입은 숫자뒤에 L를 붙여줘야한다. 아니면 int로 인식해서 범위가 잘못된다                  
        long longMax = 9223372036854775807L;
    }
    public void checkChar(){
        /* 
            \ u(유니코드 주석처리가안됨으로 둘이 붙여써야함) : 16진수 값넣는게일반적 추가로 여러 숫자가와도 상관없다.
            4개의 16진수가 와야한다.          
        */
        
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");
        int intValue = 'a';
        System.out.println("intValue = [" + intValue + "]");
    }
    public void checkBoolean(){
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }
    
    int intDefault1;
    // 지역변수는 반드시 초기화를 해야한다.
    public void defaultValues() {
        int intDefault2;
        System.out.println(intDefault1);
        System.out.println(intDefault2);
    }
}