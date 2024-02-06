import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.lang.Math;
/*
    https://www.acmicpc.net/problem/1018

    문제 : 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
          어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 
          지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
          체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
          구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
          따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 
          하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
          보드가 체스판처럼 칠해져 있다는 보장이 없어서,
          지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
          당연히 8*8 크기는 아무데서나 골라도 된다.
          지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
    
    입력 : 첫째 줄에 N과 M이 주어진다.
          N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
          둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
    
    출력 : 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
    
    
    체스판이 정상적으로 색칠된 경우는 두가지 경우 밖에 없다.
    처음시작할때 B(Black)으로 시작하거나 W(White)로 시작하는 경우이다.
    그러므로 정상적으로 색칠된 경우를 만들어 놓고 입력받은 배열에서 기존 두 경우와 맞지않으면 색깔을 바꿔야한다고 간주한다.
    이에대해 수를 새주면 된다.그리고 난후 수들끼리 최소 값을 찾으면 해결되는 알고리즘이다.
*/
public class Main {   
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());                
        String[] case1 = new String[]{
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
        };
        String[] case2 = new String[]{
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
        };    
        
        // M : 가로 N : 세로
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());      
        String[] Chessboard = new String[N];
        
        // 한줄씩 읽기
        for(int i = 0; i < N; i++){
            Chessboard[i] = bf.readLine();
        }       
        
        int result = Integer.MAX_VALUE;
        // y줄 바뀜
        for(int Y = 0; Y < N - 7; Y++){
            // x줄이 바뀜
            for(int X = 0; X < M - 7; X++){
                // 몇번 바꾸는지 확인
                int BlackCount = 0;
                int WhiteCount = 0;
                // 첫번째가 W로 시작                
                    for(int y = Y; y < Y + 8; y++){
                        for(int x = X; x < X + 8; x++){
                            if(Chessboard[y].charAt(x) != case1[y - Y].charAt(x - X)){                                                                
                                WhiteCount ++;
                            }
                            if(Chessboard[y].charAt(x) != case2[y - Y].charAt(x - X)){
                                BlackCount ++;
                            }
                        }
                    }                                                  
                result = Math.min(result,Math.min(BlackCount,WhiteCount));
            }
        }
        System.out.println(result);        
    }
}
