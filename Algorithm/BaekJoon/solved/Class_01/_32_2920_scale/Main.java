import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
/*
    https://www.acmicpc.net/problem/2920
    
    문제 : 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.
          이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
          1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
          연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.    
          
    입력 : 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
    
    출력 : 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.    

    
    동적 배열로 입력을 사용했다.
    1 로 시작했을 때 만족과 실패를 조건 해준다.
    8 로 시작했을 때 만족과 실패를 조건 해준다.
    1 과 8을 제외한 숫자로 시작시 실패 조건만 해준다.
*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));    
        StringTokenizer st = new StringTokenizer(bf.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 8; i++){
            list.add(Integer.parseInt(st.nextToken()));     
        }         
        
        if(list.get(0) == 1){
            int a = 0;
            for(int i = 0; i < 7; i++){
                if(list.get(i) + 1 == list.get(i + 1) ){
                    a++;
                }
            }
            if(a == 7){
                System.out.println("ascending");    
            }
            else {
                System.out.println("mixed");    
            }
        }        
        else if(list.get(0) == 8){            
            int b = 0;
            for(int i = 0; i < 7; i++){
                if(list.get(i) - 1 == list.get(i + 1) ){
                    b++;
                }
            }
            if(b == 7){
                System.out.println("descending");    
            }
            else {
                System.out.println("mixed");    
            }
        }
        else {
            System.out.println("mixed");    
        }        
    }
}
