# 알고리즘 풀이

문자들을 정렬하는데 사용되는 sort를 통해 문자들을 순서대로 정렬한다.  
문자들만 정렬하면 상관없이 없겠지만  
여기 조건에 문자열 길이가 같은 경우를 추가해야 된다.  
그래서 기존에 만든 **array에 정의된 sort를 재정의** 할 필요가있다.  

Java API에 정의된 기존 구조

    Arrays.sort(T[] a, new Comparator<? T>(cmp){

        public int compare(T s1, T s1){
        
        }
    });

재정의 구조

    Arrays.sort(s,new Comparator<String>(){ 
    
        public int compare(String s1, String s2){
                
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            }

            else {
                return s1.length() - s2.length();
            }
        }
    });

위와 같은 구조로 재정의 하며 Comparator을 사용해야한다.

    