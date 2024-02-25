import java.util.*;
public class CircleApp {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        Circle cirl;

        System.out.print("반지름:");
        i = scanner.nextInt();
        if(i == 0)
        	cirl = new Circle();
        else
           	cirl = new Circle(i);
        System.out.println("반지름"+cirl.radius +"의 원면적은"+cirl.getArea());
        scanner.close();
    }
    
}
