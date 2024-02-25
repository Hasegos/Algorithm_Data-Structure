# Java Basic Part 1

* [생활코딩 - 쉽게 배우는 자바 이동](https://github.com/Hasegos/backendStudy/tree/master/Java%20Basic/JAVA_Coding_For_Life)

* 목차
    * [1. 명령어](#명령어-주의-사항)
    * [2. Complie, Run ,Input](#complie-run-input)
    * [3. 라이브러리 vs 패키지 vs 모듈](#라이브러리-vs-패키지-vs-모듈)
    * [4. 계층적인 구조](#계층적인-구조)
    * [5. 클래스와 패키지 구조](#클래스와-패키지-구조)
    * [6. 상속](#상속instance)
    * [7 .기타(기능의 뜻,용어....)](#기타기능의-뜻용어)

## 명령어 주의 사항

>**명령어 실행전 위치 확인**을 꼭해야한다.  
>현재 자신이 위치 확인은  "**pwd**" (print work directory) 를 사용해서 확인할 수있다.
>위치를 이동 시킬 때는 "**cd**"를 사용해서 이동시키고 주로 터미널(terminal)를 이용한다.
>java를 실행하기 위해서는 환경 변수를 편집한다.
>윈도우 기준 : **내pc -> 속성 -> 고급 시스템 설정 -> 환경 변수 추가 -> Java_Home**을 이용해서
>jdk 폴더를 넣어야한다. 
>리눅스 기준 : echo $path 로 모든 경로 확인후 -> **nano ~/bash_profile -> path 복사후 추가** 한다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)

## Complie, Run, Input
>java 프로그램을 이용안하고도 직접 **Complie,Run,Input** 3가지를 실행 할 수 있다.
>### **Complie** : cmd를 이용해서 java 파일 있는 곳에 이동 후
>
>        1.javac 파일 이름.java 
>        2.java -cp "클래스 경로" 파일 이름.java        
>클래스 경로에 "."는 현재 위치이고 ";" 사용 후 다른 폴더를 추가 할 수 있다.
참고) 윈도우는 ";" &ensp;&ensp; 리눅스는 ":" 이다.

#
>### **Run** : Complie된 java 파일이 있는 곳 이동 후
>
>        1.java 파일 이름 
>        2.java 파일 이름 -cp "클래스 경로" 파일 이름
>
>
>위와 같은 방법을 이용한다.

#
>### **Input** : main(parameter) 있는 파일에 이동 후
>        
>        1.java 파일 이름 "입력값"
>위와 같이 작성하면 되고 추가 할 경우 
>
>        1.java 파일 이름 "입력값" "입력값" ... 
>식으로 작성하면된다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)

## 라이브러리 vs 패키지 vs 모듈
> ### 모듈(module) 
>모듈(module)이란 프로그램을 구성하는 요소로,관련 데이터와 함수를 **하나**로 묶은 단위
>Java로 알아보면 _기본적으로 사용자에게 제공되는 라이브러리_ 를 모듈이라고 한다.

#
>### 패키지(package)
패키지(package)이란 특정 기능과  관련 모듈을 폴더 하나에 넣은 것을 말한다.
Java에서 파일(class)을 폴더에 작성 하는 것처럼 파일(class)는 패키지(package)에 있다.

#
> ### 라이브러리(library)
라이브러리(library)이란 여러 모듈과 패키지를 묶어 놓은 집합
Java에서 폴더 안에 폴더가 있고 그안에 파일(class)가 있는 것을 말한다.

#
> ### 큰 흐름
>라이브러리  -> 패키지 -> 모듈 
>
>                    폴더(floder)
>        패키지                      main.java
>         ↓
>        모듈1.java      ---->      import 모듈1        
>         ↓                
>        모듈2.java        
>         ↓
>        모듈3.java
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)

## 계층적인 구조
>             .
>             .
>             .   
>         Java Program
>             
>              API        or      User Interface
>        
>                     Java Program
>            Date  ->  PrintWriter -> System  
>
>                    기본 라이브러리
>           System    Date    Math    PrintWriter  
>
>                        JAVA
>
>                         OS
>
>                      Computer
>
>
>여기서**API(Aplication Programming Interface)** 이란 
>_정의 및 프로토콜 집합_ 을 사용하여 두 소프트웨어 구성 요소가 **서로 통신할 수 있게 하는 메커니즘**
>추가적으로 이런 형태를 가진 _자바(java)_ 는 **객체 지향 프로그램(object-oriented-programming)** 이다.
>줄여서 **OOP** 형태라고 한다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)

## 클래스와 패키지 구조
>클래스(class)이란 **비슷하거나 동일한 행위를 수행하는 객체(object)의 집합**
>
>       
>        Package  
>          
>           ↓ 
>
>         class 1  
>
>        
>         class 2     
>위와 같이 _한 패키지안에 클래스가 **여러개 존재** 할 수 있는 형태의 구조_ 로 지니고 있다.
>추가적으로 클래스(class)라는 곳에는 **변수(variable)와 메소드(method)** 로 이루어져 있다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)

## 상속(Instance)
>상속(instance)이란 하나의 클래스(class)를 복제해서 **서로다른 데이터의 값과 서로 같은 메소드를 가진 복제본 제작** 으로 생각하면된다.
>추가적으로 기존의 클래스에 _기능을 추가하거나 재정의하여 새로운 클래스를 정의_ 할 수 있다.
>아래 코드를 이용해서 알아보겠다.
>
><code>PrintWriter p1 = new PrintWriter("result1");</code>
><code>p1.toString();</code>
><code>p1.wirte("Hello World");</code>
>
>            class Object       ←----------|
>                                          |                                       
>                 ↓                        |
>                                          |    
>           method toString()              | 
>                                          |                                                           
>                                          |
>        class Writer extends Object ←-----|
>                                          | 
>                  ↓                       |
>                                          | 
>             method wirte                 |  
>                                          |             
>                                          | 
>        class PrintWriter extends Writer  | 
>                                          |     
>                    ↓                     |  
>                                          |     
>               method write    -----------|
>위와 같은 코드를 사용시,
_PrintWriter 클래스(class)는 Writer 클래스(class)를 상속받고 Writer는 object 클래스(class)에 상속받은 형태_ 로 만들어지고
PrintWriter p1 = new PrintWriter("result1");
p1이라는 변수는 **PrintWriter를 객체로 만든 것**을 **PrintWriter타입** 으로 만들어진다.
>p1.toString() : p1은 메소드들 중에 toString이라는 메소드를 object 클래스에서 찾아서 사용한다.
p1.write() : 이부분에서 Writer 이랑 PrintWriter 둘다 가지고 있는 메소드 경우에는 **부모 것을 덮어쓰기** 를 한다. 
이를 **lock(오버라이딩)** 이라고 한다.
>
>
>### 상속(instance)의 큰틀
>           자식 클래스
>
>              ↓
>
>           부모 클래스                           
>                            
>              ↓
>
>           상속된 맴버  
>
>              
>          추가 되는 맴버
>
>
>위와 같은 구조로 되어있으며, _부모 클래스 안에 상속된 맴버를 자식 클래스가 사용할 수 있다._
추가적으로 **자식 클래스에 맴버를 추가**해서 사용이 가능하다.

#
>### 모든 클래스의 상속 틀
>             Object
> 
>               ↓
>
>           부모 클래스(class) (method)    <------------ 덮어쓰기(Override)                       
>                   <-extends                          |  
>               ↓                                      |  
>                                                      |  
>        package                                       | 
>                                                      |    
>            자식 클래스(class) -> (object, variable, method)
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)

## 기타(기능의 뜻,용어....)
>### 사이트 팁
>Launch4j&ensp; : &ensp;jdk을 안깔아도 사용이 가능한 사이트
>
>지식관계도(map) : <a href="https://seomal.org/" target="_blank">https://seomal.org/</a>

#
>### 용어
>**메소드(Method)**&ensp; : &ensp;서로 연관된 코드를 그룹핑해서 이름을 붙인 정리정돈의 상자의 개념
>
>**필드(Field)**&ensp; : &ensp;전역 변수(class 전체 내에서 사용가능)

#
>### 객체 관련 팁
>객체를 배열로 만들시, 배열 만든후 각 배열 공간에 해당 객체를 생성해야함.
>ex)   
>
>       input[] Input = new input[total];
>       for(int i= 0; i < total; i++){
>            Input[i] = new input();
>       }

#
>### 인스턴스(instance) 관련 팁
> 인스턴스(instance)사용시, 메소드에 static 기능을 삭제해야한다.
>이유&ensp; : &ensp;instance는 객체를 만드는 것이므로 static을 사용시 객체를 만들기도 전에 메모리에 올라간다.
---
![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#java-basic-part-1)