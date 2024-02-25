package java_책_2단원;

    public class  변수_리터럴_상수_개념{
    public static void main(String[] args) {
        
        final double pi = 3.14; // final: 상수선언  나중에 바꿀려면 이줄 바꿔야함.
        double radius = 10.2; // 반지름 정하기.
        double circleArea=pi * radius; // 원의 넓이

        System.out.println("반지름:"+radius+", "); // 반지름 출력
        System.out.println("원의 면적:"+circleArea); // 원의 넓이 출력

        return;

    }
        
}


