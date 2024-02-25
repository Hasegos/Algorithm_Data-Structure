
public class StringSample {
    
    public static void main(String[] args) {        
        StringSample sample = new StringSample();
        sample.convert();
        sample.convertUTF16();
    }
    public void convert(){
        try {
            // 예제 코드가 위치할 부분
            String korean = "한글";
            byte[] array1 = korean.getBytes();
            for(byte data : array1){
                System.out.print(data + " ");
            }
            System.out.println();
            String korean2 = new String (array1);
            System.out.println(korean2);
            
            
        }
        catch(Exception e){
            e.printStackTrace();   
        }
    }
    public void convertUTF16(){
        try{
            // byte 배열로 생성할 때 사용한 캐릭터 셋을 문자열로 다시 전환할때 동일해야함.
            // 즉 byte 를 UTF-16 으로 생성시 문자열 변환도 UTF-16으로 변환해야함.
            String korean = "자바의 신 최고!!!";
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2  = new String(array1,"UTF-16");
            System.out.print(korean2);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void printByteArray(byte[] array){
        for(byte data : array){
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
