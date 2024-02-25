<!---다함--->
# 컬렉션(Collection) - Set & Queue
  
* [자바의 神 VOL.2 주요 API 응용편 이동](https://github.com/Hasegos/Start_JAVA/tree/master/Java_Book_God/Java_VOL.2)

* 목차
    * [Set 개념과 사용법](#set-개념과-사용법)
    * [Queue 개념](#queue-개념)
    * [LinkedList 개념과 사용법](#linkedlist-개념과-사용법)
  
<!---목차 1--->
## **Set 개념과 사용법**
>Collection을 확장한 배열과 비슷한 역할을 하는 3개의 인터페이스가 존재한다.    
>List, Queue, Set 이 존재하는데 이중에서 Set을 알아보겠다.  
>
>### **Set 이란**
>Set은 **순서에 상관없이**, **어떤 데이터가 존재하는지를 확인하는 용도**로 사용한다.  
>즉, **중복되는 것을 방지**하고 **원하는 값이 포함되어 있는지를 확인**하는 것을 주로한다.  
>
>만약 Set이 존재하지않으면 서버에 요청하는 것을 해결할려면 **indexOf()** 를 통해 확인후 **add()** 를 사용해서 추가한다.  
>이렇게 되면, 데이터를 처리하는데에 시간이 많이든다.  

#
>### Set 인터페이스를 구현한 클래스
>
>+ **HashSet** : **순서가 전혀 필요 없는 데이터**를 해시 테이블(hash table)에 저장한다.   
>    Set 중에 가장 성능이 좋다.  
>+ **TreeSet** : 저장된 데이터의 값에 따라서 **정렬되는 셋**이다. red - black 이라는 트리(tree)타입으로 값이 저장되며,  
>    HashSet보다 약간 성능이 느리다.  
>+ **LinkedHashSet** : 연결된 목록 타입으로 구현된 해시 테이블에 데이터를 저장한다.**저장된 순서**에 따라서 값이 정렬된다.  
>    대신 성능이 이 셋 중에서 가장느리다.  
>
>여기서 red - black은 검은색과 뿕은 색으로 구분하여 데이터를 빠르고 쉽게 찾을 수 있는 이진(binary) 트리이다.  
>
>![1 (1)](https://github.com/Hasegos/Start_JAVA/assets/93961708/aba79b07-4eab-4678-a4e2-01aa7ba0ab1b)

#
>### HashSet 상속관계
>
>        java.lang.Object
>            java.util.AbstractCollection<E>
>                java.util.AbstractSet<E>
>                    java.util.HashSet<E>
>
>Object 클래스에 있는 equals(), hashCode(), removeAll()을 메소드로 가진다.  
>Set은 데이터의 중복을 허용하지않으므로, equals() 와 hashCode() 메소드를 구현하는 부분이 중요하다.  
>추가로 removeAll() 메소드는 컬렉션을 매개 변수로 받아서, 데이터를 다 지워버린다.  
>
>|<center>인터페이스</center>|<center>용도</center>
>|:---|:---|
>|Serializable|원격으로 객체를 전송하거나, 파일에 저장할 수 있음을 지정|
>|Cloneable|Object 클래스의 clone() 메소드가 제대로 수행될 수 있음을 지정 즉, 복제가 가능한 객체임을 의미한다.|
>|Iterable<E>|객체가 "foreach" 문장을 사용할 수 있음을 지정|
>|Collection<E>|여러 개의 객체를 하나의 객체에 담아 처리할 때의 메소드 지정|
>|Set<E>|셋 데이터를 처리하는 것과 관련된 메소드 지정|

#
>### HashSet 생성자
>
>|<center>생성자</center>|<center>설명</center>
>|:---|:---|
>|HashSet()|데이터를 저장할 수 있는 16개의 공간과 0.75의 로드 팩터(load factor)를 갖는 객체를 생성한다.|
>|HashSet(Collection<? extends E> c)|매개 변수로 받은 컬렉션 객체의 데이터를 HashSet에 담는다.|
>|HashSet(int initialCapacity)|매개 변수로 받은 개수만큼의 데이터 저장 공간과 0.75의 로드 팩터를 갖는 객체를 생성한다.|
>|HashSet(int initialCapacity, float loadFactor)|첫 매개 변수로 받은 개수만큼의 데이터 저장 공간과 두 번째 매개변수로 받은 만큼의 로드 팩터를 갖는 객체를 생성한다.|
>
>**로드 팩터**는 **(데이터의 개수) / (저장공간)** 을 의미하며, 로드 팩터라는값이 클수록 저장공간이 넉넉해진다.  
>따라서 초기 공간 개수와 로드 팩터는 데이터의 크기를 고려하여 산정하는 것이 좋다.  

#
>### HashSet 주요 메소드
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|boolean|add(E e)|데이터를 추가한다.|
>|void|clear()|모든 데이터를 삭제한다.|
>|Object|clear()|HashSet 객체를 복제한다. 하지만, 담겨 있는 데이터들은 복제하지 않는다.|
>|boolean|contains(Object o)|지정한 객체가 존재하는지를 확인한다.|
>|boolean|isEmpty()|데이터가 있는지 확인한다.|
>|Iterator<E>|iterator()|데이터를 꺼내기 위한 Iterator 객체를 리턴한다.|
>|boolean|remove(Obejct o)|매개 변수로 넘어온 객체를 삭제한다.|
>|int|size()|데이터의 개수를 리턴한다.|
>

#
>### HashSet 사용법
>
>        String [] cars = new String[]{
>            "Tico", "Sonata", "BMW", "Benz",
>            "Lexus", "Mustang", "Grandeure",
>            "The Beetle", "Mini Cooper", "i30",
>            "BMW", "Lexus", "Carnibal", "SM5",
>            "SM7", "SM3", "Tico"
>        };
>
>cars라는 배열에 중복된 데이터 값이 들어가있다.  
>### **HashSet 생성**
>
>        public int getCarKinds(String[] cars){
>            if(cars == null){
>                return 0;
>            }            
>            if(cars.length == 1){
>                return 1;    
>            }       
>            Set<String> carSet = new HashSet<>();
>            for(String car : cars){
>                carSet.add(car);
>            }
>            printCarSet(carSet);
>            return carSet.size();
>        }
>
>HashSet 생성자로 String으로 받는 **객체**를 만들어주고,   
>carSet 객체에 배열로 선언된 **cars 에있는 데이터를 더해준다.**  
>
>### **결과**
>        Carnibal Sonata Mustang BMW Benz i30 SM5 Tico SM3 SM7 Lexus Grandeure The Beetle Mini Cooper
>        14
>
>중복되는 데이터 없이 출력해준다. 이때 **저장된 순서 상관없이** 출력함으로 당황하지마라.  
>

#
>### 번외)
>위에서 출력하는 방식이 for() 방식으로 출력했는데, **객체를 얻는 방식인 iterator**를 사용해도된다.  
>
>        public void printCarSet2(Set<String> carSet){
>            Iterator<String> iterator = carSet.iterator();
>            while(iterator.hasNext()){
>                System.out.print(iterator.next() + " ");
>            }
>        }
>위처럼 반복할 객체 타입으로 iterator를 생성해주면서 반복 객체를 iterator로 넘겨주면된다.  
>그리고 iterator를 사용하면 **hasNext() 메소드를 통해 다음 객체 값이 있는지 확인**후  
>**next() 메소드를 통해 iterator에 있는 값**을 출력해준다.  
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#컬렉션collection---set--queue)

<!---목차 2--->
## **Queue 개념**
>
>Queue에 대해서 설명하기전에 **LinkedList**를 알고있어야한다.    
>LinkedList는 주소를 통해 서로 가르키는 것을 말한다.  
>ArrayList와는 다르게 선을 연결 시켜서 기억하는 방식이다.  
>
>예를들어 A - B - C 로 연결되어있다고 가정하자  
>이 경우는 A는 B 앞에 있고 B는 A 뒤와 C 앞에 있다고 보는 방식이다.    
>
>### ArrayList vs LinkedList
>![1 (1)](https://github.com/Hasegos/Start_JAVA/assets/93961708/22b40f8f-0dd5-4abe-8b35-a47292692c9c)
>
>여기까지 LinkedList를 가볍게 봤다.  
>**LinkedList 자체가 list 이면서 Queue, Deque이다.**  
>이중 **Queue는 FIFO(First In First Out)** 을 사용한다.  
>즉, **먼저 들어온 데이터는 먼저 처리하는 방식이다.**  
>예를들어 사용자의 요청에 응할때 먼저 요청을한 사용자에게 응하는 방식이 정당하다.  
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#컬렉션collection---set--queue)

<!---목차 3--->
## **LinkedList 개념과 사용법**

>### LinkedList 상속관계
>
>        java.lang.Object
>            java.util.AbstractCollection<E>
>                java.util.AbstractList<E>
>                    java.util.AbstractSequentialList<E>
>
>ArrayList 클래스나 Vector 클래스와 상속관계가 비슷하지만, 부모가 **AbstractSequentialList**이다.  
>AbstractList와 AbstractSequentialList의 차이점은 **add(), set(), remove() 메소드 구현내용이 상이하다.**  
>
>|<center>인터페이스</center>|<center>용도</center>
>|:---|:---|
>|Serializable|원격으로 객체를 전송하거나, 파일에 저장할 수 있음을 지정|
>|Cloneable|Object 클래스의 clone() 메소드가 제대로 수행될 수 있음을 지정 즉, 복제가 가능한 객체임을 의미한다.|
>|Iterable<E>|객체가 "foreach" 문장을 사용할 수 있음을 지정|
>|Collection<E>|여러 개의 객체를 하나의 객체에 담아 처리할 때의 메소드 지정|
>|Deque<E>|맨 앞과 맨 뒤의 값을 용이하게 처리하는 큐와 관련된 메소드 지정|
>|List<E>|목록형 데이터를 처리하는 것과 관련된 메소드 지정|
>|Queue<E>|큐를 처리하는 것과 관련된 메소드 지정|

#
>### LinkedList 생성자
>
>|<center>생성자</center>|<center>설명</center>
>|:---|:---|
>|LinkedList()|비어 있는 LinkedList 객체를 생성한다.|
>|LinkedList(Collection<? extends E> c|매개 변수로 받은 컬렉션 객체의 데이터를 LinkedList에 담는다.|

#
>### LinkedList 주요 메소드
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|void|addFirst(Object)|LinkedList 객체의 가장 앞에 데이터를 추가한다.|
>|boolean|offerFirst(Object)|LinkedList 객체의 가장 앞에 데이터를 추가한다.|
>|void|push(Object)|LinkedList 객체의 가장 앞에 데이터를 추가한다.|
>|boolean|add(Object)|LinkedList 객체의 가장 뒤에 데이터를 추가한다.|
>|void|addLast(Object)|LinkedList 객체의 가장 뒤에 데이터를 추가한다.|
>|boolean|offer(Object)|LinkedList 객체의 가장 뒤에 데이터를 추가한다.|
>|boolean|offerLast(Object)|LinkedList 객체의 가장 뒤에 데이터를 추가한다.|
>|void|add(int, Object)|LinkedList 객체의 특정 위치에 데이터를 추가한다.|
>|Object|set(int, Object)|LinkedList 객체의 특정 위치에 있는 데이터를 수정한다. 그리고, 기존에 있던 데이터를 리턴한다.|
>|boolean|addAll(collection)|매개 변수로 넘긴 컬렉션의 데이터를 추가한다.|
>|boolean|addAll(int, collection)|매개 변수로 넘긴 컬렉션의 데이터를 지정된 위치에 추가한다.|
>

#
>### LinkedList 주요 메소드 사용
>        public void checkLinkedList1(){
>            LinkedList<String> link = new LinkedList<>();
>            link.add("A");        
>            link.addFirst("B");
>            System.out.println(link);        
>            link.offerFirst("C");
>            System.out.println(link);        
>            link.addLast("D");
>            System.out.println(link);        
>            link.offer("E");
>            System.out.println(link);        
>            link.offerLast("F");
>            System.out.println(link);        
>            link.push("G");
>            System.out.println(link);        
>            link.add(0,"H");
>            System.out.println(link);               
>            System.out.println("EX = " + link.set(0, "I"));
>            System.out.println(link);
>        }
>
>### **결과**
>        [B, A]
>        [C, B, A]
>        [C, B, A, D]
>        [C, B, A, D, E]
>        [C, B, A, D, E, F]
>        [G, C, B, A, D, E, F]
>        [H, G, C, B, A, D, E, F]
>        EX=H
>        [I, G, C, B, A, D, E, F]
>
>이중에서 대표적으로 자주 사용하는 메소드는 **맨 앞추가 addFirst(), 맨 뒤추가 add() / addLast()** 이다.  
>참고로 혼용해서 사용하면 이해가 힘들기 떄문에 **한가지로 사용**하는게 좋다.  
>

#
>### LinkedList 특정 위치 데이터 꺼내기
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|Object|getFirst()|LinkedList 객체의 맨 앞에 있는 데이터를 리턴한다.|
>|Object|peekFirst()|LinkedList 객체의 맨 앞에 있는 데이터를 리턴한다.|
>|Object|peek()|LinkedList 객체의 맨 앞에 있는 데이터를 리턴한다.|
>|Object|element()|LinkedList 객체의 맨 앞에 있는 데이터를 리턴한다.|
>|Object|getLast()|LinkedList 객체의 맨 뒤에 데이터를 리턴한다.|
>|Object|peekLast()|LinkedList 객체의 맨 뒤에 데이터를 리턴한다.|
>|Object|get(int)|LinkedList 객체의 지정한 위치에 있는 데이터를 리턴한다.|
>
>
>Last가 붙지않으면 맨 앞의 데이터를 가져온다고 생각하면된다.    
>맨 앞 데이터를 가져오는 메소드는 내부적으로 getFirst()메소드를 호출함으로 이걸 사용하는게 좋다.  

#
>### LinkedList 객체가 포함 되어있는지 확인
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|boolean|contains(Object)|매개 변수로 넘긴 데이터가 있을 경우 true를 리턴한다.|
>|int|indexOf(Object)|매개 변수로 넘긴 데이터의 위치를 앞에서부터 검색하여 리턴한다. 없을 경우 -1을 리턴한다.|
>|int|lastIndexOf(Object)|매개 변수로 넘긴 데이터의 위치를 끝에서부터 검색하여 리턴한다. 없을 경우 -1을 리턴한다.|

#
>### LinkedList 데이터 삭제
>
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|Object|remove()|LinkedList 객체의 가장 앞에 있는 데이터를 삭제하고 리턴한다.|
>|Object|removeFirst()|LinkedList 객체의 가장 앞에 있는 데이터를 삭제하고 리턴한다.|
>|Object|poll()|LinkedList 객체의 가장 앞에 있는 데이터를 삭제하고 리턴한다.|
>|Object|pollFirst()|LinkedList 객체의 가장 앞에 있는 데이터를 삭제하고 리턴한다.|
>|Object|pop()|LinkedList 객체의 가장 앞에 있는 데이터를 삭제하고 리턴한다.|
>|Object|pollLast()|LinkedList 객체의 가장 끝에 있는 데이터를 삭제하고 리턴한다.|
>|Object|removeLast()|LinkedList 객체의 가장 끝에 있는 데이터를 삭제하고 리턴한다.|
>|Object|remove(int)|매개 변수에 지정된 위치에 있는 데이터를 삭제하고 리턴한다.|
>|Object|remove(Object)|매개 변수로 넘겨진 객체와 동일한 데이터 중 앞에서 부터 가장 처음에 발견된 데이터를 삭제한다.|
>|Object|removeFirstOccurrence(Object)|매개 변수로 넘겨진 객체와 동일한 데이터 중 앞에서 부터 가장 처음에 발견된 데이터를 삭제한다.|
>|Object|removeLastOccurrence(Object)|매개 변수로 넘겨진 객체와 동일한 데이터 중 끝에서부터 가장 처음에 발견된 데이터를 삭제한다.|
>
>맨 앞에 있는 데이터를 삭제하는 removeFirst() 메소드가 내부적으로 호출된다.  
>반면 맨 뒤에 있는 데이터 삭제는 removeLast() 메소드가 내부적으로 호출된다.  
>따라서 혼동을 피할려면 remove가 붙는 메소드를 사용하자.  

#
>### Iterator 객체
>|<center>리턴타입</center>|<center>메소드 이름 및 매개변수</center>|<center>설명</center>
>|:---|:---|---|
>|ListIterator|listIterator(int)|매개 변수에 지정된 위치부터의 데이터를 검색하기 위한 ListIterator 객체를 리턴한다.|
>|Iterator|descendingIterator()|LinkedList의 데이터를 끝에서부터 검색하기 위한 Iterator 객체를 리턴한다.|
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#컬렉션collection---set--queue)   