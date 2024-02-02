import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
/*
    https://www.acmicpc.net/problem/2751
    
    문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
          이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
    
    출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
    
    sort()를 활용해서 단어 정렬을 시키는데 중요한건 '시간 복잡도' 이다.
    시간 복잡도 관련해서 Arrays.sort() 와 Collections.sort() 차이를 알아야한다.
*/
public class Main {
    
    // Arrays.sort()로 정렬하는 방법 대신 O(n^2)으로 시간 초과가 날수있다.
    public static void OneMethod(int N,BufferedReader bf, StringBuilder sb){
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);
        
        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
    // ArraysList로 O(n^2)으로 시간초과나는것을 최소로 O(nlog(n))만큼으로 만들어줄 수 있는 Collections사용하는 방법
    public static void TwoMethod(int N,BufferedReader bf, StringBuilder sb){
         ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(bf.readLine()));
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < N; i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        Main.OneMethod(N,bf,sb);
        Main.TwoMethod(N,bf,sb);            
        
    }
}
