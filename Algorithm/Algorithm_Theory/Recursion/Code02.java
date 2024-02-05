
public class Code02 {
    
    public static void main(String[] args) {
        int n = 4;
        func(4);
    }
    public static void func(int k){
        // Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야한다.  
        if(k <= 0)
            // 그전 단계로 돌아감
            return;
        else{
            System.out.println("Hello...");
            // Recursive case : recursion을 반복하다보면 결국 base case로 수렴해야한다.
            func(k - 1);
        }             
    }  
}
