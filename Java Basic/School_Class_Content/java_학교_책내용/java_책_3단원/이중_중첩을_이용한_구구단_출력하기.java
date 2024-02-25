package java_책_3단원;
public class 이중_중첩을_이용한_구구단_출력하기 {    
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++)
        {
            for(int j = 1; j < 10; j++)
            {
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print("\t");
            }
            System.out.println();
        }        
    }
    
}
