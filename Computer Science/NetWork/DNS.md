# DNS
* 목차
    * [DNS란](#dns란)
    * [DNS 동작 방식](#dns-동작-방식)
    * [DNS 서버의 계층 구조](#dns-서버의-계층-구조)

## DNS란

**DNS(Domain Name System)** 는 **도메인과 IP 주소의 매핑 정보**를 가지고 있는 시스템이다.  

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#dns)

## DNS 동작 방식

1. 사용자가 웹브라우저의 주소 표시줄에 도메인을 입력한다.    
2. 웹 브라우저는 입력받은 도메인에 해당하는 IP 주소를 **DNS 서버**(DNS를 운영하는 서버로 **네임 서버**라고함)에 문의한다.  
3. DNS 서버는 도메인에 해당하는 **IP 주소를 찾아 반환**합니다.  
4. 웹 브라우저는 IP 주소를 받아 해당 IP 주소의 컴퓨터에 접속합니다.

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/ad7ccec3-b403-44cc-849a-28b220bdbb43)  

일반 사용자가 DNS를 따로 설정하지 않고 인터넷 서비스 제공 업체가 제공하는정보를 받아서 사용한다.  

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#dns)

## DNS 서버의 계층 구조  

**DNS 서버**는 도메인을 체계적으로 관리하기 위해 **도메인과 IP 주소의 매핑 정보**를 **계층 구조로 분산해 저장**한다.  
도메인을 계층화 이후 각 계층마다 DNS 서버를 따로 둬 운영한다.  
도메인의 각 계층은 **'.(닷, dot)'** 을 기준으로 구분한다.  
예시) **www<hi>.google.com(.)**    
**생략된 마지막 닷(.)이 루트 도메인**이고, com은 **최상위 레벨** 도메인, google은 **2레벨** 도메인, www는 **3레벨** 도메인이다.   
추가적으로 **3레벨** 도메인은 **서브도메인(sub-domain)** 이라고 불린다.    
각 계층마다 해당 도메인을 관리하는 DNS서버가 있다.  
**상위 계층 DNS서버**는 **하위 계층 도메인에대한 정보 관리**하고, 하위 계층 **DNS 서버의 IP 주소**를 저장한다.

### **계층 구조**

![3 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/e20171f2-3351-46c6-bec6-c7d4c055fe42)

하위 계층 DNS 서버의 IP 주소를 반환 받는 과정

---

### **DNS 서버의 IP 주소 조회 과정**

![2 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/a39181f0-05d3-495e-a4e5-ae39ebc94e81)

**www<hi>.google.com** 조회 -> **'com' IP 주소 반환** -> **www<hi>.google.com 조회** -> **'google.com' IP 주소 반환**  
-> **www<hi>.google.com 조회** -> **'www<hi>.google.com' IP 주소 반환** -> **반환 받은 IP 주소로 접속**

![arrow_up_circle_icon_128946 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/56bc983f-ea61-48fc-b733-fb8118b3aad5)[목차로 돌아가기](#dns)