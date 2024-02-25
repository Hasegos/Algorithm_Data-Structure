 
public class ArrayLength {
    
    public static void main(String[] args){
        ArrayLength array = new ArrayLength();
        array.printArrayLength();
        array.printArray();
        array.twoDimFor();
    }
    public void printArrayLength(){
        int[] oneDim = new int[3];
        int[][] twoDim  = new int[4][2];
        System.out.println(oneDim.length);
        System.out.println(twoDim.length);
    }
    public void printArray(){
        int[][] twoDim ={{1,2,3},{4,5,6}};
        System.out.println("twoDim.length = " +twoDim.length);
        System.out.println("twoDim[0].length = " +twoDim[0].length);
        
        int twoDimLength = twoDim.length;        
        for(int oneLoop = 0; oneLoop < twoDimLength; oneLoop++){
            
            int twoDim1Length = twoDim[oneLoop].length;
            for(int twoLoop = 0; twoLoop < twoDimLength; twoLoop++){
                System.out.println("twoDim [" + oneLoop + "][" + twoLoop +"] = "
                                  +twoDim[oneLoop][twoLoop]);
            }
        }
    }
    public void twoDimFor(){
        int[][] twoDim ={{1,2,3},{4,5,6}};
        for(int[] dimArray : twoDim){
            for(int data : dimArray){
                System.out.println(data);
            }
        }
    }
    public void twoDimForWithCounter(){
        int[][] twoDim = {{1,2,3},{4,5,6}};
        int oneCounter = 0;
        for(int[] dimArray : twoDim){
            int twoCounter = 0;
            for(int data : dimArray){
                System.out.println(data);
                twoCounter++;
            }
            oneCounter++;
        }
    }
}
