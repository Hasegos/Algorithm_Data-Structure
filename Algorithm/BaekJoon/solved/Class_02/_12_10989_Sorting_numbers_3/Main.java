import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // ArrayList<Integer> arr = new ArrayList<>();
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[10001];
        for(int i = 0; i < N; i++){
            arr[Integer.parseInt(bf.readLine())] ++;
        }        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < 10001; i++){
            while(arr[i] > 0){
                sb.append(i).append('\n');
                arr[i]--;
            }    
        }
        
        System.out.println(sb);
    }
}
