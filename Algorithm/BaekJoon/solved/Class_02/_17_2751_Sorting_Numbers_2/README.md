# 알고리즘 풀이

입력받은 문자열들을 sort로 정렬하는 쉬운 알고리즘을 갖고있다.  
그러나 이부분에서 중요한것은 '**시간 복잡도**'이다.

|             |정렬 방식| 시간 복잡도|
|-------------|-----------|----------|
|Arrays.sort() | DualPivotQuicksort | 평균 : O(nlog(n)) / 최악 : O(n^2) |
|Collections.sort()| TimSort(삽입정렬(insert sort)과 합병정렬(merge sort)을 결합한 정렬) | 평균,최악 : O(nlog(n))|  

이와 같이 시간 복잡도를 가지고있기에 최악의 경우에 최소로 O(nlog(n))의 시간을 보장해주는 Collections.sort()를 사용하는게 좋다.  
Arrays.sort()의 경우 참조 지역성이 좋은 **퀵정렬**을 사용한다.  
Collections.sort()의 경우 퀵 정렬보다 **합병정렬과 삽입정렬을 결합하여 만든 Tim정렬**을 사용하는게 평균적으로 더좋은 성능을 기대할 수 있다.  





