package java_책_4단원;
public class 실습문제_4단원_6번문제 {
    private  int width , height ; // 박스의 너비와 높이
    private char fillChar; // 박스를 그리는 데 사용하는 문자
    public 실습문제_4단원_6번문제()
    {
        this.width = 10; this.height = 1;
    }
    public  실습문제_4단원_6번문제 (int width , int height)
    {
        this.width = width;
        this.height = height;
    }
    public void  draw()
    {
        for(int i = 0; i < height; i++)
        {
            for(int j = 0 ;  j < width; j++)
            {
                System.out.print(fillChar);
            }
            System.out.println();
        }
    }
    public void fill(char c)
    {
        fillChar = c;
    }    
    public static void main(String[] args) {
        
        실습문제_4단원_6번문제 a = new 실습문제_4단원_6번문제();
        실습문제_4단원_6번문제 b = new 실습문제_4단원_6번문제(20,3);

        a.fill('*');
        b.fill('%');
        a.draw();
        b.draw();
    }
    
}
