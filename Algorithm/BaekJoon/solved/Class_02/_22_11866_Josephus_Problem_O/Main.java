import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
/*
    https://www.acmicpc.net/problem/11866
    
    내일 정리하기

*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();        
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i = 1;  i <= N; i++){
            linkedList.add(i);
        }
        sb.append('<');
        while(!linkedList.isEmpty()){
            for(int i = 0; i < K; i++){
                // K 번째 인 값
                if(i == K - 1){
                    if(linkedList.size() == 1){
                        sb.append(linkedList.remove());
                    }
                    else {
                        sb.append(linkedList.remove() + ", ");
                    }                    
                }
                else {                    
                    linkedList.add(linkedList.remove());
                }
            }     
        }
        sb.append('>');
        System.out.println(sb);
        
       
    }
}
