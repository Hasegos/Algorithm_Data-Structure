import java.util.Scanner;

 class Circle2 { // 클래스를 하나에 넣어도된다  하지만 public 떄문에 오류난다.
					    //  public 을 쓴다면 별도의 파일에 올려야한다. public은 하나만 써야한다.
	String name;
    int radius;
    
    public Circle2(){
            radius = 1;
    }
    public Circle2(int i){
            radius = i;
    }
     double getArea(){   
        return 3.14 * radius * radius;    
    }
     
}

public class CircleApp2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int i;
        Circle2 cirl;

        System.out.print("반지름:");
        i = scanner.nextInt();
        if(i == 0)
        	cirl = new Circle2();
        else
           	cirl = new Circle2(i);
        System.out.println("반지름"+cirl.radius +"의 원면적은"+cirl.getArea());
        
        System.out.print("반지름:");
        i = scanner.nextInt();
        if(i == 0)
        	cirl = new Circle2();
        else
           	cirl = new Circle2(i);
        System.out.println("반지름"+cirl.radius +"의 원면적은"+cirl.getArea());
        scanner.close();

	}

}
