# 알고리즘 풀이
입력받은 문자(숫자)를 기준으로 sort()를 하면된다.  
여기서 주의점은 우리가 입력받은 것은 **문자로된 '숫자'** 이다.
그래서 문자로된것을 **int형으로 바꿔서 이를 정렬**해야 된다.  
몇개의 케이스는 통과되지만 100이상부터는 정렬이 안된다.  


1.**Arrays.sort() 재정의**해서 사용하는 경우

    Arrays.sort(arr,new Comparator<String[]>() {

        public int compare(String[] s1, String[] s2) {
            if(s1[0].equals(s2[0])){
                return 0;
            }                
            else {
                return Integer.valueOf(s1[0]) - Integer.valueOf(s2[0]);    
            }                
        }
    });
    
2.시간 복잡도를 생각해서 **ArrayList를 사용해서 만들고 싶은 경우**  
**list에 입력받은 타입을 직접 클래스를 구현**해서 만들어줘야한다.  

    class Age_Person{
        String age;
        String name;

        public Age_Person(String age,String name){
            this.age = age;
            this.name = name;
        }
    }
**Age_Preson라는 class를 저장한 list를 공백기준으로 입력받은 값을 정렬한다.**


 
