
public class Casting {
    
    public static void main(String[] args) {
        
        /*
            1.Casting에 대해서 알게 된 것
            
              타입 형식을 변환시킬 수 있다. 
            
            2.실수를 문자열로 변환
            
              Doulbe.toString()
              
            3. 정수 1과 정수 2를 나누었을 때 원하는 값 제공
            
              double d = (double)1 / 2;
            
        */        
        
        double a = 1.1;
        double b = 1;
        
        // 명식적으로만 형 변환해야함.
        double b2 = (double)1;
        System.out.println(b);
        
        /*
          (double)         (int)     
             1.1  ------->  1.0
               손실
        */
        
        
        // int c = 1.1;
        double d = 1.1;
        int e = (int)1.1;
        System.out.println(e);        
        
        
        // 1 to String
        String c = Double.toString(1.0);
        /// getClass() : 자바 타입 확인
        System.out.println(c.getClass());        
    }
    
}
