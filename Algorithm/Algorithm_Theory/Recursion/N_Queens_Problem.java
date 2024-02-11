import java.lang.Math;

public class N_Queens_Problem { 
    public static int N = 9;
    /*
        BackTracking 방법 : 다시 되돌아가서 해결하는 방법
        상태공간트리란 찾는 해를 포함하는 트리,
        즉 해가 존재한다면 그것은 반드시 이트리의 어떤 한 노드에 해당함
        따라서 이 트리를 체계적으로 탐색하면 해를 구할 수 있음
        
        상태공간 트리의 모든 노드를 탐색해야 하는 것은 아님
        
        되추적 기법(BackTracking)
        상태공간 트리 깊이 우선 방식으로 탐색하여 해를 찾는 알고리즘을 말한다.
        "깊이우선탐색"
    */    
    private static int[] cols = new int [N+1];    
    
    public static boolean promising(int level){
        // 1일 경우
        for(int i = 1; i < level; i++){            
            // 같은 라인에 있을경우
            if(cols[i] == cols[level] ){
                return false;
            }
            /*
                대각선으로 있을 경우
                대각선에 존재한다는 것은 y - y 값과 x - x값이 같다.
                즉 직각삼각형의 기울기가 1이되야한다.
                Math.abs() : 절대값 구하기
            */
            else if(level - i == Math.abs(cols[level] - cols[i])){
                return false;
            }
        }
        return true;
    }
    public static boolean queens(int level){
        if(!promising(level)){
            return false;
        }        
        else if(level == N){
            for(int i = 1; i <= N; i++){
                System.out.println("(" + i + ", " + cols[i] + ")");
            }
            return true;
        }
        else {
            for(int i = 1; i <= N; i++){
                cols[level + 1] = i;
                if(queens(level + 1)){
                    return true;
                }
            }
            return false;
            
        }
    }
    public static void main(String[] args){
        queens(0);
    }
    /*
    /                    매개변수는 내가 현재 트리의 어떤 노드에 있는지를 지정해야한다.
        return-type queens(arguments){
            if non-promising
                report failure and return;
            else if success
                report answer and return;
            else
                visit children recursively;
        }
    */
    
}
