import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    https://www.acmicpc.net/problem/1000
    
    문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    출력 : 첫째 줄에 A+B를 출력한다.
    
    java에서는 Scanner 사용시 각종 입력을 구분해서 형변환을 자동으로 해주기에 알고리즘 시간이 오래걸린다.
    속도가 느리다.
    이를 해결하고자 BufferedReader를 사용한다.
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a,b;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        System.out.println(a+b);
    }
}
