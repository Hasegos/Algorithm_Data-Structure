
// static 개념 내용
class SaticSample{

    // static
    static int m ;
    void f(){
        m = 100;
    }   
    // non - static
    int n;                     
    int g(){
       return n = 1000;
    }
    
}

public class java_14주차_1 {  
    public static void main(String[] args) {
        
        SaticSample s1 /*, s2*/;        
        SaticSample.m = - 1000;
        s1 = new SaticSample();
        System.out.println(SaticSample.m);
        System.out.println(s1.g());
        s1.n = 2000;
        System.out.println(s1.n);
        s1.f();
        System.out.println(SaticSample.m);
    }
    
}
