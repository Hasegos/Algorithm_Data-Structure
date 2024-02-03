import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
/*
    https://www.acmicpc.net/problem/11650
    
    문제 : 2차원 평면 위의 점 N개가 주어진다.
          좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
          둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
          (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
    
    출력 : 첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
    
    입력받은 배열값들중 각줄에 처음 입력받은 x 값으로 정렬하는데 만약 같으면 y 값으로 정렬
    Arrays.sort()를 재정의해서 사용하면된다.
    
    또는 ArrayList를 이용해서 재정의를 하자.


*/
class X_Y{
    String x;
    String y;
    
    public X_Y(String x,String y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    
    public static void OneMethod(int N, StringBuilder sb, BufferedReader bf) throws IOException{
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }        
        Arrays.sort(arr, new Comparator<int[]>(){
            
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return a[1] - b[1];
                }
                else {
                    return a[0] - b[0];    
                }                
            }
        });
        
        for(int i = 0;  i < N; i++){
            for(int j = 0; j < 2; j++){
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
    
    public static void TwoMethod(int N, StringBuilder sb, BufferedReader bf) throws IOException{
        ArrayList<X_Y> list = new ArrayList<X_Y>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine()); 
            // 토큰으로 읽은 것을 바로 Integer로 형변환이 안된다.
            list.add(new X_Y(st.nextToken(), st.nextToken()));            
        }
        Collections.sort(list, new Comparator<X_Y>(){
           
            public int compare(X_Y s1, X_Y s2){
                if(s1.x.equals(s2.x)){
                    return Integer.parseInt(s1.y) - Integer.parseInt(s2.y);
                }
                else {
                    return Integer.parseInt(s1.x) - Integer.parseInt(s2.x);
                }
            }
        });        
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i).x + ' ' + list.get(i).y + '\n');
        }
        System.out.println(sb);
    }       
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        
        // Main.OneMethod(N,sb,bf);
        Main.TwoMethod(N,sb,bf);
    }
}
