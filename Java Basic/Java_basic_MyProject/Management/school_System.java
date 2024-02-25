import java.util.*;

class input{
    
     String student_name; // 학생 이름
     String teacher_name; // 선생님 이름
     double student_money; // 학생 자금
     double teacher_money; // 선생님 자금
    
    // 학생이름 받기
    public void getStudentName(String student_name){
        this.student_name = student_name;
    }
    // 선생님 이름 받기
    public void getTeacherName(String teacher_name){
        this.teacher_name = teacher_name;
    }
    // 학생 자금 받기
    public void getStudentMoney(double student_money){
        this.student_money = student_money;
    }
    // 선생 자금 받기
    public void getTeacherMoney(double teacher_money){
        this.teacher_money = teacher_money;
    }
    
    // 학생이름 알리기
    public String importStudentName(){
        return this.student_name;
    }
    
    // 선생님이름 알리기
    public String importTeacherName(){
        return this.teacher_name;
    }
    
    // 학생 자금 알리기
    public double importStudentMoney(){
        return this.student_money;
    }
    
    // 선생님 자금 알리기
    public double importTeacherMoney(){
        return this.teacher_money;
    }
    
    
}
public class school_System {
    /*
        학교관리 시스템(학생,교사 및 자금) 다루기 
        해볼 것 : main에 있는 기능들 class로 뺴기
        
        아쉬운점 : 만약 저장된 내용이 없으면 입력값을 받는 해당 처리 부분 (반복)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("총 인원이 몇명인지 입력해주세요 : ");        
        int number,total,student,teacher;
        String who;
        // 총 인원
        total = scanner.nextInt();
        input[] Input = new input[total];
        for(int i= 0; i < total; i++){
            Input[i] = new input();
        }
        
        System.out.println("학생수와 선생님수가 각각 몇명인지 입력해주세요");   
        System.out.print("학생수 먼저 입력해주세요 : ");
        student = scanner.nextInt();
        System.out.print("선생님수 입력해주세요 : ");
        teacher = scanner.nextInt();
        
        if((teacher + student) != total){
            System.out.println("총인원수와 학생수와 선생님수 합이 안 맞습니다... ");
            System.out.println("다시 입력해주세요");
            System.exit(0);
        }      
              

        // 학생 입력받기
        for(int i = 0; i < student; i++){
            System.out.print((i+1) + "번째의 학생의 이름을 입력해주세요 : ");
            Input[i].getStudentName(scanner.next());
            System.out.print("해당 학생의 자금을 입력해주세요 : ");
            Input[i].getStudentMoney(scanner.nextDouble());
        }

        // 선생님 입력받기
         for(int i = 0; i < teacher; i++){
            System.out.print((i+1) + "번째의 선생님의 이름을 입력해주세요 : ");
            Input[i].getStudentName(scanner.next());
            System.out.print("해당 선생님의 자금을 입력해주세요 : ");
            Input[i].getStudentMoney(scanner.nextDouble());
        } 
      
        System.out.print("학생과 선생님 둘중 원하는 목록을 입력해주세요 : ");
        who = scanner.next();
            
        System.out.print("몇번째를 확인하는지 입력해주세요 : ");
        number = scanner.nextInt();               
         
        
        if(who.equals("학생") ){
            if(Input[number-1].importStudentName() == null){
                System.out.println("해당 학생의 저장된 내용이 없습니다");
                System.out.println("다시 입력해주세요.");
                System.exit(0);
                // System.out.print("다시 원하는시는 번째를 입력해주세요 :");
                // number = scanner.nextInt();                
                
            }
            else{            
                System.out.println(number+" 번째의 학생의 이름 : " + Input[number-1].importStudentName() +
                              " 해당분의 자금 : " + Input[number-1].importStudentMoney());
            }
        }
        // 무조건적으로 선생님이라는 가정
        else{
             if(Input[number-1].importTeacherName() == null){
                System.out.println("해당 선생님의 저장된 내용이 없습니다");
                System.out.println("다시 입력해주세요.");
                System.exit(0);
                // System.out.print("몇번째를 확인하겠습니까? :");
                // number = scanner.nextInt();                
                 
            }
            else{
                System.out.println(number+" 번째의 선생님의 이름 : " + Input[number-1].importTeacherName()); 
                System.out.print(" 해당분의 자금 : " + Input[number-1].importTeacherMoney());    
            }            
        }              
    }    
}
