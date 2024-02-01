import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
// https://yuja-kong.tistory.com/183 이거 보고 이해하기 여기서부터 시작하기
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
    // ArraysList로 O(n^2)으로 시간초과나는것을 최소로 O(n)만큼으로 만들어줄 수 있는 Collections사용하는 방법
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
