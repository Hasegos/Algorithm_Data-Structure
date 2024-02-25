
public class AnonymousSample {
    
    class MagicButtonListener implements EventListener {         
        public void onClick(){
            System.out.println("Magic Button Clicked !!!");
        }        
    }   
    
    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        // MagicButtonListener에서 EventListener에 해당되는 인터페이스를 구현해놓은걸 넘겨준다.
        sample.setButtonListener();
        sample.setButtonListenerAnonymous();
        sample.setButtonListenerAnonymousObject();
    }    
    public void setButtonListener(){
        MagicButton button = new MagicButton();
        /*
            button.setListener( 들어갈게 마땅치않다.);
            EventListener 타입으로 마땅히 넣을 매개변수가 존재하지않으므로
            Nested 클래스를 이용해서 해당 타입 매개변수로 준다.
        */
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);        
        button.onClickProcess();        
    }
    public void setButtonListenerAnonymous() {
        /*
            익명 클래스를 내부에 만들어서 사용한다.
            클래스의 이름과 객체 이름도 없기때문에 참조가 불가능하다.            
        */
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            public void onClick() {
                System.out.println("Magic Button Clicked !!!");
            }
        });
        button.onClickProcess();       
    }
    public void setButtonListenerAnonymousObject() {
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            public void onClick(){
                System.out.println("Magic Button Clicked !!!");    
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }
     
}
