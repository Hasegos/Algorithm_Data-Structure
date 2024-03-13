package Bubble;
import java.util.Arrays;
import java.util.Scanner;

// 버블 정렬 정리하기
public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;        
        System.out.println("몇개의 숫자를 생성할지 입력해주세요!!");
        System.out.print("입력 >>>>> ");
        number = sc.nextInt();
        int[] arrays = new int[number];        
        for(int i = 0; i < number; i++) {      
            arrays[i] = (int)(Math.random() * 45);                                   
        }
        System.out.println("정렬하기 전");
        System.out.println(Arrays.toString(arrays));

        for(int i = arrays.length - 1; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(arrays[j] > arrays[j + 1]){
                    int tmep = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmep;
                }                
            }
        }
        System.out.println("정렬한 후");
        System.out.println(Arrays.toString(arrays));
        sc.close();
    }
}
