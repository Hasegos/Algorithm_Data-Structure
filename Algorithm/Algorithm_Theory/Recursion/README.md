# Recursion

**자기 자신을 호출하는 함수**  
**단점** : 자칫 잘못하면 무한루프에 빠질 수 있다.   

### 무한 루프에 빠지지 않으르면?  

**Base case** : **적어도 하나**의 **recursion에 빠지지 않는 경우**가 존재해야한다.    
**Recursive case** : **Recursion을 반복하다보면 결국 base case로 수렴**해야한다.  
**항상 무한루프에 빠지지않는다는 증명**이 있어야한다.  


### Recursion은 수학함수 계산에만 유용한가?

수학함수뿐 아니라 다른 많은 문제들을 Recursion으로 해결할 수 있다.  
ex) 문자열의 길이 계산, 2진수 변환하여 출력, 문자열의 출력, 문자열 뒤집어 출력, 배열의 합구하기,       
데이터파일로 부터 n개의 정수 읽어오기


### Recursion vs. Iteration

* 모든 순환함수는 반복문(iteration)으로 변경 가능  
* 그 역도 성립함. 즉 **모든 반복문은 recursion으로 표현 가능함**  
* 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함  
* 하지만 함수 호출에 따른 오버해드가 있음(매개변수 전달, 액티베이션 프레임 생성 등)

---

### 미로 찾기

미로 찾기에서 현재 자기의 위치 기준으로 (동,서,남,북)으로 벽이 아니고 이미 지나간 곳이 아닌 경우 이동이 가능하게끔  
재귀 함수(Recursion)을 통해 해결할 수 있다.  

![2 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/548396cc-3ef8-4a90-a082-1ff7022ac653)

실제 작용하는 방식으로 (북 -> 동 -> 남 -> 서) 순서대로 확인해서 이동하며,  
만약 해당길이 아니면 해당길이아님을 알려준다.  

![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/0f470b43-9859-488b-bcfc-a2cbfed40c14)

---

### Counting Cells in a Blob

Counting Cells in a Blob으로 Blob에서 이웃한 Cell의 갯수가 몇개인지 확인하는 알고리즘이다.  
색칠한 image pixel의 이웃한 image pixel의 묶음 새는 경우이다.  
 
![1 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/5d2b9ceb-d5d9-42d3-93c9-8f3d6b14523c)

예로 시작 위치 0,0 에서 이웃한 (1, 1) , (2, 1) , (0, 2) , (1, 2) 으로 size는 5이다.  

![2](https://github.com/Hasegos/Study_CS/assets/93961708/c78b850e-747d-4c29-8250-326e1b6ca721)

해당 좌표에서 8개의 좌표중 이웃한(색칠한)게 존재하면 count를 새는 형식으로 나아간다.  
그리고 중복되는 것을 방지하기위해 image pixel를 밟은 위치는 색깔을 칠해서 중복을 피한다.  
여기서 위치 이동을 Recursion을 통해 x , y 위치를 이동시킨다.  

![3 (1)](https://github.com/Hasegos/Study_CS/assets/93961708/4dc90a16-0065-4668-bb0b-7b00b5453662)

---

### N Queens Problem