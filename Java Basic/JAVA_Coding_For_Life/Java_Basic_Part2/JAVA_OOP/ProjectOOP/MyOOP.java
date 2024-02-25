/*
class Print{
    // 데이터 타입 확인잘하기
    public static String delimiter;    
    public static void A(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public static void B(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }    
    
}
*/

// public 접근 제어자
public class MyOOP {
    // public static String delimiter;
    
    /*
    public static void printA(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    
     public static void printB(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
    */
    
    /*
        인스턴스는 각 종류의 빵찍는 기계들을 깔아두고 찍어내는것과 같다.
        인스턴스를 사용안하는것은 빵찍는 기계를 두고 매번 다른 종류의 빵을 찍어내는 것과같습니다.          
    */
    
    // ..
    
    public static void main(String[] args) {
        
        // .. 
        // System.out.println("----");
        // System.out.println("A");
        // System.out.println("A");
        // .. 
        // System.out.println("----");
        // System.out.println("A");
        // System.out.println("A");
        // .. 
        
       
        // delimiter = "----";
        // Print.delimiter="----";
        
        Print p1 = new Print("-----");
        // p1.delimiter = "-----";
        
        
        p1.A();
        p1.A();
        p1.B();
        p1.B();
        
        Print p2 = new Print("*****");
        // p2.delimiter = "*****";
        p2.A();
        p2.A();
        p2.B();
        p2.B();
        
        
        
        p1.A();
        p2.A();
        p1.A();
        p2.A();
        
        
        
        // Print.A();
        // Print.A();                
        // Print.B();
        // Print.B();
        
       
        // delimiter = "*****";
        // Print.delimiter="*****";
        
        // Print.A();
        // Print.A();                
        // Print.B();
        // Print.B();
        
        
        
    }
    
}
