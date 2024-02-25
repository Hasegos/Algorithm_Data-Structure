/*
class Cal{
   
    
}


class Cal3 extends Cal{
   
}
*/
public class InheritanceApp {
    /*
        부모가 갖고 있는 기능을 재정의 할수 있다.오버라이딩(Overriding)
        부모가 갖고 있는 기능 이외에 추가할 수 있다.
        클래스내에 같은 메소드를 과적 할 수 있다.(형태만 다르면)
        이름은 같은데 파라미터와 반환 타입 다른걸 오버로딩(OverLoading) 
        대신, 반환값만 다른걸 사용할 수 없다.
        
        this : 같은 클래스 내에 해당 메소드
        super : 부모 클래스 내에 해당 메소드
        
        부모 클래스에 생성자가 정의 되어있으면,
        자식클래스는 부모 생성자를 실행 시키도록 강제한다.(super 키워드가 없어도)
        super() 사용함으로 써 부모 클래스의 생성자 사용
        
        Polymorphism(다형성) : 자식클래스를 부모클래스로 동작하게끔한다.
    */
    public static void main(String[] args) {
        
        Cal c = new Cal(2,1);        
        System.out.println(c.sum(2,1));
        System.out.println(c.sum(2,1,1));
        
        
        Cal3 c3 = new Cal3(2,1);        
        System.out.println(c3.sum(2,1));
        System.out.println(c3.minus(2,1));
        System.out.println(c3.sum(2,1));
        
        System.out.println(c3.sum()); // 3
        System.out.println(c3.minus()); // 1
        
    }
    
}
/*
class Cal2{
  
}
*/