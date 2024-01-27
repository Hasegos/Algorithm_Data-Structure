import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    https://www.acmicpc.net/problem/1259

    문제 : 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬이라고 한다. 'radar', 'sees'는 팰린드롬이다.
          수도 팰린드롬으로 취급할 수 있다. 수의 숫자들을 뒤에서부터 읽어도 같다면 그 수는 팰린드롬수다.
          121, 12421 등은 팰린드롬수다. 123, 1231은 뒤에서부터 읽으면 다르므로 팰린드롬수가 아니다.
          또한 10도 팰린드롬수가 아닌데, 앞에 무의미한 0이 올 수 있다면 010이 되어 팰린드롬수로 취급할 수도 있지만,
          특별히 이번 문제에서는 무의미한 0이 앞에 올 수 없다고 하자.
          
    입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있으며, 각 줄마다 1 이상 99999 이하의 정수가 주어진다.
          입력의 마지막 줄에는 0이 주어지며, 이 줄은 문제에 포함되지 않는다.
    
    출력 : 각 줄마다 주어진 수가 팰린드롬수면 'yes', 아니면 'no'를 출력한다.
    
    
    문자열을 문자 배열로 입력받고 이를 길이에 따라서 구분하자!
*/
// 내 방법 -> 각 경우의 수마다 찾기
class MyResult {     
    public void result(BufferedReader bf) throws IOException{        
        for(;;){            
            char[] arr = bf.readLine().toCharArray();            
            if(arr.length == 1){
                if(arr[0] == '0'){
                    System.exit(0);
                }
                System.out.println("yes");                
            }
             if(arr.length == 2){
                if(arr[0] == arr[1]){
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }         
            if(arr.length == 3){
                if(arr[0] == arr[2]){
                    System.out.println("yes");
                }
                else {
                    System.out.println("no");
                }
            }
            if(arr.length == 4){
                if(arr[0] == arr[3] && arr[1] == arr[2]){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            if(arr.length == 5){                
                if(arr[0] == arr[4] && arr[1] == arr[3]){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }                                 
        }
    }
}
// 다른 방법 -> 전체 배열길이의 절반만큼만 돌리면서 해당 앞과 해당 뒤가 맞는지 순차적으로 확인
class AnotherResult {
    public void result (BufferedReader bf) throws IOException {
        while(true){            
            char[] arr = bf.readLine().toCharArray();
            boolean check = true;
            
            if(arr[0] == '0'){
                System.exit(0);
            }
            for(int i = 0; i < arr.length / 2; i++){
                if(arr[i] != arr[arr.length - 1 - i]){
                    check = false;
                }
            }
            if(check){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}

public class Main {
    
    public static void main(String[] args) throws IOException{        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        MyResult re = new MyResult();
        re.result(bf);    
        AnotherResult re1 = new AnotherResult();
        re1.result(bf);
    }
}
