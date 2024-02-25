public class Book2 {
    
        static String title;
        static String author;
        public Book2(String title){
            this(title,"작자미상");
        }
        public Book2(String title,String author){
            Book2.title = title;
            Book2.author = author;
        }
        public void show(){
            System.out.print("제목: "+title);
            System.out.println(", 저자: "+author);
        }
        public String getTitle(){
            return title;

        }   
    
}
