package java_책_3단원;
public class for_each_문활용 {
    public static void main(String[] args) {
        
        int[] n = {1,2,3,4,5};
        int sum = 0;
        for(int k : n) // k 에다가 n[0]  , n[1]  , n [4]로 반복
        {
            System.out.print(k+" ");
            sum += k;
        }
        System.out.println("합은 "+sum);
        String f[] = {"사과","배","바나나","체리","딸기","포도"};
        for(String k : f)
        {
            System.out.print(k + " ");
        }
        
    }
}
