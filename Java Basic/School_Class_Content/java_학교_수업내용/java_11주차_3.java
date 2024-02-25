import java.util.*; // 입력을 위한 키보드 생성  *: 자바에 있는 모든 라이브러리 가져오기
// 학교 수업내용에서 가장 큰 오점은 한국어 입력시 제대로 작동이안된다는것이다.

public class java_11주차_3
{
    static ArrayList<String> vCityName = new ArrayList<String>(); //viCityName 에 새로운 문자열 입력받는곳 생성
    static Scanner scanner =  new Scanner(System.in); // 입력 받는 곳 scanner 
                                               // 그리고 함수 모든 곳에서 입력받는다면 main 함수안이 아닌
                                               // 클래스에다가 넣는 방식으로한다 
    static void inData()  // inData 함수 입력 함수
    {
        String cityName;
        while(true)
        {
            System.out.print("방문한 도시이름(Enter입력시 종료:");
            cityName = scanner.nextLine(); // 한단어로 끝나는 것이 아니기때문에 영어같은 예외도 생각해서 문자열입력받기 
            if(cityName == "") //  enter를 했다는건 입력값이 없다는걸 말한다.
            {
                break; // System.exit(0) 으로 프로그램 종료가 가능하다.
            }
            else if (checkDup(cityName) == 0)  // 입력 받은 도시 이름이 중복일수있으므로 체크 하는 함수 호출
            {                                   // 0 : 중복 1 : 신규
                System.out.println("이미 입력된 도시입니다...");
            }
            else
            {
                vCityName.add(cityName); // 나머지는 다 새로운것이니 추가해준다
            }
        }
        
    }   
    static int checkDup(String ciName) // checkDup 합수
    {
        for(String temp:vCityName) // 문자열 입력받은 곳에서 하나하나 temp 로 옮겨서 비교
            if(temp.equals(ciName)) // temp 에 들어있는 주소와 ciName 의 주소가 같다면
                return 0; // 0 반환
        return 1; // 아니면 1반환

    }
    static void searchData()  // search 함수
    {   
        String cName; // 문자 cName 선언 
        System.out.println("찾는도시 이름:"); 
        cName = scanner.nextLine(); // 도시 이름 입력
        if(checkDup(cName) == 0) // checkDup 함수에 cName 파라미터 값 전달
        {
            System.out.println("있네요");
        }
        else
        {
            System.out.println("없네요");
        }
    }
    static void  printList() // printList 함수 출력 함수
    {
        System.out.println("방문했던 도시이름목록:");
        for(String tmep : vCityName) // tmep 에 vCityName 입력된거 차례대로 보내기
        {
            System.out.print(tmep+" ");// 그 보낸걸출력하기
        }
    }
    public static void main(String[] args) {  // main 함수

        String menu;         
        System.out.println("방문했던 도시 이름 관리 프로그램");    
        do
        {
            System.out.print("1. 입력  2. 검색  3. 출력  4.종료....");
            menu = scanner.nextLine();
            switch (menu)  // 숫자 같은경우는 enter 이걸 다 가져가기때문에 문제가 발생했었다 
            {              // 그래서 문자로 하면 enter를 버리기때문에 문제를 해결했었다.
                        // 또한 enter space  등 whitespace라고한다.
                case "1":inData();  // 입력을 위해 inData함수 호출
                break;
                case "2":searchData(); //  검색을 위해 searchData함수 호출
                break;
                case "3":printList(); //  출력을 위해 printList함수 호출
                break;
                case "4":System.exit(0); // 시스템 종료
                default:System.out.println("메뉴 선택이 잘못됨");
                
            }
        }while(true);
    }    
}
