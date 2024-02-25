
public class StringCompare {
    
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        sample.checkString();
        sample.checkCompare();
        sample.checkCompareTo();
    }
    public void checkString(){
        String text = "You must know String class.";
        System.out.println("text.length() = " + text.length());
        System.out.println("text.isEmpty() = " + text.isEmpty());
    }
    public void checkCompare(){
        // new라는 키워드 생성시 다른 객체로 인식
        // Constant Pool 키워드 인식 x
        String text = "Check value";
        String text2 = new String("Check value");
        if(text == text2){
            System.out.println("text == text2 result is same.");
        }
        else {
            System.out.println("text == text2 result is different.");
        }
        if(text.equals(text2)){
            System.out.println("text.equals(text2) result is same");
        }
        // Case : 대소문자 
        String text3 = "check value";
        if(text.equalsIgnoreCase(text3)){
            System.out.println("text.equals(text2) result is same");
        }
    }
    public void checkCompareTo(){
        // a.compareTo(b) : b가 a보다 얼마나 앞에 있냐 뒤에 있냐.
        String text = "a";
        String text2 = "b";
        String text3 = "c";
        // 앞에 있으므로 +1
        System.out.println(text2.compareTo(text));
        // 뒤에 있으므로 -1
        System.out.println(text2.compareTo(text3));
        // 두칸 뒤에 있으므로 -2
        System.out.println(text.compareTo(text3));
    }
}
