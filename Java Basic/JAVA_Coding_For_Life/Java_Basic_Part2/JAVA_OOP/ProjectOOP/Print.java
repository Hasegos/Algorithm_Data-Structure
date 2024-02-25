
public class Print {
    /*
        사용자가 인스턴스화를 기본적인 값을 넣어야 실행 된다고 가정할때,
        함수를 호출할때 같은 함수 이름과 파라미터값과 순서,갯수 등 맞을 때
        호출 되는 성질을 이용하여 "생성자"를 활용해서 미리 지정해준다면, 
        사용자가 실수할 확률을 낮출 수 있다.
        
        생성자 : 초기에 주입해야할 값을 지정할때 사용한다.
    
        this ; 우리가 생성한 인스턴스를 가르킨다.
    */
    public  String delimiter;    
    
    public Print(String delimiter){
        this.delimiter = delimiter;
    }
    public void A(){
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B(){
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }   
}
