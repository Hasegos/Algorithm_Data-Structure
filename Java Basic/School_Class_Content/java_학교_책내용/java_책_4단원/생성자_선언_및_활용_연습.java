package java_책_4단원;
public class 생성자_선언_및_활용_연습{

    String title;
    String author;
    public 생성자_선언_및_활용_연습(String t) // 생성자
    {
        title = t;
        author = "작자 미상";
    }
    public 생성자_선언_및_활용_연습(String t, String a) // 생성자
    {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        
        생성자_선언_및_활용_연습 littlePrice = new  생성자_선언_및_활용_연습("어린왕자","생텍쥐페리");
        생성자_선언_및_활용_연습 loveStroy = new  생성자_선언_및_활용_연습("춘향전");
        
        System.out.println(littlePrice.title+ "  "+littlePrice.author);
        System.out.println(loveStroy.title+ "  "+loveStroy.author);

    }
    
}
