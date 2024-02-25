class Foo{
    
    public static String classVar = "I class var";    
    public String instanceVar = "I instance var";
    
    public static void classMethod(){
        System.out.println(classVar); // Ok
        // System.out.println(instanceVar); // Error
    }
    public void instanceMethod(){
        System.out.println(classVar); // Ok
        System.out.println(instanceVar); // Ok
    }
    
}
public class StaticApp {
   /*
        1.클래스 기반에 소속되어 있지않은 변수는 불러올 수 있다.
        2.클래스 기반 메소드에서는 인스턴스 변수를 가져올 수 없다 
        3.인스턴스 기반메소드에서는 클래스 변수와 인스턴스 변수를 가져올 수 있다.    
        4.클래스에 있는 인스턴스 메소드를 클래스 기반으로 불러올 수 없다.
        5.인스턴스를 했을 시, 클래스 기반 메소드,함수는 참조할 뿐이다.
        6.인스턴스를 했을 시, 인스턴스 값을 바꾼다고해서 class 기본 값이 변하지는 않는다.
        7.class 원형을 바꿀 시, 인스턴스가 가르키는 static도 변한다.
        
        
        결론 :같은 인스턴스화 시킨 변수들 끼리는 static(클래스 기반)을 참조하기때문에
        서로 영향을 미치지만, instance(인스턴스 기반)은 변수 값을 바꿔도 서로 영향을 안미친다.
    */
    public static void main(String[] args) {
        
        System.out.println(Foo.classVar); // OK
        // System.out.println(Foo.instanceVar); // Error
        Foo.classMethod(); // OK
        // Foo.instanceMethod(); // Error
        
        
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        
        
        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instanceVar
        
        f1.classVar = "change by f1";
        System.out.println(Foo.classVar); // 원형
        System.out.println(f2.classVar); // 복제한 f2  
        
        f1.instanceVar = "change by f1";
        System.out.println(f1.instanceVar); // change by f1
        System.out.println(f2.instanceVar); // I instance var
    }    
    
}
