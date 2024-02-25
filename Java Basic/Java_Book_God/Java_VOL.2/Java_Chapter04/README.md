<!---완료--->

# 컬렉션(Collection) - List

* [자바의 神 VOL.2 주요 API 응용편 이동](https://github.com/Hasegos/Start_JAVA/tree/master/Java_Book_God/Java_VOL.2)

* 목차
    * [컬렉션(Collection)이란](#컬렉션collection이란)
    * [Stack 개념과 사용법](#stack-개념과-사용법)
    * [ArrayList 개념과 사용법](#arraylist-개념과-사용법)    
    
<!---목차 1--->
## **컬렉션(Collection)이란**
>
>자바에서 **컬렉션(Collection)** 은 **목록성 데이터를 처리하는 자료구조**를 말한다.  
>자료구조는 영어로 **"Data Structure"** 라고 말한다.  
>다시말해 데이터를 담는다는 의미인데 이때 **여러데이터를 담는걸** 말한다.  
>
>예를들어 String 객체를 담는다하고 배열의 크기를 모른다고 했을때,  
>우리가 할수있는 방법은 배열에 Integer.MAX_VALUE를 넣어 최대치를 만드는 것이고  
>이도 부족하면 복사해서 사용하면된다. 만약 이렇게하면 메모리낭비가 엄청 발생한다.  
>
>그래서 이를 해결하고자 컬렉션(Collection) 개념을 가지는 자료구조가 있다.
>
>+ **순서가 있는 목록List형**
>+ **순서가 중요하지 않은 셋Set형**
>+ **먼저** 들어온 것이 **먼저나가는 큐Queue형**
>+ **키-값key-value**으로 저장되는 **맵Map형**
>
>![2 (1)](https://github.com/Hasegos/Start_JAVA/assets/93961708/9dfd9689-252c-4fc0-98fc-ee17bc3a7ad3)

#
>### **Collection 인터페이스**
>
>
>        public interface Collection<E> extends Iterable<E>
>
>
>이처럼 되어있고 여기서 Iterable은 Iterator라는 인터페이스를 가진다.  
>**Iterator**는 **반복할때 제어하는 용도**로 사용한다.  

#
>### **Collection 주요메소드**
>
>
>![1 (1)](https://github.com/Hasegos/Start_JAVA/assets/93961708/4f258ee4-45a2-48f4-bb2b-c6c92e02f12e)
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#컬렉션collection---list)

<!---목차 2--->
## **Stack 개념과 사용법**
>
>List 인터페이스를 구현하는 또 하나의 클래스 Stack이 존재한다.  
>Stack이란 **마지막에 들어온 데이터를 가장 처음 꺼내는 LIFO(Last In First Out) 기능을 구현한 클래스**이다  
>즉, 우리말로는 **후입선출**이다.  그리고 **Thread safe하다.**  

#
>### **Stack 클래스의 상속관계**
>
>        java.lang.Object
>            java.util.AbstractCollection<E>
>                java.util.AbstactList<E>
>                    Java.util.Vector<E>
>                        Java.util.Stack<E>
>
>Stack 클래스는 List 인터페이스를 받기에 List에 소속되어있다.

#
>### **Stack 생성자**
>
>|<center>생성자</center> | <center>설명</center>|
>|:-----:|:-----:|
>|Stack()|아무 데이터도 없는 Stack 객체를 만든다.|

#
>### **Stack 메소드**
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|boolean|add(E e)|객체가 비어 있는지를 확인한다.|
>|E|empty()|객체의 가장 위에 있는 데이터를 리턴한다.|
>|E|peek()|객체의 가장 위에있는 데이터를 지우고, 리턴한다.|
>|E|push(E item)|매개 변수로 넘어온 데이터를 가장 위에 저장한다.|
>|int|search(Object o)|매개 변수로 넘어온 데이터의 위치를 리턴한다.|

#
>### **Stack 객체 불러내기 - peek()**
>        public void checkPeek(){
>            Stack<Integer> intStack = new Stack<>();
>            for(int loop = 0; loop < 5; loop++){
>                intStack.push(loop);
>                System.out.println(intStack.peek());
>            }
>            System.out.println("Size = " + intStack.size());
>        }
>
>### **결과**
>
>        0
>        1
>        2
>        3
>        4
>        size = 5
>
>각 반복문에서 **제일 위에있는 값**을 가져온다.

#
>### **Stack 객체 불러내기 - pop()**
>
>        public void checkPop() {
>            Stack<Integer> intStack = new Stack<>();
>            for(int loop = 0; loop < 5; loop++){
>                intStack.push(loop);
>                System.out.println(intStack.pop());
>            }
>            System.out.println("Size = " + intStack.size());
>        }
>
>### **결과**
>
>        0
>        1
>        2
>        3
>        4
>        size = 0
>
>가장 위에있는 값을 불러내면서 **그 값을 삭제한다.**
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#컬렉션collection---list)

<!---목차 3--->
## **ArrayList 개념과 사용법**

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[처음 목차로 돌아가기](#컬렉션collection---list)

>* 목차 
>    * [ArrayList 개념](#arraylist-개념)
>    * [ArrayList 생성자](#arraylist-생성자)
>    * [ArrayList 데이터 추가](#arraylist-데이터-추가)
>    * [ArrayList 데이터 꺼내기](#arraylist-데이터-꺼내기)
>    * [ArrayList 삭제하기](#arraylist-삭제하기)
>    * [번외)](#번외)
    
>## **ArrayList 개념**
>
>ArrayList는 **List 인퍼페이스**를 상속을 받았다.  
>Collection을 확장한 다른 인터페이스와 다르게 List 인터페이스는 배열처럼 **"순서"** 가 있다는 것이다.  
>그리고 java.util 패키지에서 **ArrayList, Vector, LinkedList, Stack**을 많이 사용한다.  
>이중에서 ArrayList와 Vector는 기능이 유사하지만 **ArrayList**는 **Thread safe하지않고** **Vector**는 **Thread safe**하다.

#
>### **ArrayList 클래스의 상속관계도**
>
>            java.lang.Object
>                java.util.AbstractCollection<E>
>                    java.util.AbstractList<E>
>                        java.util.ArrayList<E>

#
>### **ArrayList가 구현한 인터페이스**
>
>        Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess
>
>|<center>인터페이스</center> | <center>용도</center> |
>|:-----:|:-----:|
>|Serializable | 원격으로 객체를 전송하거나, 파일에 저장할 수 있음을 지정|
>|Cloneable | Object 클래스의 clone() 메소드가 제대로 수행될 수 있음을 지정. 즉, 복제가 가능한 객체임을 의미한다.|
>|Iterable<E> | 객체가 "foreach" 문장을 사용할 수 있음을 지정|
>|Collection<E> | 여러 개의 객체를 하나의 객체에 담아 처리할 때의 메소드 지정|
>|List<E> | **목록형 데이터**를 처리하는 것과 관련된 **메소드 지정**|
>|RandomAccess |목록형 데이터에 보다 빠르게 접근할 수 있도록 임의로(random하게) 접근하는 알고리즘이 적용된다는 것을 지정|
>
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#arraylist-개념과-사용법)

>## **ArrayList 생성자**
>
>ArrayList는 확장가능한 배열이다.  
>배열처럼 사용하지만 대괄호를 사용하지않고 객체를 넣고, 빼고, 조회를 한다.  
>
>|<center>생성자</center>|<center>설명</center>|
>|:---|:---|
>|ArrayList()|객체를 저장할 공간이 10개인 ArrayList를 만든다.|
>|ArrayList(Collection<? extends E> c)|매개 변수로 넘어온 컬렉션 객체가 저장되어 있는 ArrayList를 만든다.|
>|ArrayList(int initialCapacity)|매개 변수로 넘어온 initialCapacity 개수만큼의 저장공간을 갖는 ArrayList를 만든다.|

#
>### **여러 객체 저장**
>
>        public void checkArrayList1(){
>            ArrayList list = new ArrayList();
>            list.add(new Object());
>            list.add("ArrayListSample");
>            list.add(new Double(1));
>        }
>
>ArrayList에는 어떤 객체를 넣어도 되지만 서로 다른 종류의 객체를 넣지않고, **한가지 종류의 객체**만 저장한다.  

#
>### **한가지 종류 객체 저장**
>
>        ArrayList<String> list = new ArrayList<String>();

#
>### **ArrayList 객체선언시 초기값 지정**
>
>        ArrayList<String> list2 = new ArrayList<String>(100);
>
>ArrayList선언할때 초기값을 **매개변수**로 줄수있다.  
>만약 초기값을 주지않으면 크기는 **10으로 초기값**을 가진다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#arraylist-개념과-사용법)

>## **ArrayList 데이터 추가**
>
>ArrayList에 데이터를 담는 메소드는 이 두가지 add(), addAll() 메소드만 알면된다.  
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|boolean|add(E e)|매개변수로 넘어온 데이터를 가장 끝에 담는다|
>|void|add(int index, E e)|매개변수로 넘어온 데이터를 지정된 index 위치에 담는다.|
>|boolean|addAll(Collection<? extends E> c)|매개변수로 넘어온 컬렉션 데이터를 가장 끝에 담는다|
>|boolean|add(int index, Collection<? extends E> c )|매개변수로 넘어온 컬렉션 데이터를 지정된 index 위치에 담는다.|

#
>### **add(E e)**
>
>이 메소드를 사용하면 데이터를 배열의 **가장 끝에 데이터**를 담는다.  
>여기서 boolean 타입은 제대로 추가가 되었는지 여부를 말한다.

#
>### **add(int index, E e)**
>
>index와 함께 데이터를 넘겨주는 add()메소드는 **지정된 위치에 데이터를 담는다.**

#
>### **add()**
>
>        public void checkArrayList2(){      
>            ArrayList<String> list = new ArrayList<>();
>            list.add("A");
>            list.add("B");
>            list.add("C");
>            list.add("D");
>            list.add("E");
>            list.add(1,"A1");    
>        }
>
>### **결과**
>
>        A
>        A1
>        B
>        C
>        D
>        E
    
#
>### **addAll()**  
>
>여기서 **list**는 **위 add()에서 사용한 값**  
>
>        public void checkArrayList3(){
>            ArrayList<String> list2 = new ArrayList<>();
>            list2.add("0 ");
>            list2.addAll(list);  
>            for(String tempData : list2){
>                System.out.println("List2 " + tempData);
>            }
>        }
>
>### **결과**  
>
>        list2 0
>        list2 A
>        list2 A1
>        list2 B
>        list2 C
>        list2 D
>        list2 E

#
>### **ArrayList 객체참조**  
>
>        public void checkArrayList4(){
>            ArrayList<String> list = new ArrayList<>();
>            list.add("A");
>            ArrayList<String> list2 = list;
>            list.add("Ooops");
>            for(String tempData : list2){
>                System.out.println("List2 " + tempData);
>            }
>        }
>
>### **결과**  
>
>        List2 A
>        List2 Ooops
>    
>    
>여기서 list2에 list값을 할당하고 list에 값을 더했을때  
>**list2**는 **list값을 참조**하기때문에 **추가된 내용까지 출력한다.**  
>즉, **하나의 객체가 변경되면 다른 이름의 변수를 갖는 객체의 내용도 바뀐다.**
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#arraylist-개념과-사용법)

>## **ArrayList 데이터 꺼내기**
>
>ArrayList 데이터를 꺼내오기전에 알아야할 것이있다.  
>ArrayList 객체에 들어가 있는 데이터의 개수를 가져오는 **size()메소드**를 알아야한다.  
>size() 메소드를 통해 데이터의 개수를 확인할 수 있다.  
>이때 그 크기는 ArrayList에 **담을 수 있는 공간의 개수지, 들어가 있는 개수는 아니다.**  

#
>### **size()**
>
>        public void checkArrayList5(){
>            ArrayList<String> list = new ArrayList<>();
>            list.add("A");
>            list.add("B");
>
>            int listSize = list.size();
>            for(int loop = 0; loop < listSize; loop++){
>                System.out.println("list.get(" + loop + ") = " + list.get(loop));
>            }
>        }
>
>여기서 데이터를 담을수 있는 공간을 통해 가져올 수 있는데 이때 **get()메소드**를 사용한다.  

#
>### **메소드 정리**
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개 변수</center>|<center>설명</center>|
>|:---|:---|---|
>|int|size()|ArrayList 객체에 들어가 있는 데이터의 개수를 리턴한다.|
>|E|get(int index)|매개 변수에 지정한 위치에 데이터를 리턴한다.|
>|int|indexOf(Object o)|매개 변수로 넘어온 객체와 동일한 데이터의 위치를 리턴한다.|
>|int|lastIndexOf(Object o)|매개 변수로 넘어온 객체와 동일한 마지막 데이터의 위치를 리턴한다.|     

#
>### **ArrayList 객체에있는 데이터를 배열로만들기**
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개 변수</center>|<center>설명</center>|
>|:---|:---|---|
>|Object[]|toArray()|ArrayList 객체에 있는 값들은 Object[] 타입의 배열로 만든다.|
>|<T> T[]|toArray(T[] a)|ArrayList 객체에 있는 값들을 매개 변수로 넘어온 T 타입의 배열로 만든다.|

#
>### **toArray()**
>
>        public void checkArrayList6(){
>            ArrayList<String> list = new ArrayList<>();
>            list.add("A");
>
>            String[] strList = list.toArray(new String[0]);
>            System.out.println(strList[0]);        
>        }
>
>list에 있는 값을 **toArray(타입의 배열)메소드를 통해 해당 타입의 배열로 변환을 시켜준다.**  
>여기서 주의점이 있다.  
>만약 **객체의 데이터 크기가 매개변수로 넘어간 배열 객체의 크기보다 클 경우 null값을 채워진다.**  
>반대로 **작을 경우는 기존값들이 null값으로 변한다.**  

#
>### **예시)** 
>
>    객체의 데이터크기가 더 클경우
>    
>        A
>        B
>        C
>        null
>        null    
>        
>    
>    객체의 데이터크기가 더 작을 경우
>        
>        null
>        null
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#arraylist-개념과-사용법)

>## **ArrayList 삭제하기**
>
>**ArrayList 클래스에서 제공하는 데이터 삭제 관련 메소드**
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개 변수</center>|<center>설명</center>|
>|:---|:---|---|
>|void|clear()|모든 데이터를 삭제한다.|
>|E|remove(int index)|매개 변수에서 지정한 위치에 있는 데이터를 삭제하고, 삭제한 데이터를 리턴한다.|
>|boolean|remove(Object o)|매개 변수에 넘어온 객체와 동일한 첫 번째 데이터를 삭제한다.|
>|boolean|removeAll(Collection<?> c)|매개 변수로 넘어온 컬렉션 객체에 있는 데이터와 동일한 모든 데이터를 삭제한다.|
>
>여기서 remove() 와 removeAll() 차이는 **전자**는 **첫 번째 데이터만 삭제**하고 **후자**는 **모든 데이터를 삭제한다.**
#

>### **remove() / removeAll()**
>
>        public void checkArrayList8(){
>            ArrayList<String> list = new ArrayList<>();
>            list.add("A");
>            list.add("B");
>            list.add("C");
>            list.add("A");
>            
>            첫번째 Remove() 경우
>
>            System.out.println("Removed " + list.remove(0));
>            System.out.println(list.remove("A"));
>
>            ArrayList<String> temp = new ArrayList<>();
>            temp.add("A");
>
>            두번째 RemoveAll() 경우
>            list.removeAll(temp);                
>
>
>            for(int loop = 0; loop < list.size(); loop++){
>                System.out.println("list.get(" + loop +")" + list.get(loop));
>            }        
>        }
#
    
>### **첫번째 remove() 경우**
>
>
>        Removed A
>        list.get(0) = B
>        list.get(1) = C
>        list.get(2) = A
>
>이처럼 **가장 처음**에 들어간 A값만 삭제되고 **뒤에 있는 A값은삭제가 안된것**을 볼 수 있다.
#

>### **두번째 removeAll() 경우**
>
>
>        list.get(0) = B
>        list.get(1) = C
>
>"A" 라는 값을 갖는 **모든 데이터**가 삭제된것을 확인할 수 있다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#arraylist-개념과-사용법)

>## **번외)**
>
>### **set 메소드**
>|<center>리턴타입</center>|<center>메소드 이름 및 매개 변수</center>|<center>설명</center>|
>|---|---|---|
>|E|set(int index, E element)|지정한 위치에 있는 데이터를 두 번째 매개 변수로 넘긴 값으로 변경한다.  그리고, 해당 위치에 있던 데이터를 리턴한다.|

#
>### **set()**
>
>        public void checkArrayList8(){
>            ArrayList<String> list = new ArrayList<>();
>            list.add("A");
>            list.add("B");
>            list.add("C");
>
>            0 번째 위치에있는 값을 B로 변경
>            list.set(0,"B");
>
>### **결과**
>
>        B
>        B
>        C
>
>
>이처럼 값을 변경을 위해서는 삭제 하고 추가하는 두번의 작업을해야한다.  
>그러나 **set()** 를 사용하면 **한번**으로 가능하다.

#
>### **ArrayList는 Thread safe하지않다?**
>
>ArrayList 개념을 알아볼때 **Thread safe하지않다고 했다.**  
>여러 작업이 동시에 안된다는 것으로 이를 해결방법은 **ArrayList라는 List로 객체를 생성**해주면된다.
>
>        List list = Collection.synchronizedList(new ArrayList(...))
>
>위와 같은 형식으로 **객체를 생성하지않으면 원하지않는 값이 나올 수 있다.**
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#arraylist-개념과-사용법)