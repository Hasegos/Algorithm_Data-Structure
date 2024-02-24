
public class PowerSet {
    public static void main(String[] args) {
        int num1 = 10,num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        System.out.println(sum);
        System.out.println(average);
    }
    
    /*  Mission: S의 멱집합을 출력하라
        powerSet(S)
        if S is an empty set
            print nothing;
        else
            let t be the first element of S;
            find all subsets of S-{t} by calling powerSet(S - {t});
            print the subsets;
            print the subsets with adding t;
        
    */
}
