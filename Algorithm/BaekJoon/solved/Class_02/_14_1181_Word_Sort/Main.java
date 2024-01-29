import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.ArrayList;
/*
    https://www.acmicpc.net/problem/1181
    
    문제 : 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
          길이가 짧은 것부터
          길이가 같으면 사전 순으로
          단, 중복된 단어는 하나만 남기고 제거해야 한다.
    
    입력 : 첫째 줄에 단어의 개수 N이 주어진다.
          (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다.
          주어지는 문자열의 길이는 50을 넘지 않는다.
    
    출력 : 조건에 따라 정렬하여 단어들을 출력한다.
    
    sort로 문자들을 순서대로 정렬하는데 여기 조건에 문자열 길이가 같은 경우를 추가해야 된다.
    그래서 기존에 만든 array에 정의된 sort를 재정의 할 필요가있다.
    기존 구조 
            Arrays.sort(T[] a, new Comparator<? T>(cmp){
            
                public int compare(T s1, T s1){
                    재정의 해야됨.
                }
            });
            
    위 구조를 재정의 하면된다.
    추가적으로 중복되는 단어는 하나만 출력임으로 그전 문자랑 그다음 문자를 비교해서 같은 경우 출력안하게끔 만들면된다.
*/
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(bf.readLine());
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < number; i++){
            list.add(bf.readLine());
        }
        // 특정 규칙에 의해 비교하고싶은 경우 Comparator 구현
        list.sort(new Comparator<String>(){            
            public int compare(String s1, String s2){
                // 두 비교대상 길이가 같은경우
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                // 길이가 다른경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });      
        
        System.out.println(list.get(0));
        
        for(int i = 1; i < number; i++){
            if(!list.get(i).equals(list.get(i - 1))){
                System.out.println(list.get(i));
            }
        }        
    }
}
