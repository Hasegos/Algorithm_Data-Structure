package java_책_5단원;

public class 추상_클래스의_구현  extends 추상_클래스의_구현_추상임{
    @Override
    public int add(int a, int b)
    {
        return a + b;
    }
    public int subtract(int a, int b)
    {
        return a - b;
    }
    public double average(int[]  a) {
        double sum = 0;
        for(int i = 0 ; i < a.length; i++)
        {
            sum += a[i];
        }
        return sum /a.length;
    }
    public static void main(String[] args) {
        추상_클래스의_구현 c = new 추상_클래스의_구현();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[] {2,3,4}));
    }
    
}
