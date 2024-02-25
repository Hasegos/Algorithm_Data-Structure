 
public class ReferenceReturn {
    
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.StringReturn());        
    }
    public int intReturn(){
        int returnInt = 0;
        return returnInt;
    }
    public int[] intArrayReturn(){
        int[] returnArray = new int[10];
        return returnArray;
    }
    public String StringReturn(){
        String returnString = "Return value";
        return returnString;
    }
    public int calculateAfterIntReturn(){
        int returnInt = 0;
        return returnInt;
        returnInt++;        
    }
    public int ifConditionIntReturn(){
        int returnInt = 0;
        if(returnInt == 0){
            return ++returnInt;
        }   
        return --returnInt;        
    }
    public void wantToStopInTheMiddle(boolean flag){
            /*
                내용            
            */
        if(!flag){
            /*
                내용            
            */
        }
        // return 뒤에 아무것도없이 ; 작성시 프로그램 종료라고 인식함
        if(flag) return;
            // 내용
    }
}
