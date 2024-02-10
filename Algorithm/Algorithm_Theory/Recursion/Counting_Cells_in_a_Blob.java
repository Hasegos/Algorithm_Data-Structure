
public class Counting_Cells_in_a_Blob {
    /*
        주어진 공간에서 현재 위치한 공간에서의 이웃한 색칠된 공간이 있으면 Blob이라 간주한다.
        만약 지금위치가 색칠되어있으면 중복되는 걸 피하기위해 다른 값을 넣어주며,
        현 위치에서 볼 수 있는 8개의 공간의 좌표로 이동해서(Recursion) count값을 올린다.    
    */
    private static int N = 8;
    private static int [][] grid = {
        {1, 0, 0, 0, 0, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 0, 0},
        {1, 1, 0, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 1, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 0},
        {1, 0, 0, 0, 1, 0, 0, 1},
        {0, 1, 1, 0, 0, 1, 1, 1}
    };
    private static final int BACKGROUND_COLOR = 0;
    private static final int IMAGE_COLOR = 1;    
    private static final int ALREADY_COUNTED = 2;
    
    public static int countCells(int x, int y){        
        if(x < 0 || y < 0 || x >= N || y >= N)
            return 0;
        else if(grid[x][y] != IMAGE_COLOR){
            return 0;
        }
        else {
            grid[x][y] = ALREADY_COUNTED;
            return 1 + countCells(x - 1, y + 1) + countCells(x, y + 1)
                + countCells(x + 1, y + 1) + countCells(x -1, y)
                + countCells(x + 1, y) + countCells(x - 1, y - 1)
                + countCells(x , y -1) + countCells(x + 1, y - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println(countCells(0,0));            
    }
    /*
        Algorithm for countCells(x, y)
        
        if the pixel (x, y) is outside the grid
            the result is 0;
        else if pixel (x, y) is not an image pixel or already counted
            the result is 0;
        else
            set the colour of the pixel (x, y) to a red colour;
            the result is 1 plus the number of cells in each piece of
                the blob that includes a nearest nighbour;  
    */  
}
