interface Calculable{
    double PI = 3.14;
    int sum(int v1, int v2);    
}
/*
class RealCal{
    public double plus(double v1, double v2, double v3){
        return v1+v2+v3
    }
}
*/
interface Printable{
     void print();   
}
class RealCal implements Calculable,Printable{    
    
    public int sum(int v1,int v2){
        return v1 + v2;
    }    
    
    public void print(){
        System.out.println("This is RealCal!!");
    }
}
/*
class DummyCal implements Calculable{
    public int sum(int v1,int v2){
        return 3;
    }
    
}
*/
class AdvancedPrint implements Printable{     
    
    public void print(){
        System.out.println("This is RealCal!!");
    }
}
   

public class InterfaceApp {
    
    /*
        다른것들은 상관없는데,
        무조건적으로 지켜야하는 규약을 구현을 위해 interface를 사용한다.
        인터페이스는 시작은 대문자, 형용사로 이름 짓는다. 
        자바에서는 하나의 클래스만 상속 받을 수 있고, 여러개의 인터페이스를 구현할 수 있다.
        인터페이스에 메소드를 정의할 땐 내용 x, 변수 정의 할 땐 내용 o
        추가로 변수를 재 정의 할 필요없고, 그값을 갖을 뿐이다.
        
        다형성 : 어떤 객체의 속성이나 기능이 상황에 따라 여러가지 형태를 가질 수 있는 성질
        쓰는 이유: 한클래스에서 수백개의 메소드들중에 해당 클래스의 메소드만 쓰고 싶을 경우
        
        부모클래스 변수 = new 자식 클래스();
        
        즉, 자식 클래스를 복제해서 특정한 부모 클래스를의 메소드만 사용하기위해 부모 클래스 타입만 들어오게끔 만든것.
       */
   
       
    public static void main(String[] args) {
        
        // 더하기 기능이 있는 클래스를 만들어주세요.
        
        RealCal c = new RealCal();
        System.out.println(c.sum(2,1));
        c.print();        
        //System.out.println(c.PI);
        
    }
    
}
