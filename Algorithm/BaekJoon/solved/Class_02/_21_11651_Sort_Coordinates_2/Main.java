import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
/*
    https://www.acmicpc.net/problem/11651
    
    문제 : 2차원 평면 위의 점 N개가 주어진다.
          좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
          둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
          (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
    
    출력 : 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
    
    Arrays.sort()를 이용해서 재정의를 한다.
    x값의 기준이아닌 y값의 기준이기때문에 배열의 1번째를 기준으로 정렬해야한다.
*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());                
            }
        }
        
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
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2; j++){
                sb.append(arr[i][j]+ " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
