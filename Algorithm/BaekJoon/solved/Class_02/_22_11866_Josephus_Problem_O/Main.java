import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
/*
    https://www.acmicpc.net/problem/11866
    
    문제 : 요세푸스 문제는 다음과 같다.
          1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
          이제 순서대로 K번째 사람을 제거한다.
          한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
          이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
          원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
          예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
          N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 1,000)
    
    출력 : 예제와 같이 요세푸스 순열을 출력한다.
    
    Arraylist로 add와 remove 를 for문을 통해 작업하면 Collection가 변경되면서
    ConcurrentModificationException 예외가 발생된다. 즉, 사이즈 구조를 변경하면서 일어나는 현상이다.
    Arraylist는 사이즈 구조를 고정한채로 변경을 하기에 에러가 난다.
    이건 README에 정리하겠다.
*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();        
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i = 1;  i <= N; i++){
            linkedList.add(i);
        }
        sb.append('<');
        while(!linkedList.isEmpty()){
            for(int i = 0; i < K; i++){
                // K 번째 인 값
                if(i == K - 1){
                    if(linkedList.size() == 1){
                        sb.append(linkedList.remove());
                    }
                    else {
                        sb.append(linkedList.remove() + ", ");
                    }                    
                }
                else {                    
                    linkedList.add(linkedList.remove());
                }
            }     
        }
        sb.append('>');
        System.out.println(sb);       
    }
}
