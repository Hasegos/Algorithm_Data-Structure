
public class AnnotationSample {
    // SuppressWarnings : 오류인거 알고 있으니 눈감아달라
    @SuppressWarnings("deprecation")
    public void useDeprecated(){
        AnnotationDeprecated child = new AnnotationDeprecated();
        child.noMoreUse();
    }    
}
