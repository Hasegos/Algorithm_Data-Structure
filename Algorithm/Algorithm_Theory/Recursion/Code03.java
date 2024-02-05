
public class Code03 {
    /*
        정리 : func(int n)은 음이 아닌 정수 n에 대해서 0에서 n까지의 합을 
              올바로 계산한다.
              
        증명 :        
        1. n = 0인 경우 : n=0인 경우 0을 반환한다. 올바르다.
        
        2. 임의의 양의 정수 k에대해서 n < k 인 경우 0 에서 n까지의 합을 올바르게 계산하
        여 반환한다고 가정하자.
        
        3. n = k 인 경우를 고려해보자. func은 먼저 func(k-1) 호출하는데 2번의 가정에
           의해서 0에서 k-1까지의 합이 올바로 계산되어 반환된다. 메서드 func은 그 값
           에 n을 더해서 반환한다. 따라서 메서드 func은 0에서 k 까지의 합을 올바로 계
           산하여 반환한다.
   */
    
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }
    // mission은 0 ~ n 까지의 합을 구하는 것
    public static int func(int n){
        // n = 0 이라면 합은 0이다
        if(n <= 0)
            return 0;
        /*
            n이 0보다 크다면 0에서 n까지의 합은 0에서
            n - 1까지의 합에 n을 더한 것이다.
        */        
        else {
            return n + func(n - 1);
        }
    }
    // 피보나치 수 f2  = f1 + f0
    public static int fibonacci(int n ){
        if(n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /*
        최대 공약수 
        m>=n인 두 양의 정수 m과 n에 대해서 m이 n의 배수이면 gcd(m,n) = n이고,
        그렇지 않으면 gcd(m,n) = gcd(n,m%n)이다.
    */
    public static double gcd(int m, int n){
        if(m < n){
            int tmp = m;
            m = n;
            n = tmp;
        }
        if(m % n == 0 )
            return n;
        else 
            return gcd(n, m % n);
    }
}
