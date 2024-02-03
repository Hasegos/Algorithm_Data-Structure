# 알고리즘 풀이
2차원 배열의 입력값을 입력받고 이를 x값이 아닌 y값으로 정렬한다.  
**Arrays.srot()를 재정의해서 y값으로 정렬하게끔 정의**를한다.  

    Arrays.sort(arr, new Comparator<int[]>(){

        public int compare(int[] o1, int[] o2) {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }            
            else {
                return o1[1] - o2[1];
            }                
        }
    });
