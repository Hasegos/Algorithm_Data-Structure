import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
/*
    https://www.acmicpc.net/problem/1920
    
    문제 : N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
          다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
          다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
          모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
    
    출력 : M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
    
    주어진 수에서 해당 수가 존재하는지에대한 여부를 확인하는 알고리즘은 이진 탐색 구조를 사용하면된다.
    이진 탐색이란 정렬된수에서 중간 값을 기준으로 구역을 나눠서 탐색하는 것을 말한다.
    일반적으로 하나씩 탐색하는 구조보다는 시간도 더빠르고 O(log n)의 시간복잡도를 가지고있다.
    만약 중간 기준으로 찾고자하는 수가 크면 low값의 범위를 올리고 작으면 high값의 범위를 낮추면된다.
*/
public class Main {
    
    /* 
        여러줄 입력할때 생긴 문제
        
        1.가장 첫줄에 공백을 기준으로 숫자 문자열을 Integer.parseInt(st.nextToken()) 으로 입력받아도 문제없지만
        만약 그전에 입력을 받고 나서 하면 java.lang.NumberFormatException: 예외가 발생한다.
        이런 경우는 줄 자체를 입력받고 입력받을 것을 " "(공백)으로 구분해서 넣고 숫자 타입으로 다시 변환 시켜야한다.
        숫자[] = Integer.parseInt(문자[]) 형태로
        
        2. StringTokenizer를 for문앞으로 빼준다.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new  StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        int[] N_arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            N_arr[i] = Integer.parseInt(st.nextToken());
        }
        // 이진 탐색을 위해 정렬
        Arrays.sort(N_arr);       
        
        int M = Integer.parseInt(bf.readLine());       
        st = new StringTokenizer(bf.readLine());         
        int[] M_arr = new int[M];
        for(int i = 0 ; i < M; i++){
            M_arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < M; i++){
            int result = print(N_arr,M_arr[i]);
            if(result == -1){
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
        }        
    }    
    
    public static int print(int N_arr[], int M){          
        int low = 0;        
        int high = N_arr.length - 1;        
        int mid;

        while(low <= high){
            mid = (low + high) / 2;                                
            if(N_arr[mid] == M){              
                return mid;                    
            }
            else if(N_arr[mid] > M){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }                                            
        }
        return -1;
    }
}

