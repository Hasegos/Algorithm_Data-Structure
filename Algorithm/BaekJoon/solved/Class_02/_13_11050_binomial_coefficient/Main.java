import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
/*
    https://www.acmicpc.net/problem/11050
    
    문제 : 자연수 N과 정수 K가 주어졌을 때 이항 계수 {N}{K}를 구하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 N 과 K가 주어진다. (1 ≤ N ≤ 10, 0 ≤ K ≤ N)
    
    출력 :{N}{K}를 출력한다.

    이항 계수 정의된 식을 알면된다. 
    이항 계수는 이항식을 이항정리했을 때 각항의 계수이며, 주어진 크기의 (순서 없는)조합의 가짓수이다.
    흔히 nCk 라고 알고있다.
    해당 식은 n! /(k! * (n-k)!) 이다.
*/
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // a는 N , b는 K
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int N = 1, K = 1,result = 1;
        for(int i = 1; i <= a; i++){
            N *= i;
        }
        if(b == 0){
           System.out.println(1);     
        }
        // 0이 아닐때
        else {
            for(int j = 1; j <= b; j++){
                K *= j;
            }    
            for(int k = 1; k <= (a-b); k++){
                result *=k;
            }
            System.out.println(N / (K * result));
        }        
    }
}
