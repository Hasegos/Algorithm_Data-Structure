public class 문자열 {

    static void reprintStr(char[] b) // 공백 있으면 , 로 바꿔 주는 함수
    {
        for(int i = 0; i <b.length; i++)
        {
            if(b[i]== ' ')
            {
                b[i] = ',';
            }
        }
    }

    static void printStr(char[] a) // 그냥 출력함수
    {
        for(char tmp : a)
        {
            System.out.print(tmp);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] Str = {'T','h','i','s',' ','i','s',' ','a',' ','p'};
        printStr(Str);
        reprintStr(Str);
        printStr(Str); // 공백이 , 로 바뀐 함수를 출력   
        
    }
    
}
