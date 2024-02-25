
public class MethodVarargs {
    
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbersWithArray(new int[] {1,2,3,4,5}); 
        varargs.calculateNumbers(1,2,3,4,5);
        varargs.calculateNumbers(1);
        varargs.calculateNumbers(1,2);
        varargs.calculateNumbers(1,2,3);
        varargs.calculateNumbers(1,2,3,4);
        varargs.calculateNumbers(1,2,3,4,5);
        
        MemberDTO dto = new MemberDTO("SangMin", "010XXXXYYYY" , "javatuning@gamil.com");
        System.out.printf("Name : %s Phone : %s Email : %s\n",dto.name, dto.phone, dto.email);
    }
    public void calculateNumbersWithArray(int[] numbers){        
    }   
    // 타입...변수명 : 배열로 인식한다.
    public void calculateNumbers(int...numbers){
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        System.out.println("Total = " +total);
    }
    // 타입...변수명 : 가장 마지막에 선언해야하고 하나의 메소드에서 한번만 가능하다.
    public void arbitrary(String message, int...numbers){
        
    }
}
