 
public class ArrayMain {
    
    // 이클립스에서 미리 값을 agrs에 주는 법이 존재한다.
    public static void main(String[] args) {
        if(args.length > 0){
            for(String arg : args){
                System.out.println(arg);
            }
        }
        
    }
}
