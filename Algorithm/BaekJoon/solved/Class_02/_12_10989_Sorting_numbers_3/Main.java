import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
/*
    https://www.acmicpc.net/problem/10989
    
    문제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    입력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
          둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
          
    출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
    
    StringBuilder로 새로운 문자열 생성해야한다. 
    sort를 하면 배열공간 주소만주기에 문자열을 새로 생성해야함.
    Arrays로 해결할수도 있고 Counting으로도 해결할 수 있다.
    여기서 중요한 알고리즘은 해당 값이 있는 배열에다가 값을 주어 구분을 하자.    
*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Main main = new Main();        
        
        int N = Integer.parseInt(bf.readLine());        
        main.OneResult(bf,sb,N);
        main.TwoResult(bf,sb,N);
        main.ThreeResult(bf,sb,N);      
    }    
    // 방법1. 입력받은 배열의 값을 sort 후 메모리초과때문에 문자열 변경이 가능한 StringBuilder을 사용한다.
    public void OneResult(BufferedReader bf, StringBuilder sb,int N) throws IOException{
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }      
        Arrays.sort(arr);        
        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
    // 방법2. 배열공간을 최대로 해놓고 해당값에 해당 배열을 +1해서 몇개있는지 구분한후 
    //       StringBuilder을 사용해서 만든다. 이때주의점은 0이 포함안된다는것이다.
    public void TwoResult(BufferedReader bf, StringBuilder sb,int N) throws IOException{
        int[] arr = new int[10001];
        for(int i = 0; i < N; i++){
            arr[Integer.parseInt(bf.readLine())] ++;
        }      
        for(int i = 1; i < 10001; i++){
            while(arr[i] > 0){
                sb.append(i).append('\n');
                arr[i]--;
            }    
        }        
        System.out.println(sb);
    }
    /*
        ArrayList로 받은 다음에 그걸 sort 시킨후 StringBuilder에 문자열만들어주면 가능하다.
        대신 메모리 초과남 ㅋㅋㅋ
        public void sort(Comparator<? super E> c) -> List.sort 시키는 구조이다.
        리스트 이름.sort(Comparator.naturalOrder())로 오름차순 정렬 
        내림차순은 reverseOrder()을 사용한다
    */
    public void ThreeResult(BufferedReader bf, StringBuilder sb,int N) throws IOException{        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<N; i++){
            arr.add(Integer.parseInt(bf.readLine()));
        }
        arr.sort(Comparator.naturalOrder());
        
        for(int i = 0; i< N; i++){
            sb.append(arr.get(i)).append('\n');
        }
        System.out.println(sb);        
    }
}
