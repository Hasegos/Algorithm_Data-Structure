
public class BooleanApp {
    
    /*
        reserved word : 자바에서 약속한 데이터 타입
        contains() : 해당 워딩이 있으면 true , 아니면 false
        boolean 타입 : ★★★★★  참과 거짓으로 조건을 나누기 때문
    */
    
    public static void main(String[] args) {
        
        System.out.println("One");
        System.out.println(1);
        
        System.out.println(true);
        System.out.println(false);
        
        String foo = "Hello World";
        // String true = "Hello World";   
        System.out.println(foo.contains("World"));
        System.out.println(foo.contains("egoing"));
        
    }
}
