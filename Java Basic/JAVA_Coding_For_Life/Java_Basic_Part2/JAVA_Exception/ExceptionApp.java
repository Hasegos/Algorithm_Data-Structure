
public class ExceptionApp {
    
    public static void main(String[] args) {
        /*
            주목해야할 점 
                        1. 3이 출력이 되는가? no
                        2. 2/0처럼 허용되지 않는 경우는 어떤일이 일어나는가?
                           왜 되지않는지 예외를 알려준다.
                           
            예외적인 경우를 생각해서 나머지 코드를 실행시키도록 해야한다.        
            
            
            
            try 를 통해 해당 내용을 실행후 자바내에서 오류되는 부분을 catch로 잡아서 해결해준다.
            try 하나에 모든 내용을 담고 각각에 맞는 catch 부분을 생성후,
            사용시 try 구문에서 실행된 그이후 내용을 실행이안된다.
            
            try {
                내용
                 .
                 .
                 .
            }
            
            catch {
                내용
                 .
                 .
                 .
            }
            
            예외처리에서는 부모 클래스를 가지고 있기에 부모을 이용해서 예외처리하면,
            해당 자식의 오류가 발생해도 부모가 해결한다.]\
            
            그리고 catch의 해당 오류를 어디 위치에 넣냐에따라 우선순위가 달라진다.
        */
        System.out.println(1);
        int[] scores = {10,20,30};       
        try{
            System.out.println(2);
            // System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2/0);    
            System.out.println(4);
        }
        catch(ArithmeticException e){
            // getMessage() : 원인을 알려줌
            System.out.println("계산이 잘못된 것 같아요."+ e.getMessage());
            // printStackTrace() : 오류 전체를 보여줌
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("뭔가 이상합니다. 오류가 발생했습니다.");
        }
        
        
        // e 는 변수
        /*
        catch(ArithmeticException e){
            System.out.println("잘못된 계산이네요.");    
        }                
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 값을 찾고 계시네요 ^^");
        }
        */
        System.out.println(5);
        
    }
}
