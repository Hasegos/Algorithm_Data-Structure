
public class MyPage {
    
    class InputBoxListener implements KeyEventListener {        
        public void onKeyDown(){
            System.out.println("Key Down1");
        }
        public void onKeyUp(){
            System.out.println("Key Up1");
        }        
    }    
    InputBox input = new InputBox(); 
    public static void main(String[] args) {
        MyPage page = new MyPage();
        // 방법 1
        page.setUI_1();
        page.pressKey();
        // 방법 2
        page.setUI_2();
        page.pressKey();
        // 방법 3
        page.setUI_3();
        page.pressKey();
        
    }
    public void setUI_1(){        
        // 방법 1 - 내부 클래스를 이용해 인터페이스 구현화 시킨걸 이용
        InputBoxListener listener = new InputBoxListener();
        input.setKeyListener(listener);       
    }
    public void setUI_2(){
         // 내 방법 - 매개변수를 인터페이스로 넘기기
        input.setKeyListener(new KeyEventListener(){
            public void onKeyDown(){
                System.out.println("Key Down2");
            }
            public void onKeyUp(){
                System.out.println("Key Up2");
            }
       }); 
    }
    public void setUI_3(){
        // 선생님 방법 - 인터페이스를 객체 형식으로
        KeyEventListener listener = new KeyEventListener() {            
            public void onKeyDown(){
                System.out.println("Key Down3");
            }            
            public void onKeyUp(){
                System.out.println("Key Up3");
            }
        };
        input.setKeyListener(listener);
    }
    // 여기서 listenerCalled() 메소드에서 받는 값은 UI 작업할때 키보드 누르는거 해당됨
    public void pressKey(){
        input.listenerCalled(input.KEY_UP);
        input.listenerCalled(input.KEY_DOWN);
    }
}
