import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
    // 가장 첫줄에 공백을 기준으로 숫자 문자열을 Integer.parseInt(st.nextToken()) 으로 입력받아도 문제없지만
    // 만약 그전에 입력을 받고 나서 하면 java.lang.NumberFormatException: 예외가 발생한다.
    // 이런 경우는 줄 자체를 입력받고 입력받을 것을 " "(공백)으로 구분해서 넣고 숫자 타입으로 다시 변환 시켜야한다.
    // 숫자[] = Integer.parseInt(문자[]) 형태로
    // 아니면 StringTokenizer를 for문앞으로 빼준다.
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));      
        
        int N = Integer.parseInt(bf.readLine());
        int[] N_arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }
        // 이진 탐색을 위해 정렬
        Arrays.sort(N_arr);
        
        int M = Integer.parseInt(bf.readLine());
        int[] M_arr = new int[M];
        
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < M; i++){
            M_arr[i] = Integer.parseInt(st.nextToken());
        }        
        
        for(int i = 0; i < M; i++){
            System.out.println(result(N_arr,M_arr[i]));            
        }            
    }
    public static int result(int N_arr[], int M){
        int low = 0;
        int high = N_arr.length - 1;
        int count = 0;
        int mid;

        while(low <= high){
            mid = (low + high) / 2;                                
            if(N_arr[mid] == M){                
                return 1;
            }
            else if(N_arr[mid] > M){
                high = mid - 1;
            }
            else {
                high = mid + 1;
            }                
        }        
        return -1;
    }   
}
