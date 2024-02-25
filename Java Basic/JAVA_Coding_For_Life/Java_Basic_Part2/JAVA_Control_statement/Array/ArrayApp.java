
public class ArrayApp {
    
    /*       index
            0            1            2    
                
             Element
        "egoing"      "jinhuck"    "youbin"   
    */   
    public static void main(String[] args) {
        
        // egoing, jinhuck, youbin
        // String users = "egoing, jinhuck, youbin";
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";
        
        System.out.println(users[1]);
        // 값이 실제로 담겨있는 곳이 3개보다는 3칸짜리 배열이다.
        System.out.println(users.length);
        
        
        
        int[] scores = {10, 100, 100};
        System.out.println(scores[1]);
        System.out.println(scores.length);
    }
}
