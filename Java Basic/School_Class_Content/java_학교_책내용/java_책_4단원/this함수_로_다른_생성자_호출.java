package java_책_4단원;

public class this함수_로_다른_생성자_호출 {
    
    String title;
    String author;

    void show()
    {
        System.out.println(title+" "+author);
    }
    public this함수_로_다른_생성자_호출 () //  기본 생성자를 호출한다.
    {
        this("","");
        System.out.println("생성자 호출됨");
    }
    public this함수_로_다른_생성자_호출 (String title) 
    {
        this.title = title; // this 는 생성자의 무조건 첫번째 문장으로 사용되야한다.
        this.author = "작자미상"; //  >>  this(title,"작자미상"); 같다 
    }

    public this함수_로_다른_생성자_호출 (String title , String author) 
    {
        this.title = title;
        this.author =  author;
    }

    public static void main(String[] args) {
        
        this함수_로_다른_생성자_호출 littlePrice = new  this함수_로_다른_생성자_호출("어린왕자","생텍쥐페리");
        this함수_로_다른_생성자_호출 loveStroy = new  this함수_로_다른_생성자_호출("춘향전");        
        this함수_로_다른_생성자_호출 emptyBookr = new this함수_로_다른_생성자_호출();
        loveStroy.show();
        littlePrice.show();
        emptyBookr.show();

    }
    
    
}
