package java_책_3단원;
public class for_문을_이용하여_1부터_10까지_합출력하기 {
    public static void main(String[] args) {
        int sum = 0;
        for(int  j = 1;  j <11; j++)
        {
            sum += j;
            System.out.print(j);
            if(j <= 9)
            {
                System.out.print("+");
            }
            else
            {
                System.out.print("=");
                System.out.print(sum);
            }
        }
        
    }
}
