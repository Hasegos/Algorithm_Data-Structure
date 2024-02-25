// @UserAnnotation(number = 0) 범위 초과하면 안된다.
public class UserAnnotationSample {
    // 여기서 number 는 기본값이 지정이 안되어있으므로 지정해줘야한다.
    @UserAnnotation(number = 0)
    public static void main(String[] args){
        UserAnnotationSample sample = new UserAnnotationSample();
    }
    
    @UserAnnotation(number = 1)
    public void annotationSample1(){        
    }
    
    @UserAnnotation(number = 2, text = "second")
    public void annotationSample2(){        
    }
    
    @UserAnnotation(number = 3, text = "third")
    public void annotationSample3(){        
    }
}
