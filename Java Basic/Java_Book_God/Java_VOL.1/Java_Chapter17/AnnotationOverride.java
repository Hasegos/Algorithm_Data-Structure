
public class AnnotationOverride extends Parent {
    
    // 어노테이션 추가로 Override을 한것을 구분하기 쉽다.
    @Override
    public void printName(){
        System.out.println("AnnotationOverride");
    }
    @Override
    public void printName(String args){
        System.out.println("AnnotationOverride");
    }
}
