import java.util.ArrayList;

public class ManageHeight {
    
    /*
        ArrayList 안에 ArrayList 사용법
        안에 있는 ArrayList값을 그룹으로 묶어 밖의 ArrayList에 저장
    */
    public ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();                
        for(int j = 1; j <= 5; j++){
            sample.printAverage(j);    
        }        
    }
    
    public void setData(){
        ArrayList<Integer> list1 = new ArrayList<>();        
        list1.add(170);
        list1.add(180);
        list1.add(173);
        list1.add(175);
        list1.add(177);        
        gradeHeights.add(list1);
        
        list1 = new ArrayList<Integer>();        
        list1.add(160);
        list1.add(165);
        list1.add(167);
        list1.add(186);        
        gradeHeights.add(list1);
        
        list1 = new ArrayList<Integer>();        
        list1.add(158);
        list1.add(177);
        list1.add(187);
        list1.add(176);        
        gradeHeights.add(list1);
        
        list1 = new ArrayList<Integer>();        
        list1.add(173);
        list1.add(182);
        list1.add(181);
        gradeHeights.add(list1);        
        
        list1 = new ArrayList<Integer>();        
        list1.add(170);
        list1.add(180);
        list1.add(165);
        list1.add(177);
        list1.add(172);
        gradeHeights.add(list1);      
    }
    public void printHeight(int ClassNo){        
        ArrayList<Integer> classHeight = gradeHeights.get(ClassNo - 1);        
        System.out.println("Class No.:"+ClassNo);
        for(int tempHeight : classHeight) {
            System.out.println(tempHeight);
        }        
    }
    
    public void printAverage(int ClassNo){
        ArrayList<Integer> classHeight = gradeHeights.get(ClassNo - 1);
        double Height_Average = 0.0;        
        System.out.println("Class No.:"+ClassNo);
        for(int tempHeight : classHeight){
            Height_Average += tempHeight;
        }
        Height_Average /= classHeight.size();
        System.out.println("Height average:" + Height_Average);
    }
}
