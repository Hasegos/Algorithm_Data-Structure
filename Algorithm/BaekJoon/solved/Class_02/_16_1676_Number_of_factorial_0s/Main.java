import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static int count = 0;
    // 끝에 0이 만들어지는 경우를 확인해서 하는 방법
    public static void OneMethod(int N){
        while(N >= 5){
            count += N / 5;
            N /= 5;
        }
        if(N > 5){
            System.out.println(count);
        }
        else {
            System.out.println(count);
        }
    }
    // BigInteger을 사용해서 하는 방법 
    public static void TwoMethod(int N){
        BigInteger bi = new BigInteger("1");
        for(int i = 1; i <= N; i++){
            bi = bi.multiply(BigInteger.valueOf(i)); 
        }
        String s = bi.toString();
        int num = s.length() - 1;
        while(s.charAt(num) == '0'){
            count ++;
            s = s.substring(0,s.lastIndexOf('0'));
            num --;
        }
        System.out.println(count);      
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());        
        
        Main.OneMethod(N);
        Main.TwoMethod(N);       
    }   
}
