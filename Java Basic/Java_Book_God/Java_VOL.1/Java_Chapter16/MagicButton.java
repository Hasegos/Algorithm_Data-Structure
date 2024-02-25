
public class MagicButton {
    
    public MagicButton(){
        
    }
    private EventListener listener;    
    public void setListener(EventListener listener){
        this.listener = listener;
    }
    public void onClickProcess(){
        if(listener != null){
            // EventListener 에 존재하는 onClick() 메소드 호출
            listener.onClick();
        }
    }    
}
