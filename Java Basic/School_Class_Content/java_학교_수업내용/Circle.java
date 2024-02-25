public class Circle {
    
    String name;
    int radius;
    
    public Circle(){
            radius = 1;
    }
    public Circle(int i){
            radius = i;
    }
     double getArea(){   // 같은 폴더에 있으면 상관없다 만약 private 같은경우는 다른 클래스이기에 안된다.
        return 3.14 * radius * radius;    
    }
    
}
