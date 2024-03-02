// 직접 해봅시다.
public class MaxFinder {
    
    public static void main(String[] args) {
        MaxFinder sample = new MaxFinder();
        sample.testGetMax();
        sample.testGetMin();
    }
    
    public void testGetMax(){
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(3, 1, 2));
        System.out.println(getMax(2, 3, 1));
        System.out.println(getMax("a", "b", "c"));
        System.out.println(getMax("b", "c", "a"));
        System.out.println(getMax("c", "a", "b"));
    }
    
    public void testGetMin(){
        System.out.println(getMin(1, 2, 3));
        System.out.println(getMin(3, 1, 2));
        System.out.println(getMin(2, 3, 1));
        System.out.println(getMin("a", "b", "c"));
        System.out.println(getMin("b", "c", "a"));
        System.out.println(getMin("c", "a", "b"));
    }
    // 매개변수는 몇개인지 모르고 Comparable을 확장해서 받는다.
    @SuppressWarnings("unchecked")
    public <T extends Comparable<T>> T getMax(T ...a){
        T maxT = a[0];
        for(T tempT : a){
            if(tempT.compareTo(maxT) > 0){
                maxT = tempT;
            }
        }
        return maxT;
    }
    // 제네릭으로 입력받는 값들을 비교를 위해 Comparable을 확장 받음    
    @SuppressWarnings("unchecked")
    public <T extends Comparable<T>> T getMin(T ...a){
        T minT = a[0];
        for(T tempT : a){
            if(tempT.compareTo(minT) < 0){
                minT = tempT;
            }
        }
        return minT;
    }
}
