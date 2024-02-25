import java.util.*;
class Player{
    private String name;
    
    public Player (String name) // 한가지 궁금한건 배열 객체 선언을 할때 반환값의 여부는 왜 안묻는가?
    {   
        this.name = name;
    } 
    public String getName(){
        return name;
    }
}
public class java_과제_188쪽_Bonus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        Player [] p  = new Player[2] ;      
        for(int i = 0; i < 2; i++)
        {
            System.out.print("선수 이름 입력 >>");
            p[i] = new Player(scanner.next());
        }
        int n = 0;
        while(true)
        {
            System.out.print(p[n].getName()+"씨, <Enter 외 아무키나 치세요>");
            scanner.next(); 
            int [] val = new int [3];
            for(int i = 0; i < val.length; i++)
            {   
                val[i] =(int)(Math.random()*3);
                System.out.print(val[i]+"\t");
            } 
            System.out.println();
            if(val[0] == val[1] && val [0] == val [2])
            {
                System.out.println(p[n].getName()+"이 승리하였습니다");
                break;
            }  
            n++;
            n = n % 2;        
        }
        scanner.close();
    }
}
