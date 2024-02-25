// 직접해 봅시다.
public class NumberObjects {
    
    public static void main(String[] args) {
        NumberObjects sample = new NumberObjects();
        sample.parseLong("r1024");
        sample.parseLong("1024");
        sample.printOtherBase(1024);
    }
    public long parseLong(String data){
        long value = -1;
        try{
            // Long 클래스에 존재하는 parseLong()은 Long타입으로 변환시켜준다.
            value = Long.parseLong(data);
            System.out.println(value);            
        }
        catch(NumberFormatException e){
            System.out.println(data + " is not a number");                
        }      
        return value;
    }
    public void printOtherBase(long value){
        System.out.println("Original : " + value);
        // 2진수
        System.out.println("Binary : " + Long.toBinaryString(value));
        // 16진수
        System.out.println("Hex : " + Long.toHexString(value));
        // 8진수
        System.out.println("Octal : " + Long.toOctalString(value));
    }
}
