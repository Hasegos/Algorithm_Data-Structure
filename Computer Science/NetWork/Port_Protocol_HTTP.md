# 포트와 포트번호 / 프로토콜 

* 목차
    * [포트와 포트번호](#포트와-포트번호)
    * [프로토콜](#프로토콜)
    

## 포트와 포트번호

예를 들어 IP주소로 특정 컴퓨터가 요청했다고 가정해보자.  
해당 컴퓨터에서 여러 프로그램이 실행되고 있다면 **포트(port)** 를 통해 찾을 수 있다.  

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/9e3a7e0e-82cd-48e0-bcba-865fc0e2fe9b)  

서버에서 HTTP, FTP, DNS를 운영하고 있을 때 **운영하는 프로그램에 해당하는 포트 번호를 클라이언트에게 주고 이를 이용해서 접속**을 합니다.  

### 잘 알려진 포트 번호  

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/199afb0f-0c03-4186-8ae5-ad8fa4f290ee)

## 프로토콜

**프로토콜(Protocol)** 은 컴퓨터 네트워크에서 컴퓨터 간에 통신할 수 있도록 **정해놓은 규칙과 절차**를 말한다.  
미리 정한 약속인 프로토콜을 사용하며 주된 프로토콜은 **TCP, IP, HTTP, HTTPS** 등이 있다.  

---

### TCP와 IP

**TCP(Transmission Control Protocol)와 IP(Internet Protocol)** 는 인터넷으로 연결된 컴퓨터들이 **서로 정보를 주고받는데 사용하는 프로토콜**이다.  
이를 합쳐서 **TCP/IP**라고 한다.

TCP/IP에서는 데이터를 **패킷(packet)** 이라는 작은 단위로 나눠 전송한다.  
이때 IP는 **목적지 주소로 패킷을 빠르게 전달하며, 잘 전달되었는지 신경쓰지않고 전달**한다.  
이를 **'데이터 그램 패킷 교환 방식'** 이라고 한다.  

이와 다르게 **TCP**는 이문제를 해결한 **신뢰성 있는 프로토콜**이다.  
순서에 맞게 **정렬**하고, 유실된거있으면 **재전송해달라고 요청**한다.  
이를 **'가상 회선 패킷 교환 방식'** 이라고 한다.    

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/efa387a9-0645-4151-bc8a-5fcc84046779)

---

### HTTP

**HTTP(HyperText Transfer Protocol)** 는 인터넷에서 **클라이언트와 서버 간에 데이터를 주고받기 위해 사용하는 프로토콜**이다.  
HTTP는 **'요청 - 응답 프로토콜'** 이라고도 한다. 

예를 들어 'www<hi>.google.com' 을 입력하면 **웹 브라우저(클라이언트)** 는 구글 서버에   
'구글 웹 사이트를 사용자에게 보여주기 위한 데이터를 전송해달라'는 **HTTP 요청**을 한다.  
이를 통해 서버에서는 필요한 데이터(HTML, CSS, 이미지 파일 등)를 HTTP 응답으로 보낸다.  

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/6e9782c4-34ed-418e-ac98-2975576de4bd)

HTTP 요청과 응답은 **메시지 형태**로 주고 받으며, 이를 **HTTP 메시지(HTTP message)** 라고 한다.  

HTTP 메시지를 클라이언트에서 **서버로 요청을 보낼 때 요청 메시지**를 사용하고  
**서버**가 **클라이언트 응답**할 때 사용하는 **응답 메시지(response message)** 로 나뉜다.  
두 메시지는 모두 **시작행(start line), 헤더(header), 빈 행(empty line), 본문(body)** 으로 구성된다.  

### HTTP 메시지를 이용한 통신

![2 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/d569d4ba-bd2e-495a-85a7-6ffad8be7554)

* **시작행** : **요청** 혹은 **응답**과 주요 정보가 들어있다.
* **헤더** : 요청 혹은 응답과 **관련된 부가 정보**가 들어있다.
* **빈 행** : **헤더의 끝**을 **표시**하기 위해 **빈 행**을 넣어 구분한다. 
* **본문** : 통신을 통해 **실제로 주고받는 데이터**가 들어가 있다.  
    요청 메시지에는 **전달 데이터**, 응답 메시지는 **응답으로 보내는 데이터**가 있다.   
    
---

### 요청 메시지

요청 메시지 시작행에는 **HTTP 메서드(HTTP method)**, **요청 URI(Unifrom Resource Identifier)**, **HTTP 버전 정보**가 들어간다.  

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/65a232a8-5ff7-476d-abe8-f24251137522)  

* HTTP 메서드 : 클라이언트가 **서버**로 보내는 **요청의 종류**를 나타낸다.  
![3 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/7e2b50f9-1691-498e-b42e-a1242fbb9a4b)  
* 요청 URI : URI는 웹상의 고유한 자원을 식별하는 **통합 자원 식별자**로 처리할 **서버의 자원**을 가르킨다.  
* HTTP 버전 : 해당 메시지가 사용하는 **HTTP 버전**을 나타낸다.

---

### URL vs URI
**URI(Unifrom Resource Identifier)** 는 **'통합 자원 식별자'** 를 얘기한다.  
즉, URI는 인터넷상의 리소스 **"자원 자체"** 를 식별하는 **고유한 문자열 시퀸스**이다.  

**URL(Uniform Resource Locator)** 는 네트워크상에서 통합 자원(리소스)의 **"위치"** 를 나타내기 위한 규약이다.  
즉, **자원 식별자와 위치**를 동시에 보여준다.  

### **URI = 식별자 , URL = 식별자 + 위치**
![3 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/0fa1338c-023a-4fa7-aea4-63458915ea7f)

---

### 응답 메시지

응답 메시지의 시작 행에는 **HTTP 버전 정보, 상태 코드, 상태 메시지**가 들어간다.

![2 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/8eeae95d-5351-430a-bbd0-1701e1556585)

* 상태코드 : HTTP 요청이 성공적으로 완료됐는지 여부를 총 5개 그룹으로 나타낸다.  
![4 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/5d23374d-48ee-4079-9e9b-76cb146990f3)  
* 상태메시지 : 상태 코드 뒤에 붙은 **간략한 문구**로, 상태 코드에 대한 **해설을 제공**한다.  

---

### HTTPS

**HTTPS(HyperText Transfer Protocol over Secure Socket Layer)** 는 **보안 요소가 강화된 HTTP 프로토콜**이다.  
**HTTPS**는 **SSL(Secure Socket Layer)** 또는 **TLS(Transport Layer Security)** **암호화 프로토콜**을 사용해 **안전하게 전송**이 가능하다.  

![5 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/118e4fd6-6eae-45d7-bd99-3bfa46dd0a21)
데이터의 **무결성과 인증**이 보장이된다.




