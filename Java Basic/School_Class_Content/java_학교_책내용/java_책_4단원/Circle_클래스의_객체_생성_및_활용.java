package java_책_4단원;

public class Circle_클래스의_객체_생성_및_활용 {
    int radius;
    String name;    

    public double getArea()
    {
        return 3.14 * radius * radius ;
    }
    public static void main(String[] args) {
        
        Circle_클래스의_객체_생성_및_활용 pizza ; // 객체에 대한 래퍼런스 변수 pizza 선언
        pizza  = new Circle_클래스의_객체_생성_및_활용(); // Circle_클래스의_객체_생성_및_활용 객체 생성
        pizza.radius = 10; //  피자의 반지름 10으로 설정
        pizza.name = "자바피자"; // 피자의 이름 설정
        double area = pizza.getArea(); // 피자의 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle_클래스의_객체_생성_및_활용 donut =  new Circle_클래스의_객체_생성_및_활용(); // Circle_클래스의_객체_생성_및_활용 객체 생성
        donut.radius = 2; // 도넛의 반지름 2로 설정
        donut.name = "자바도넛"; //  도넛의 이름 설정
        area  =  donut.getArea(); // 도넛의 면적 알아내기
        System.out.println(donut.name + "의 면적은 " + area);

    }
    
    
}
