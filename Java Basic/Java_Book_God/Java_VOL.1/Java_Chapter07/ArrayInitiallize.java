 
public class ArrayInitiallize {
    // 변하지않는 고정적인 값은 class기반으로 두자
    static String[] month = {"January", "February","March","April",
                         "May","June","July","August","September","	October",
                         "November","December"};
    public static void main(String[] args) {
        ArrayInitiallize array = new ArrayInitiallize();
        array.otherInit();
        System.out.println(array.getMonth(3));        
    }
    public void otherInit(){
        int[] lottoNumbers = {5,12,23,25,38,41,2};
    }
    public String getMonth(int monthInt){
        String[] month = {"January", "February","March","April",
                         "May","June","July","August","September","	October",
                         "November","December"};
        return month[monthInt + 1];
    }
}
