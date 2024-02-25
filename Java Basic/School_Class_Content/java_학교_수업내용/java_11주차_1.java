import java.util.*; // 입력을 받기위한 키보드 생성
public class java_11주차_1 {


   
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in); // 키보드를 통해 입력받는 Scanner
        int banSu,hakSu,examSu;  // banSu :반수 hakSu : 학생수 examSu:과목수
        int[][][] score;  // 반의 해당 번호 학생의 시험과목 점수들 입력할 곳
        int hap = 0; // 시험점수 합

        System.out.println("반수 :"); // 반수 입력할곳 출력
        banSu = scanner.nextInt(); // 반수 입력
        //banSu = Integer.parseInt(args [0]) ;
        score = new int [banSu][][]; // 그반수를 score에 해당배열에 저장
   
        for(int i=0; i < banSu; i++) // 반수 만큼 반복
        {
            System.out.println((i+1)+"반 학생수:"); // 학생수 입력할곳 출력
            hakSu = scanner.nextInt(); //학생수 입력받기
            score[i]=new int [hakSu][];  // 해당하는 반(score[i])에 학생수 저장
            for(int j = 0; j < hakSu; j++) // 학생수 만큼 반복
            {
                System.out.println((j+1)+"번 시험 과목 수:"); // 시험 과목수 입력할 곳출력 
                examSu = scanner.nextInt(); // 시험 과목수 입력 후 저장
                score[i][j] = new int [examSu]; // 해당하는 반 학생(score[i][j])의 시험과목 저장
                for(int k = 0;   k< examSu; k++) // 시험과목 수 만큼 반복
                {
                    System.out.println((k+1)+"번 과목 점수:"); // 각 시험점수 입력할 곳 출력
                    score[i][j][k] = scanner.nextInt(); // 각 시험점수 입력 후 저장
                   
                }  // for a
            } // for j

        } // for i

        for(int i = 0; i < score.length;  i++) // score 에 저장된 길이만큼 반복 즉 int [bansu][][]
        {
            for(int j = 0; j < score[i].length; j++) // score[i]에 저장된 길이만큼 반복 즉 int[banSU][hakSu][]
            {
                System.out.print((i+1)+"반"+(j+1)+"번 성적"); // 몇 반 몇번 의 성적 입력할곳 출력
                for(int k = 0; k < score[i][j].length; k++) // score[i][j]에 저장된 길이만큼 반복 즉 int[banSu][hakSu][examSu]
                {
                    hap += score[i][j][k]; //hap에 각 반의 해당 학생 의 시험점수들 저장
                    System.out.print(score[i][j][k]+" "); // 각 반의 해당 학생 의 시험점수들 출력
                }
                System.out.print("\t....."+hap+"\n"); //각 반의 해당 학생 의 시험점수들 합 출력
                }
        }


          scanner.close();  
    }
    
}