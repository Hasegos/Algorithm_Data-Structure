import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
/*
   https://www.acmicpc.net/problem/10814
   
   문제 : 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
         이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
   
   입력 : 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
         둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
         나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다.
         입력은 가입한 순서로 주어진다.
   
   출력 : 첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순,
         나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
         
  
   입력받은 값중에 숫자를 기준으로 정렬해버리면된다.
   여기서 주의할점은 우리가 입력받은 숫자는 문자로된 숫자이기에 이를 int형으로 변환해줄 필요가 있다.
   그래서 valueOf()를 통해 입력받은 0번째에 해당하는 문자 숫자를 변환해서 숫자 차를 이용해서 오름차순으로 만들면된다.

*/
public class Main {
    class Age_Person{
        String age;
        String name;
    
        public Age_Person(String age,String name){
            this.age = age;
            this.name = name;
        }
    }
    // 방법 1. Arrays.sort() 사용
    public static void OneMethod(int N, StringBuilder sb, BufferedReader bf) throws IOException{
        String[][] arr = new String[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < 2; j++){
                arr[i][j] = st.nextToken();       
            }
        }
        Arrays.sort(arr,new Comparator<String[]>() {
            
            public int compare(String[] s1, String[] s2) {                                
                return Integer.valueOf(s1[0]) - Integer.valueOf(s2[0]);                    
            }
        });        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 2; j++){
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);        
    }
    // 방법 2. ArrayList를 이용해서 Collections.sort()하는 방법
    public static void TwoMethod(int N, StringBuilder sb, BufferedReader bf) throws IOException{
        // 해당 타입을 저장하는 class를 Nested Class로 선언
        ArrayList<Age_Person> list = new ArrayList<>();
        for(int i = 0; i < N; i++){                        
            StringTokenizer st = new StringTokenizer(bf.readLine());            
            // 외부 클래스를 인스턴스화 시켜야 내부 클래스를 인스턴스화 시킬 수 있다.
            Main main = new Main();
            Main.Age_Person age = main.new Age_Person(st.nextToken(), st.nextToken());
            list.add(age);            
        }
        
        Collections.sort(list,new Comparator<Age_Person>(){
            
            public int compare(Age_Person s1, Age_Person s2){                                
                return Integer.valueOf(s1.age) - Integer.valueOf(s2.age);                
            }
        });
        for(int i = 0; i < list.size(); i++){            
            sb.append(list.get(i).age + ' ' + list.get(i).name + '\n');               
        }
        System.out.println(sb);     
    }
    // Main 메소드
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();      
        
        Main.OneMethod(N,sb,bf);
        Main.TwoMethod(N,sb,bf);      
    }
}

