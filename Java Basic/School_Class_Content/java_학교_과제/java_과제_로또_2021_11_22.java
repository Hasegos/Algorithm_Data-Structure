import java.util.*;
public class java_과제_로또_2021_11_22 {		
	public static void main(String[] args) {		
			randomRang();		
	}
	static void randomRang()
	{ 	
		 Scanner scanner = new Scanner(System.in);
	     int num = 0; num = scanner.nextInt(); int count = 0 , tmp =0,check = 0;
		 int [] arr = new int [7];
		 for(int a = 0; a < num; a++)
		 { 			 
			 while(count != 7)
			 {
				 tmp = (int)((Math.random()*45)+1);
				 for(int i = 0; i < count; i++)
				 {
					 if(tmp == arr[i])
					 {
						 check = 1; break;
					 }
				 }
				 if(check == 1)
				 {
					 check = 0;continue;
				 }
				 arr[count] = tmp;			 
				 count ++;			 
		 	}
			 count = 0;
			 for(int i = 0; i < 7; i++)
			 {	 if(i !=6)
				 {System.out.print((i+1)+"번"+arr[i]+" ");}
				 else
				 {System.out.print("보너스 숫자"+arr[i]);}
			 }
			 System.out.println();
			 }
        
		scanner.close(); 
	}
}