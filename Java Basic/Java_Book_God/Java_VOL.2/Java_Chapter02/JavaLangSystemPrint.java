
public class JavaLangSystemPrint {
    /*
     println() 에서는 단순히 toString() 메소드 결과로 출력하지않는다.
     즉, println()에서 객체를 호출할때 String.valueOf() 형태로 들어가지만
     객체를 toString()형태로 호출시 객체 자체를 불러내기때문에 안전성이 떨어진다.
     추가로 println(객체 + "문자열")으로 출력할시 StringBulider를 통해 출력된다.
     new StringBulider().append(객체).append("문자열")
    */
    public static void main(String[] args) {
        JavaLangSystemPrint sample = new JavaLangSystemPrint();
        sample.printStreamCheck();
        sample.printNull();
        sample.printNullToString();
    }
    public void printStreamCheck(){
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
    }
    public void printInt(int value){
        System.out.println(value);
    }
    
    public void printNull(){
        Object obj = null;
        System.out.println(obj);        
        // 여기서는 String.valueOf(obj)로 타입을 변환시켜서 출력했다.
        System.out.println(obj + " is object's value");
    }
    public void printNullToString(){
        Object obj = null;
        System.out.println(obj.toString());
    }
}
