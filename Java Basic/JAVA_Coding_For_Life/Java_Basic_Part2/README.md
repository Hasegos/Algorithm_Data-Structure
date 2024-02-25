# Java Basic Part 2

* [생활코딩 - 쉽게 배우는 자바 이동](https://github.com/Hasegos/backendStudy/tree/master/Java%20Basic/JAVA_Coding_For_Life)

* 목차
    * [1. Java 제어문(Java control statement)](#java-제어문java-control-statement)
    * [2. Java 메소드(Java Method)](#java-메소드java-method)
    * [3. Java 객체지향 프로그래밍(JAVA OOP)](#java-객체지향-프로그래밍java-oop)
    * [4. Java 상속(Java Inheritance)](#java-상속java-inheritance)
    * [5. Java 인터페이스(Java Interface)](#java-인터페이스java-interface)
    * [6. Java 예외(Java Exception)](#java-예외java-exception)
    
## Java 제어문(Java control statement)
>### **비교 연산자**
>    ```java
>        System.out.println(1 > 1);  
>        System.out.println(1 == 1); 
>        System.out.println(1 < 1);
>        System.out.println(1 >= 1);
>    ```   
>위와 같이 **크다, 크거나 같다, 작다, 작거나 같다, 같다** 이 5가지 비교연산자가 있다.  
>ex)  >,&ensp;&ensp;   >=,&ensp;&ensp;    <,&ensp;&ensp;     <=   &ensp;&ensp; ==  
>이런식으로 5가지가 있으며, 그 조건이 **맞다면 true 틀리다면 false** 이다.   

#
>### **논리 연산자**
>언어의 기본적인 논리 연산자가 존재한다.  
>총 3가지로 (OR , AND , NOT) 존재한다.   
>아래에 3가지 경우를 살펴보자.  
>```java
>      일반적으로 두개를 비교할 때, 4가지 경우가 존재한다.  
>                
>                A 가 참, B 가 참
>
>                A 가 참, B 가 거짓
>
>                A 가 거짓, B 가 참    
>
>                A 가 거짓, B 가 거짓
>
>       OR인 경우
>
>              첫 번째 true  
>
>              두 번째 true  
>
>              세 번째 true
>
>              네 번째 false  
>                              
>        위와 같은 결과에서 둘중 하나만 참이여도 참인 결과를 볼 수 있다.
>
>
>       AND인 경우
>
>              첫 번째 true  
>
>              두 번째 false  
>
>              세 번째 false
>
>              네 번째 false  
>                              
>        위와 같은 결과에서 둘다 참이여도 참인 결과를 볼 수 있다.
>
>
>
>       NOT인 경우
>            
>             A가 false   
>
>             결과 true
>
>             A가 true
>
>             결과 false
>```                              
>        위와 같은 결과에서 참이면 거짓으로, 거짓이면 참으로라는 결과를 볼 수 있다..

#
>### **if 제어문** : 두 대상 비교
>기본적으로 if 제어문을 사용하는 이유는 두 대상을 비교를 위해서 사용을 한다  
> 예시 1.  
>    ```java
>       if(false){
>           System.out.println(1);    
>       }
>       else if(true){
>           System.out.println(2);    
>       }
>       else{
>           System.out.println(3);        
>       }
>    ```
>### if 제어문 조건 
> 위에 예제 처럼 if(조건)형태로 사용하는데, 조건에는 무조건 **boolean** 타입이여야한다.  
> 첫 줄 코드를 보면 **false(거짓)** 으로 실행이안된다.  
> boolean 타입에는 **false or true** 이 두가지 밖에 없으므로 _false일땐 실행이 안되고, true 일땐 실행이 된다._  
>### if 제어문 구조
>if, else if , else 이순으로 진행이 되며,  
> 1. if() - 첫번째
> 2. else if() - 두번 째 ~ 마지막 전
> 3. else() - 마지막
>
>만약 딱 **두가지 경우밖에 없으면 else if 문은 생략**된다.  
>
>### 두문자열 비교
>    ```java  
>        String id = "egoing";
>        String inpuId = name;
>        
>        String pass = "1111";
>        String inputPass = "1111";        
>        
>        if(inputId == id){} 
>        if(inpuId.equals(id)){
>            if(inputPass.equals(pass)){
>               System.out.println("Master!");    
>            }
>            else{
>                System.out.println("Wrong Password!");    
>            }
>        }
>        else{
>            System.out.println("Who are you?");
>        }
>    ```
>두 개를 비교할 때는 **== / equals("내용")**  전자 아니면 후자를 쓰는데, 차이가 있다.  
>### **전자 일 경우**  
>단순히 **원초적인 타입(Primitive Type)** 일때 사용한다.  
>ex) int, String, char, float, double, boolean, short 등..  
>```java 
>                         code            name                value
>    
>        int p1 = 1                        p1    ------>       1 
>
>
>              p1 == p2 : p1 과 p2가 같은 곳을 가르키냐 (true)
>
>            
>        int p2 = 1                        p2     -----------  ↑               
>                                (p1 과 p2는 같은 1를 가짐)                                              
>```        
>이유 : 같은 값을 가지는 주소에 새로운 변수를 생성해도 똑같이 거친다.  
>
>### **후자 일 경우**  
>원초적인 타입을 제외한 타입일때 사용한다.  
>```java
>        String o1 = new String("Java") ------>   "Java"
>
>                o1 == o2(false)
>
>        String o2 = new String("Java") ------>   "Java"
>```
>위와 같이 **서로다른곳의 주소를 가지는 변수끼리 비교** 할때 사용한다.  
>```java
>        String o3 = "java2"    --------------------->       "java2"
>
>        o3 == o4 (true)
>
>        String o4 = "java2"    -----------------------------   ↑         
>```
>equals() : **주소 여부 상관없이 내용 자체를 비교**하기때문에 문자열 비교시에 사용한다.  
>
>### 다양한 비교 경우
>```java
>        boolean isRightPass = inputPass.equals(pass) || inputPass.equals(pass2);      
>        
>        if(inpuId.equals(id) && isRightPass){            
>            System.out.println("Master!");    
>            }                    
>        else{
>            System.out.println("Who are you?");
>        }       
>```
>위와 같이 **boolean타입에 비교문의 결과를 저장**해놓고 그 **변수를 이용해서 다른 것과 비교**하는 무궁무진한 경우가 있다.  

#
>### 반복문
>
>어떠한 행위를 반복적으로 할때 주로 사용한다.  
>반복문에는 for문과 while문이 있으며 밑에 예제를 보자.  
>
>### while() 구조
>```java
>        int i = 0;
>        
>        // ...
>        while(i < 3){
>            System.out.println(2);
>            System.out.println(3);            
>            // ...
>            i++;
>        }
>```
>위와 같이 while()에는 **while(조건){반복 내용};** 의 구조를 갖는다.  
>while()을 사용할 경우 카운트를 할 변수를 따로 외부에 선언해야함으로 코드가 길어지면 **가독성이 떨어진다.**  
>
>### for() 구조
>```java
>        for(int j = 0; j < 3; j++){
>            System.out.println(2);
>            System.out.println(3);
>        }
>```
>위와 같이 for()에는 **for(변수 선언; 범위; 계산방식){반복 내용}; 의 구조** 를 갖는다.  
>for()를 사용할 경우 **변수 선언을 내부에서 함으로 헷갈릴 일이 없고 범위까지 확실히 갖기**에 보기편하다.  

#
>### Array(배열) 구조
>```java
>        String[] users = new String[3];
>        users[0] = "egoing";
>        users[1] = "jinhuck";
>        users[2] = "youbin";
>```
>### Array(배열) 선언과 참조 변수만 선언
>```java
>        String[] users;
>        String users[];
>```
>위와 같은 구조이며 참조할 변수만 선언하기 때문에 안에 **쓰레기값(garbage)가 들어가 있으므로 초기화**를 해야한다.  
>
>### Array(배열) 선언과 동시에 할당
>**배열타입[배열공간] 변수 = new 배열타입[배열공간 수];**  
>위와 같은 구조이며 **String 타입에 배열 공간 3칸을 users 변수에 선언과 동시에 할당했다.**  
>그후에 users의 3칸중 첫번째(0)에 해당하는 공간에 _egoing 이라는 문자열을 할당했다._  
>다른 것들도 마찬가지의 방법으로 할당했다.  
>
>### Array(배열)의 길이
>```java
>        System.out.println(users.length);
>```
>위와 같은 **.length 를 통해 배열의 공간이 얼마나 할당되었는지 확인**할 수 있다.   
>
>
>### Array(배열)의 for()
>```java
>         for(int i = 0; i < users.length; i++){
>            System.out.println("<li>"+users[i]+"</li>");
>        }
>```
>위 코드와 같이 배열의 전체 길이를 활용해서 배열 공간에 할당된 것들을 확인할 수 있다.  
>
>
>### 2차원 Array(배열)의 구조
>```java
>         String[][] users = {
>            {"egoing", "1111"},
>            {"jinhuck", "2222"},
>            {"youbin", "3333"}
>         };
>```
>우리가 흔히 **배열 공간을 선언과 초기화를 하는건 1차원**에서 하는것이다.  
>```java
>        user[3]   --------->      users[1]     users[2]      users[3]  
>```
>이런식으로 공간을 갖는다. 반면 2차원은 밑에와 같다.  
>```java
>        user[2][2] --------->     users[0][0]   users[0][1]  
>
>                                  users[1][0]   users[1][1]   
>```
>이런식으로 공간을 갖으며 쉽게 생각하면 1차원은 **x축**만 있는것이며, 2차원은 **x축과 y축이 곱해진 형태**이다.  
>
>### 2차원 Array(배열)의 활용
>```java
>        for(int i = 0; i < users.length; i++){
>            String[] current = users[i];
>            if(current[0].equals(inputId) && 
>               current[1].equals(inputPass)){
>                
>                isLogined = true;      
>                break;
>            }           
>        }
>```
>위 코드에서 밑에 변수를 활용하는데         
>```java            
>            {"egoing", "1111"},
>            {"jinhuck", "2222"},
>            {"youbin", "3333"} 
>```
>users[i]를 반복해서 배열을 만들면 **전체가 다들어가는데**,    
>그중 첫번째(0) 에 해당되는 **egoing,jinhuck,youbin를 current[0]에 넣는다.**    
>이런 2차원 배열을 통해서 비교문을 만들수 있으며, 다양하게 활용 된다.    
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-2)

## Java 메소드(Java Method)
>
>### Java class 기본 구조
>```java
>               class
>                 ↓              
>               method
>               
>               vaiable
>               
>        object oriented programming                   
>```
>class 안에 **변수와 메소드를 포함**하고 있다.  

#
>### Method(메소드)의 종류
>
>메소드에는 두가지 종류가 있다. Java에서 제공해주는 메소드와 개발자가 직접만드는 메소드가 있다.  
>### **전자 일 경우**  
>```java
>         System.out.println("Hello Method");
>         System.out.println(Math.floor(1.1));
>```
>Math라는 수학관련 함수를 java에서 제공해주기에 각종 기능을 사용할 수 있다.  
>Java에서 제공해주는 메소드를 알고싶으면 밑의 링크로 들어가면된다.  
> [Java API 문서 사이트][gdh]   
>
>[gdh]: https://docs.oracle.com/javase/8/docs/api/  
>### **후자 일 경우**  
>```java         
>            public static void main(String[] args) throws IOException {      
>                System.out.println(twoTimes("a","-"));         
>            }  
>   
>            public static String twoTimes(String text,String delimiter){
>                String out = "";
>                out += delimiter +"\n";
>                out += text +"\n";        
>                return out;
>            }
>```

#
>### Method(메소드)의 구조
>```java
>        public static String twoTimes(String text,String delimiter){
>                String out = "";
>                out += delimiter +"\n";
>                out += text +"\n";
>        
>                return out;
>            }
>
>
>        위와 같이 반환의 타입  메소드 이름(파라미터){
>                    내용
>                     .
>                     .
>                     .  
>                     .
>                return 반환값;
>            }
>```
>형식으로 이루어진다.여기서 **파라미터(parameter)는 매개변수로 값**을 입력받고 사용한다.  
>**retrun을 통해 특정값을 반환**해주며, 반환의 타입을 void를 사용할 시, return 을 사용하면안된다.  
>**반환값이 없다는 의미로 void**를 사용한다.  
>
>
>### **void 예시 코드**
>```java     
>        public static void printTwoTimesA(){
>           System.out.println("-"); 
>           System.out.println("A");
>           System.out.println("A");
>        }
>```
>
>### **반환 예시 코드**
>```java
>        1번쨰
>         public static String a(){
>            // ...
>            return "a";          
>         }  
>
>        2번째    
>        public static int one(){       
>            return 1;          
>         // ...
>        }
>```
>1번째의 경우일 때는 내용이 다 실행되고 반환 값 문자 a를 반환한다.  
>2번째의 경우일 때는 반환값 숫자 1를 반환하고 그뒤에 내용은 실행되지않는다.  

#
>### Method(메소드)사용한 형식
>```java     
>                             공급가액
>        public static  double valueOfSupply = 10000.0;;
>                            부가가치세율
>        public static  double vatRate = 0.1;
>    
>        public static void main(String[] args) {                 
>            
>            double vat = getVAT();            
>            double total = getTotal();
>        
>            System.out.println("Value of supply : " + valueOfSupply);
>            System.out.println("VAT : " + getVAT());
>            System.out.println("Total of supply : " + getTotal());
>        
>            }
>                      부가세 Method  
>            public static double getVAT(){
>                 return valueOfSupply * vatRate;
>            }
>                       합계 Method
>            public static double getTotal(){
>                return valueOfSupply + getVAT();
>            }
>        }
>```
>### Static Method(메소드)
>```java
>        public static void main(String[] args) {        
>        
>                Print.a("-");
>                Print.b("-");               
>                
>                Print t1 = new Print();
>                t1.delimiter = "-";
>                t1.a();
>                t1.b();
>                Print.c("$");
>
>                Print.a("*");
>                Print.b("*");
>
>                Print t2 = new Print();
>                t2.delimiter = "*";
>                t2.a();
>                t2.b();
>            }    
>        }
>        class Print{
>        
>            public String delimiter;
>    
>            public void a(){
>                System.out.println(this.delimiter);
>                System.out.println("a");
>                System.out.println("a");
>            }
>             public void b(){
>                 System.out.println(this.delimiter);
>                System.out.println("b");
>                System.out.println("b");
>            }
>
>            public static void c(String delimiter){
>                System.out.println(delimiter);
>                System.out.println("a");
>                System.out.println("a");
>            }
>        }
>```
>위에서 **static 이라는것은 class 기반 소속이다** 라는걸 의미한다.  
>**java에서는 누구의 소속이냐에따라 코드가 많이 변함으로 누구 소속인지 확실하게 구분**해야한다.  
>그래서 static 과 instance를 사용한다.  
>**instance는 static과 반대로 no-class class기반 소속이 아니다.**  
>
>### static 호출 예제)
>
>```java
>pulic static void main(String[] args) {                
>    Print.c("$");
>    }    
>}
>class Print{        
>    public String delimiter;
>    public static void c(String delimiter){
>        System.out.println(delimiter);
>        System.out.println("a");
>        System.out.println("a");
>    }
>}
>```
>위 코드에서 Print라는 클래스의 c 라는 static method를 main에서 호출하기위해서는  
>**해당클래스.해당메소드 형식**(Print.c("파라미터")) 으로 호출한다.  
>
>### instance 호출 예제)
>```java
>        public static void main(String[] args) {
>                
>                Print t1 = new Print();
>                t1.delimiter = "-";
>                t1.a();
>                t1.b();                
>
>                Print t2 = new Print();
>                t2.delimiter = "*";
>                t2.a();
>                t2.b();
>            }    
>        }
>
>        class Print{
>        
>            public String delimiter;
>    
>            public void a(){
>                System.out.println(this.delimiter);
>                System.out.println("a");
>                System.out.println("a");
>            }
>             public void b(){
>                 System.out.println(this.delimiter);
>                System.out.println("b");
>                System.out.println("b");
>            }
>            
>        }
>```
>위 코드에서 클래스 기반이아닌 Print 클래스에 있는 a 와 b 메소드를 호출시키기 위해서는    
>해당 클래스를 instance화를 시킨후 호출해야한다.    
>### instance 구조
>```java
>         Print t1 = new Print();
>         t1.delimiter = "-";
>         t1.a();
>         t1.b();                
>```
>**해당 클래스 변수 = new 해당 클래스();** 인 구조로 사용되며,  
>**원초적인 타입(Primitive Type)을 변수 선언 동시에 초기화** 하는 것과 구조가 같다.   
>메소드나 변수를 호출하는 과정은 **static기반 메소드나 변수를 호출하는 구조**와 같으며,  
>**단순히 클래스 자리에 instance화 변수**가 들어갈 뿐이다.  
>★★★★★추가로 클래스를 **instance화 시킨후 static 기반 메소드나 변수를 손대면,  
>instance는 참조하는 형식이라서 전체가 영향**이 가서 주의해야한다.  

#
>### 간단한 Access Modifier(접근 제어자)
>```java
>         public, protected, default, private
>```        
>        private : 같은 클래스 내부에서만 사용 가능              
>이 4개의 존재가 한다는 것만 알고가자.  
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-2)

## Java 객체지향 프로그래밍(JAVA OOP)
>### 프로그램 구조
>```java
>                method    
>                funtion
>               subroutine
>               procedural 
>               
>              procedural programming
>
>        
>        method를 통해서 큰 프로그램을 만든다.
>        
>                  class 
>               ____________  
>               |          |
>               |  method  |
>               | variable | 
>               |__________|
>```
>### class Instance개념
>```java
>        냉장고
>        
>       instance
>        
>        
>        냉장고             <----------          냉장고(원형)
>               
>       instance                                  class   
>        
>        
>        냉장고
>
>       instance
>```
>### Instance and this 키워드, constructor
>```java                 
>        public  String delimiter;    
>    
>        public Print(String delimiter){
>            this.delimiter = delimiter;
>        }
>        public void A(){
>            System.out.println(this.delimiter);
>            System.out.println("A");
>            System.out.println("A");
>        }
>        public void B(){
>            System.out.println(this.delimiter);
>            System.out.println("B");
>            System.out.println("B");
>        }   
>```
>위 코드에서 **사용자가 인스턴스화를 기본적인 값을 넣어야 실행 된다고 가정**할때,  
>함수를 호출할때 **같은 함수 이름과 파라미터값과 순서, 갯수 등 맞을 때  
>호출 되는 성질을 이용하여 "생성자"를 활용해서 미리 지정**해준다면,   
>**사용자가 실수할 확률을 낮출 수 있다.**  
>        
>**생성자** : 초기에 주입해야할 값을 지정할때 사용한다.    
>**this** : 우리가 생성한 인스턴스를 가르킨다.  
>### 다양한 OOP 구조 
>```java        
>        System.out.println(Math.PI);
>        System.out.println(Math.floor(1.8));
>        System.out.println(Math.ceil(1.8));        
>        
>        FileWriter f1 = new FileWriter("data.txt");
>        f1.write("Hello");
>        f1.write(" JAVA");        
>        
>        FileWriter f2 = new FileWriter("data2.txt");
>        f2.write("Hello");
>        f2.write(" JAVA");
>        f2.close();
>        
>        f1.write("!!!");
>        f1.close();
>```
>**class 소속 :  System, Math, FileWriter**  
>**instance 소속: f1, f2**  
>
>Math는 바로 사용함 (_일회용 작업_ ) -> **클래스에 있는 걸 그대로 사용함**  
>f1에 class FileWriter이라는 복제본을 data.txt 형식으로 저장  
>(_일회용 작업용_ 이 아님) -> **긴 맥락을 가지고 작업해되면 클래스를 복제해서 사용함.**  
>
>**instance vs class** : 긴 맥락을 가지고 작업하냐 안하냐 차이  
>
>위 코드를 통해 만들어진 파일  
>```java
>        Hello JAVA <---- data.txt
>
>        Hello JAVA <---- data2.txt
>```
>### OOP를 사용한 예제
>```java
>        class Accounting{    
>            public  double valueOfSupply;    
>            public static  double vatRate = 0.1;
>
>            public Accounting(double valueOfSupply){
>                this.valueOfSupply = valueOfSupply;
>            }
>
>            public double getVAT(){
>                 return valueOfSupply * vatRate;
>            }
>
>            public double getTotal(){
>                return valueOfSupply + getVAT();
>            }
>        }
>
>        public class AccountingApp {     
>   
>         public static void main(String[] args) {
>
>             Accounting a1 = new Accounting(10000.0);         
>             Accounting a2 = new Accounting(20000.0);        
>
>             System.out.println("Value of supply : " + a1.valueOfSupply);
>             System.out.println("Value of supply : " + a2.valueOfSupply);
>
>             System.out.println("VAT : " + a1.getVAT());
>             System.out.println("VAT : " + a2.getVAT());
>
>             System.out.println("Total of supply : " + a1.getTotal());
>             System.out.println("Total of supply : " + a2.getTotal());      
>         }
>        }
>```
>instance(인스턴스)를 사용하는 경우 : **클래스의 상태가 계속해서 바꿔야 할떄**  
>추가로 직접적으로 변수를 사용안할시, static을 지워버릴 필요가 없다.  
>**instance(인스턴스)를 써도 class 기반 변수를 바꿀 수 있지만,  
>바꿀 시, 다른 instance(인스턴스) 변수에 영향이가서 안쓴다.(덮어쓰기가된다.)**  
>
>**각instance(인스턴스)에 공통된 요소는 class기반으로 두고, 그외 부분은 instance로 해결한다.**  
>
>### instance vs class project(비교 프로젝트)
>```java
>        class Foo{    
>            public static String classVar = "I class var";    
>            public String instanceVar = "I instance var";
>    
>            public static void classMethod(){
>                System.out.println(classVar); // Ok
>                // System.out.println(instanceVar); // Error
>            }
>            public void instanceMethod(){
>                System.out.println(classVar); // Ok
>                System.out.println(instanceVar); // Ok
>            }
>    
>        }
>        public class StaticApp {
>  
>            public static void main(String[] args) {
>        
>                System.out.println(Foo.classVar); // OK        
>                Foo.classMethod(); // OK    
>        
>                Foo f1 = new Foo();
>                Foo f2 = new Foo();
>        
>                System.out.println(f1.classVar); // I class var
>                System.out.println(f1.instanceVar); // I instanceVar
>        
>                f1.classVar = "change by f1";
>                System.out.println(Foo.classVar); // 원형
>                System.out.println(f2.classVar); // 복제한 f2  
>        
>                f1.instanceVar = "change by f1";
>                System.out.println(f1.instanceVar); // change by f1
>                System.out.println(f2.instanceVar); // I instance var
>            }        
>        }
>```
> **각 class와 instance규칙**
>
>    1. **클래스 기반에 소속되어 있지않은 변수는 불러올 수 있다.**
>    2. 클래스 기반 메소드에서는 **인스턴스 변수를 가져올 수 없다.** 
>    3. 인스턴스 기반메소드에서는 **클래스 변수와 인스턴스 변수를 가져올 수 있다.**    
>    4. 클래스에 있는 인스턴스 메소드를 **클래스 기반으로 불러올 수 없다.**
>    5. 인스턴스를 했을 시, 클래스 기반 메소드,함수는 **참조할 뿐이다.**
>    6. 인스턴스를 했을 시, 인스턴스 값을 바꾼다고해서 **class 기본 값이 변하지는 않는다.**
>    7. class 원형을 바꿀 시, **인스턴스가 가르키는 static도 변한다.**
>
>
>결론 :**같은 인스턴스화 시킨 변수들 끼리는 static(클래스 기반)을 참조**하기때문에  
>서로 영향을 미치지만, **instance(인스턴스 기반)은 변수 값을 바꿔도 서로 영향**을 안미친다.  
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-2)

## Java 상속(Java Inheritance)
>
>Inheritance(상속)이란 : **부모클래스를 상속받은 자식클래스는 부모클래스의 맴버**를 그대로 쓸 수 있다.  
>
>#### Java 상속 구조
>```java
>        class Cal3 extends Cal{
>               내용
>                .
>                .
>                .
>                .
>         }
>```    
>위와같은 코드에서 Cal3 class(자식 클래스)는 Cal class(부모 클래스)로 부터 상속을 받고   
>**부모 클래스에 정의된 메소드나 변수를 재정의** 해서 사용할 수 있다.  
>추가적으로 **부모 클래스에 생성자가 정의 되어있으면,  
>자식클래스는 부모 생성자를 실행 시키도록 강제한다**.(super 키워드가 없어도)  
>**super() 사용함으로 써 부모 클래스의 생성자 사용**  
>### Java 상속 예제
>```java
>        Cal 클래스    
>        
>     public class Cal {    
>          public int sum(int v1,int v2){
>          return v1 + v2;
>         }
>
>        // OverLoading
>        public int sum(int v1,int v2,int v3){
>            return this.sum(v1,v2) + v3;
>        }
>    
>        int v1,v2;
>        Cal(int v1,int v2){
>            System.out.println("Cal init!!");
>            this.v1 = v1;
>            this.v2 = v2;
>        }
>        public int sum(){ return this.v1 + this.v2;}
>     }
>
>
>         Cal3 클래스   
>
>     public class Cal3 extends Cal{
>    
>        public int minus(int v1, int v2){
>            return v1 - v2;
>        }
>        // Overriding
>        public int sum(int v1,int v2){
>            System.out.println("Cal3!");
>            return super.sum(v1,v2);
>        }
>        // OverLoading
>        public int sum(int v1,int v2,int v3){
>            return v1 + v2 + v3;
>        }
>    
>        Cal3(int v1,int v2){
>            super(v1,v2);
>            System.out.println("Cal3 init!!");
>        }
>        public int minus(){return this.v1 - this.v2;}
>      }
>```
>여기서 Cal3 클래스는 Cal 클래스를 상속 받기때문에 Cal 클래스에 있는 sum() 메소드를 재정의하고 있다.      
>부모가 갖고 있는 기능 이외에 추가할 수 있다.  
>클래스내에 같은 메소드를 과적(메소드 이름 똑같이) 할 수 있다.(형태만 다르면)          
>**this** : 같은 클래스 내에 해당 메소드  
>**super** : 부모 클래스 내에 해당 메소드  
>
>추가적으로 Polymorphism(다형성) : 자식클래스를 부모클래스로 동작하게끔한다.  
>
>### Java 상속 오버라이딩(Overriding) vs 오버로딩(OverLoading)
>        
>**오버라이딩(Overriding)** 이란 : 부모(클래스)가 갖고 있는 기능을 재정의 할수 있다.  
>
>**오버로딩(OverLoading)** 이란 : 이름은 같은데 파라미터와 반환 타입 다른걸로 재정의한다.  
>대신, **반환값만 다른걸 사용할 수 없다.**  
>```java
>     public int sum(int v1,int v2){
>          return v1 + v2;
>     }
>        
>        1번째
>       // OverLoading
>     public int sum(int v1,int v2,int v3){
>          return this.sum(v1,v2) + v3;
>     }
>
>        2번째
>       // Overriding
>     public int sum(int v1,int v2){
>         System.out.println("Cal3!");
>         return super.sum(v1,v2);
>     }
>```
>위 코드 1번째는 sum 메소드를 **매개변수를 다르게 사용해서 오버로딩(OverLoading)** 을 하고있다.  
>2번째에서는 sum메소드를 **부모로 부터 상속받아 오버라이딩(Overriding) 즉, 재정의해서 사용**을 하고있다.  
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-2)

## Java 인터페이스(Java Interface)
>
>Interface(인터페이스)란 **무조건적으로 지켜야할 규약을 구현화**를 위해 사용한다.  
>추가로 인터페이스는 시작은 대문자, 형용사로 이름 짓는다  
>
>### Java Interface(인터페이스) 구조
>```java
>        interface Calculable{
>            double PI = 3.14;
>            int sum(int v1, int v2);    
>        }
>```
>위 코드에서 변수와 메소드를 선언을 한다.  
>### Java Interface(인터페이스) 상속
>```java
>        class RealCal implements Calculable,Printable{    
>                public int sum(int v1,int v2){
>                    return v1 + v2;
>                }    
>    
>                public void print(){
>                    System.out.println("This is RealCal!!");
>                }
>        }
>```
>RealCal 클래스는 Calculable 인터페이스를 상속 받았으므로 sum 메소드를 구현화를 무조건적으로 해야한다.  
>**인터페이스에 메소드를 정의할 땐 내용 x, 변수 정의 할 땐 내용 o**  
>자바에서는 **하나의 클래스만 상속** 받을 수 있고, **여러개의 인터페이스를 구현(상속)** 할 수 있다.  
>**변수(double PI = 3.14)는 재정의 할 필요없고**, 그값을 갖을 뿐이다.  
>
>### Java Polymorphism(다형성) 개념
>```java
>        public class FileWriterApp {    
>            public static void main(String[] args){
>                
>                Writer fileWriter = new FileWriter("fileWriter.txt");   
>        
>                fileWriter.write("data 1");
>                fileWriter.write("data 2");
>                fileWriter.write("data 3");        
>        
>                fileWriter.close();       
>            }
>        }
>```
>다형성 : **어떤 객체의 속성이나 기능이 상황에 따라 여러가지 형태**를 가질 수 있는 성질  
>쓰는 이유: 한클래스에서 **수백개의 메소드들중에 해당 클래스의 메소드만** 쓰고 싶을 경우  
>
>**부모클래스 변수 = new 자식 클래스();**  
>        
>즉, **자식 클래스를 복제해서 특정한 부모 클래스를의 메소드만 사용하기위해 부모 클래스 타입만 들어오게끔** 만든것.  
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-2)        

## Java 예외(Java Exception)   
>
>
>
>
>
>
>
>
>
>
>
>
>
>
>
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-2)

