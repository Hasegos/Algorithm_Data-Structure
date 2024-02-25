package java_책_4단원;
import java.util.*;
class Book{
    String title , author ;
    public Book(String title ,  String author) // 생성지
    {
        this.title = title;
        this.author = author;
    }
}
public class 객체_배열_만들기_연습 {
    
    public static void main(String[] args) {
        
        Book [] book = new Book[2];
        Scanner  scanner = new Scanner(System.in);
        for(int i = 0; i < book.length; i ++)
        {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author); // 배열 원소 객체 생성
        }
        for(int i = 0; i < book.length; i ++)
        {
           System.out.print("("+book[i].title + ", "+book[i].author+")");
        }
        scanner.close();
    }
    
}
