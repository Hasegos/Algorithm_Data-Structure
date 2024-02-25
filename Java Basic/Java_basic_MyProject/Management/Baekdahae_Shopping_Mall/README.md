# 콘솔로 돌아가는 쇼핑몰


## categorytbl - 카테고리테이블
|이름|자료형|변수명|데이터유형|크기|비고|
|:---:|:---:|:---:|:---:|:---:|:---:|
|순번|int|cNum|Number|20|시퀸스,pk|
|카테고리|String|cName|NVARCHAR2|50||
|대분류|int|cNumD|Number|50|0남자 1여자|

## cproducttbl - 상품테이블
|이름|자료형|변수명|데이터유형|크기|비고|
|:---:|:---:|:---:|:---:|:---:|:---:|
|순번|int|pNum|Number|20|시퀸스,pk|
|옷이름|String|pName|NVARCHAR2|50||
|도매가|int|wPrice|Number|20||
|마진률|int|margin|Number|20|default 0|
|수량|int|qty|Number|20|default 0|
|순번|int|cNum|Number|20|순번지정|

cNumD를 넣어 구분해주고 cNum을 기본키로 엮어서 cproduct랑 연동  

## 시퀸스

|cnum_seq|시작|1000001|증분 | 1| cnum |
|:---:|:---:|:---:|:---:|:---:|:---:|
|pnum_seq|시작|9000001|증분|1| pnum |

## admintbl - 관리자테이블
|이름|자료형|변수명|데이터유형|크기|비고|
|:---:|:---:|:---:|:---:|:---:|:---:|
|이름|String|aName|NVARCHAR2|20||
|비밀번호|String|aPwd|NVARCHAR2|128||
|담당|String|aPosition|NVARCHAR2|20||
|연락처|String|aPhone|VARCHAR2|20|pk|

핸드폰 연락처는 중복될 수 없으니깐 pk넣어서 아이디관리함.