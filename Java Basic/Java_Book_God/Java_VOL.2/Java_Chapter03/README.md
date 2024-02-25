<!---다함--->
# 제네릭(Generic)

* [자바의 神 VOL.2 주요 API 응용편 이동](https://github.com/Hasegos/Start_JAVA/tree/master/Java_Book_God/Java_VOL.2)

* 목차
    * [제네릭(Generic)이란](#제네릭generic이란)    
    * [제네릭(Generic) 타입의 이름 규칙](#제네릭generic-타입의-이름-규칙)
    * [제네릭(Generic) ? 이란](#제네릭generic--이란)
    * [제네릭(Generic) 타입의 범위](#제네릭generic-타입의-범위)
    * [메소드 제네릭(Generic) 선언하기](#메소드-제네릭generic-선언하기)

<!---목차 1--->
## 제네릭(Generic)이란
>
>제네릭이란 **"사전"** 에 문제가 발생할 수 있는 문제점을 **컴파일할 때 점검할 수 있도록** 한다.    
>
>        import java.io.Serializable;
>
>        public class CastingGenericDTO<T> implements Serializable {
>            private T object;
>            public void setObject(T object){
>                this.object = object;
>            }
>            public T getObject(){
>                return object;
>            }    
>        }
>
>여기서 <와> 그리고 안에 T를 볼수있다.  
>**제네릭**은 **꺽쇠 < , >**  그리고 안에 **가상의 타입이름** 을 넣어 만들 수 있다.  
>이렇게 제네릭을 사용하는 이유는 **형변환(Casting)에서의 실수를 미리 방지**하기위해서이다.  
>
>        String temp1 = (String)dto1.getObject();
>        StringBuffer temp2 = (StringBuffer)dto2.getObject();
>        StringBuilder temp3 = (StringBuilder)dto3.getObject();
>
>해당 타입을 불러낼때 무슨 타입인지 알고 **Casting**을 해줘야한다.  
>그런데 **미리 제네릭을 사용하면 Casting을 안해줘도된다.**  
>
>
>        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
>        dto1.setObject(new String());
>        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
>        dto1.setObject(new StringBuffer());
>        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
>        dto1.setObject(new StringBuilder());
>        
>이처럼 미리 제네릭으로 선언후 객체를 저장시키면  
>
>        String temp1 = dto1.getObject();
>        StringBuffer temp2 = dto2.getObject();
>        StringBuilder temp3 = dto3.getObject();   
>
>위와 같이 그냥 불러내면된다. 불편하게 **Casting 작업없이 가능하다.**  
>
---

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#제네릭generic)

<!---목차 2--->
## 제네릭(Generic) 타입의 이름 규칙
>
>제네릭 <> 꺽쇠 안에 뭐가 들어가도 상관없다고 했다.  
>다만 자바에서 정의한 기본 규칙들이 존재한다.  
>+ **E** : **요소**(Element, 자바 컬렉션(Collection)에서 주로 사용된다.  
>+ **K** : **키**  
>+ **N** : **숫자** 
>+ **T** : **타입**  
>+ **V** : **값**  
>+ **S,U,V** : **두 번째, 세 번째, 네 번째에 선언된 타입**  
>
---

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#제네릭generic)

<!---목차 3--->
## 제네릭(Generic) ? 이란
>
>기본적으로 <> 안에 들어가는 타입은 기본적으로 어떤 타입이라도 상관없다.  
>**만약 제네릭으로 String으로 선언된 타입에서 다른 타입을 받을려면 방법이 없다.**  
>클래스의 **타입만 바꿔도 Overriding이 불가능하다.**  
>
>이를 해결한게 **?** 이다. 즉, **wildcard 타입**이다.  
>
>
>        public void wildcardStringMethod(WildcardGeneric<?> c){
>            Object value = c.getWildcard();
>            if(value instanceof String){
>                System.out.println(value);    
>            }        
>        }
>
>이처럼 어떤타입을 받아도 가능하다.      
>다만 어떤 타입을 받았는지 확인하는 instanceof 를 사용해서 확인해야한다.      
>여기서 wildcard 타입을 사용하는데에는 제약이 있다.    
>
>        WildcardGeneric<?> wildcard = new WildcardGeneric<String>()
>
>이처럼 **선언을하고 그 객체의 값을 가져올 수는 있지만**, **특정 타입으로 값을 지정하는 것을 "불가능"** 하다.  
>즉, **선언은 가능해도 특정값을 가지고 초기화를 할 수 없다.**  
>
---

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#제네릭generic)

<!---목차 4--->
## 제네릭(Generic) 타입의 범위
>
>앞에서 얘기한 wildcard 타입을 제한할 수 있다.  
>즉, 특정타입만 받게끔 설정이 가능하다.  
>
>"?" 대신 "? extends 타입"으로 제한할 수 있다.  
>
>
>        public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
>            Car value = c.getWildcard();
>            System.out.println(value);
>        }
>
>위처럼 **WildcardGeneric<? extends Car> c** 형태로 **Car 클래스 관련 상속한 클래스**가 넘어와야한다.  
>
>이처럼 "? extends 타입"을 **"Bounded Wildcards"** 라고 부른다.   
>**Bound**라는 말은 **"경계"** 라는 의미도 있기때문에 **매개 변수로 넘어오는 제네릭 타입의 경계를 지정**하는데 사용된다는 의미이다.  
>
>앞에서 봤던 wildcard처럼 선언과 객체를 불러올수는 있지만, **특정한 타입을 지정할 수는 없다.**
>이처럼 **조회용 변수**로만 사용해야한다.  
>

---

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#제네릭generic)

<!---목차 5--->
## 메소드 제네릭(Generic) 선언하기
>
>
>wildcard로 메소드를 선언하면 가장 큰 단점으로는 매개변수로 사용된 **객체에 값을 추가할 수가 없다.**  
>하지만 정말로 방법이 없는 것은 아니다.    
>
>
>        public <T> void genericMethod(WildcardGeneric<T> c , T addValue){
>            c.setWildcard(addValue);
>            T value = c.getWildcard();
>            System.out.println(value);
>        }
>
>직접적으로 매개변수로 사용된 객체에 값을 추가할수는 없지만, **우회해서 추가하면된다.**    
>또 다른 매개변수로 **T타입 변수를 받아서 매개변수 객체에 추가하는 형식으로 우회하면 가능하다.**  
>
>추가적으로 **Bounded Wildcards** 또한 같은 방식으로 하면된다.  
>
>        public <T extends Car> void boundedGenricMethod(WildcardGeneric<T> c, T addValue)
>
>위 처럼 작성하면되고 만약 타입이 두개 이상이면 콤마로 구분하면된다.  

---

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#제네릭generic)