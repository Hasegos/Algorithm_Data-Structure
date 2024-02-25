import java.util.*;
public class BookApp {
    static void show(Book2 temp)
    {
        System.out.print(Book2.title);
        System.out.println(", "+Book2.author);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       // System.out.print("책 제목:");
       // title = scanner.next();
       // System.out.print("책 저자:");
       // author = scanner.next();
        Book2 sample1 = new Book2("어린왕자","테리");
        show(sample1); // 객체도 보낼 수 도있다.
       // sample1.show();
        System.out.println(sample1.getTitle());
        
        Book2 sample2 = new Book2("춘향전");
        show(sample2);
       // sample2.show();
        scanner.close();
        System.out.println(sample2.getTitle());
        
    }
    
}
// 객체를 가지고 배열을 만들 수있는 가? 생각해보기  클래스 배열