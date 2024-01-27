import java.io.IOException;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
    https://www.acmicpc.net/problem/4153
    
    문제 : 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
          주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
          
    입력 : 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
           각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
           
    출력 : 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
    
    Scanner 사용시 시간 초과가 일어남으로 BufferedReader로 사용해야한다.
    여기서 주의점은 BufferedReader는 한줄 자체를 읽는 것으로 그 다음줄을 읽을 수 가 없다.
    그래서 반복하는 곳에다가 ★★★★★다음줄을 읽는 것을 행해야한다.★★★★★
    readLine()는 한줄 자체를 읽는다.

*/

public class Main {
    
    public static void main(String[] args) throws IOException {
        // BufferedReader로 읽을 객체 생성
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = null;
        for(;;){
            // bf.readLine()으로 한줄씩 계속 읽고 그걸 토큰으로 나누기
            st = new StringTokenizer(bf.readLine());
            // 0으로 초기화
            int[] arr = new int[] {
                0,0,0};
            int max = 0, result = 0;          
            for(int i = 0; i < 3; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }          
            
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                System.exit(0);
            }
            
            for(int i = 0; i < 3; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
             result = (int)Math.pow(arr[0],2)+ (int)Math.pow(arr[1],2) + (int)Math.pow(arr[2],2)
                     - (int)Math.pow(max,2);
            
            if(result == (int)Math.pow(max,2)){
               System.out.println("right");
            }
            else {
               System.out.println("wrong");    
            }
        }            
    }
}
