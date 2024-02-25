import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target : 사용 대상을 지정한다.
// 여기서 ElementType.METHOD를 넣어줌으로써 메소드에 사용할 수 있다고 지정.
@Target(ElementType.METHOD)
// @Retention 는 유지 정보를 지정하는데 사용한다.
// RetentionPolicy.RUNTIME으로 지정하면 실행시에 어노테이션을참조한다.
@Retention(RetentionPolicy.RUNTIME)
// @을 사용해서 선언하면 @UserAnnotation으로 어노테이션이 사용 가능하다.
public @interface UserAnnotation {
    // 해당 항목에 대한 타입으로 값을 지정 가능하다.
    public int number();
    // default는 default뒤에 있는 값이 이 어노테이션을 사용할 때의 기본 값이된다.
    public String text() default "This is first annotation";
}
