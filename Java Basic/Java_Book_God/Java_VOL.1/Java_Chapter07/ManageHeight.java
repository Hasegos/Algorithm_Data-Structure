 
public class ManageHeight {
    
    int[][] gradeHeights;
    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        // 함수 호출로 배열공간 생성해야함.
        manage.setData();
        // 방법 1
        for(int classNo = 0; classNo < 5; classNo++){
            manage.printHeight(classNo);
            manage.printAverage(classNo);
        }         
        // 방법 2
        int classNo = 0;
        while(classNo < 5){
            manage.printAverage(classNo);
            classNo++;
        }        
    }
    public void setData(){        
        gradeHeights = new int[][]{
            {170,180,173,175,177},
            {160,165,167,186},
            {158,177,187,176},
            {173,182,181},
            {170,180,165,177,172}
        };
        
        gradeHeights = new int[5][];
        
        gradeHeights[0] = new int[] {170,180,173,175,177};
        gradeHeights[1] = new int[] {160,165,167,186};
        gradeHeights[2] = new int[] {158,177,187,176};
        gradeHeights[3] = new int[] {173,182,181};
        gradeHeights[4] = new int[] {170,180,165,177,172};
        
    }           
    public void printHeight(int classNo){
        // 방법 1
        System.out.println("Class No.:" + (classNo + 1));        
        for(int i = 0; i < gradeHeights[classNo].length; i++){
            System.out.println(gradeHeights[classNo][i]);            
        }
        // 방법 2
        System.out.println("Class No.:" + (classNo + 1));
        for(int data : gradeHeights[classNo]){
             System.out.println(data);
        }
    }
    
    public void printAverage(int classNo){
        // 방법 1
        double sum = 0.0;
        for(int a = 0; a < gradeHeights[classNo ].length; a++){
            sum += gradeHeights[classNo][a];
        }
        double result = sum / gradeHeights[classNo].length;
        System.out.println("Class No.:" + (classNo + 1)); 
        System.out.println("Height average :" + result);
        
        // 방법 2       
        sum = 0.0;
        int gradeHeightsLenght = gradeHeights[classNo].length ;
        for(int data : gradeHeights[classNo]){
            sum += data;
        }
        result = sum / gradeHeightsLenght;
        System.out.println("Class No.:" + (classNo + 1)); 
        System.out.println("Height average :" + result);
    }
}

