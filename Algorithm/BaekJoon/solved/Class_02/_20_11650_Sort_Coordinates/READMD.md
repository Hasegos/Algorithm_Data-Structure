# 알고리즘 풀이
2차원 배열을 입력을 받고 이를 **X 기준으로 정렬하되, 만약 X값이 같으면 Y값으로 정렬**하면된다.  
Arrays.sort()를 재정의해서 **2차원 배열의 있는 입력값 첫번째인 X 기준으로 정렬**시키고,  
**만약 X값이 같으면 Y값으로 정렬** 시키면된다.  

방법 1. Arrays.sort() 재정의

    Arrays.sort(arr, new Comparator<int[]>(){

        public int compare(int[] a, int[] b){
            if(a[0] == b[0]){
                return a[1] - b[1];
            }
            else {
                return a[0] - b[0];    
            }                
        }
    });
이와 같이 비교 구문을 만들면된다.  

방법 2. Arraylist를 이용한 sort() 재정의

    Collections.sort(list, new Comparator<X_Y>(){

        public int compare(X_Y s1, X_Y s2){
            if(s1.x.equals(s2.x)){
                return Integer.parseInt(s1.y) - Integer.parseInt(s2.y);
            }
            else {
                return Integer.parseInt(s1.x) - Integer.parseInt(s2.x);
            }
        }
    });        
여기서 주의점은 **String으로 입력을 다받고 이를 Integer로 형 변환** 시켜서 사용해야한다.  
중간에 Integer로 형 변환 시키면 형 변환이 안된다.
