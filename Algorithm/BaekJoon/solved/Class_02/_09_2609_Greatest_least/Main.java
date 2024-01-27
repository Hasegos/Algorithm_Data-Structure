import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
    https://www.acmicpc.net/problem/2609
    
    문제 : 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
    
    출력 : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

    최소 공약수는 두수를 서로 계속 나눈 나머지가 0이 되는 시점이 최소 공약수이다.
    여기서 주의할점은 우린 나누는 수를 구하는게아닌 ★★★나눠지는 수★★★를 구해야한다
    결국 최소 공약수는 "뭘로 나눠지냐?" 이거이다.
    
    최소 공배수는 두수를 곱한 수에서 ★최소 공약수★로 나누면 최소공배수가 나온다.

*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int a_1 = a;
        int b_1 = b;
        int max = 1;
        // a : 나눠지는수 b : 나누는 수
        // 여기서는 공약수이기에 나눠지는 수를 구해야함.
        while(max > 0){
            max = a % b;
            a = b;
            b = max;            
        }       
        System.out.println(a);
        System.out.println((a_1 * b_1)/a);        
    }
}
