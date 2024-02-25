import java.util.*;

//  정보 저장
class StudentDB {
    
    public String student_name; // 이름
    public int group; // 반
    public double achievement; // 성적
    public double haveMoney; // 가지고있는 돈
    public double expense; // 학비
 
         
    // 학생 이름
    public void student_name(String student_name) {
        this.student_name = student_name;        
    }
    
    // 학생의 반
    public void group(int group) {
        this.group = group;
    }
    
    // 학생의 성적
    public void achievement(double achievement) {
        this.achievement = achievement;
    }
    
    // 학생이 가지고 있는 돈
     public void haveMoney(double haveMoney) {
        this.haveMoney = haveMoney;
    }
    
    // 학생의 학비
    public void expense(double expense) {
        this.expense = expense;
    }       
    public void AllImport(){
        System.out.println("-----학생의 정보-----");
        System.out.println("학생의 이름 : " + student_name);
        System.out.println("학생의 반 : " + group);
        System.out.println("학생의 성적 : " + achievement);
        System.out.println("힉셍의 학비 : " + expense);
        System.out.println("학생의 잔고 : " + (haveMoney - expense));
    }
    
}
// 표현

class Input {
    
    // 학생의 이름
    public void name(){
        System.out.println("-----학생의 정보-----");
        System.out.print("학생의 이름 : ");    
    }
    
    // 학생의 반
    public void group(){
        System.out.println("숫자만 입력해주세요!");
        System.out.print("학생의 반 : ");
        
    }
    
    // 학생의 성적
    public void grade(){
        System.out.print("학생의 성적 : ");    
    }
    
    // 학생이 가지고있는 돈
    public void haveMony(){
         System.out.print("학생이 가지고 있는 돈 : ");
    }
    
    // 학생의 학비
    public void expense(){
        System.out.print("학생 학비 : ");
    }  
    
}
public class student {
    /*
        기초적인 프로젝트 No.1 : 학생 데이터 입력받은 후 보여주기 (★☆☆☆☆) 나름 뿌듯..
        
        실수한 과정 : 1.부모로 부터 상속받은 변수 사용 하는 과정(오버라이딩 이용해서 해야되는데 안함)
                     2. 남은 돈에대해서 선언할 때 값 입력된 값이 없는데도 정의 했음    
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        
        // 넣는거 알림
        Input input = new Input();
        
        // 저장공간 
        StudentDB db = new StudentDB();        
        
        // 이름 입력
        input.name();
        db.student_name(sc.next());
             
        
        // 반 입력
        input.group();
        db.group(sc.nextInt());        
        
        
        // 성적 입력
        input.grade();
        db.achievement(sc.nextDouble());        
        
        
        // 학생이 가지고 있는 돈 입력
        input.haveMony();
        db.haveMoney(sc.nextDouble());
        
        
        // 학비 입력
        input.expense();
        db.expense(sc.nextDouble());
        
        db.AllImport();
        
        
        
    }
}