package Stack;
import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
/*
    Stack(스택) : 후입선출(Last In First Out) LIFO 특징이다.    
    
    가장 상단에 있는 값을 가지고 사용한다.
    1.push - 가장 상단에 값 추가
    2.peak - 가장 상단 값 읽기
    3.search - 입력받은 데이터의 위치 반환
    4.pop - 가장 상단 값 삭제후 반환
    5.empty - 비어있는지 확인

    삽입 : Big-O : O(1)
    삭제 : Big-O : O(1) 
    탐색 : Big-O : O(n)
*/
public class stack {    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        push(stack); // 값 추가
        peak(stack); // 맨위 값 읽기
        search(stack); // 데이터의 위치를 리턴
        pop(stack); // 맨위 값 삭제
        empty(stack); // 비어 있는지 확인
        
    }
    public static void push(Stack<String> stack){        
        System.out.println("----------------Stack 입력---------------");
        System.out.println("입력을 종료하실려면 0을 입력해주세요.");
        while (true) {            
            System.out.print("입력 >>>>>>> ");
            String string = sc.nextLine();
            if(string.equals("0")){
                System.out.println("시스템을 종료합니다.");                
                break;                
            }
            stack.push(string);    
        }                
    }
    public static void peak(Stack<String> stack){
        System.out.println("----------------Stack Peak---------------");
        Iterator<String> iter = stack.iterator();
        int i = 1;
        while (iter.hasNext()) {
            System.out.println( i +" 번째 "+ iter.next());
            i++;
        }        
    }
    public static void pop(Stack<String> stack){
        System.out.println("----------------Stack Pop---------------");
        System.out.println("");        
        Iterator<String> iter = stack.iterator();
        while (iter.hasNext()) {      
            Iterator<String> iter2 = stack.iterator();
            System.out.println("----------------Pop After---------------");
            while (iter2.hasNext()) {
                System.out.println(iter2.next());
            }
            stack.pop();                
        }
    }
    public static void empty(Stack<String> stack){
        System.out.println("----------------Stack Empty---------------");  
        System.out.println(stack.empty());
    }   
    public static void search(Stack<String> stack) {        
        System.out.println("----------------Stack Search---------------");
        System.out.println("입력을 종료하실려면 0을 입력해주세요.");        
        while (true) {
            System.out.print("입력 >>>>>>> ");
            String search = sc.next();
            if(search.equals("0")){
                System.out.println("시스템을 종료합니다.");           
                break;
            }
            System.out.println(stack.search(search));    
        }       
    }
}
