package java_책_4단원;

public class 두_개의_생성자를_가진_Circle_클래스 {
    int radius;
    String name;

    public  두_개의_생성자를_가진_Circle_클래스() // 매개 변수 없는 생성자
    {
        radius = 1; name = ""; // radius의 초깃값은 1
    }
    public 두_개의_생성자를_가진_Circle_클래스(int r ,String n) // 매개 변수를 가진 생성자 
    {
        radius = r ; name = n ;
    }
    public double getArea()
    {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        
        두_개의_생성자를_가진_Circle_클래스 pizza =  new 두_개의_생성자를_가진_Circle_클래스(10,"자바피자"); // 객체 생성 , 반지름 10
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+area);

        두_개의_생성자를_가진_Circle_클래스 donut = new 두_개의_생성자를_가진_Circle_클래스();// 객체 생성 , 반지름 1
        donut.name =  "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+area);

    }
    

}
