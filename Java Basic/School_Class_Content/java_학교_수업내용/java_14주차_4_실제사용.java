import java.util.*;
public class java_14주차_4_실제사용 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java_14주차_4_point p = new java_14주차_4_point();
        p.setXY(-100,-200);
        p.showXY();

        java_14주차_4_ColorPoint cp1;
        cp1 = new java_14주차_4_ColorPoint();
        System.out.print("색상:");
        cp1.setColor(scanner.next());
        System.out.print("x y 좌표:");
        cp1.setXY(scanner.nextInt(),scanner.nextInt());
        cp1.showXYColor();

        java_14주차_4_ColorPoint[] cp;
        cp = new java_14주차_4_ColorPoint[3];
        for(int i = 0; i < 3; i++)
        {
            cp[i] = new java_14주차_4_ColorPoint();
            System.out.print("색상:");
            cp[i].setColor(scanner.next()); ;
            System.out.print("x y 좌표:");
            cp[i].setXY(scanner.nextInt(), scanner.nextInt());                   
        }
        for(int i = 0; i <3; i++)
        {
            cp[i].showXYColor();
        }  
        scanner.close();
    }   
    
}
