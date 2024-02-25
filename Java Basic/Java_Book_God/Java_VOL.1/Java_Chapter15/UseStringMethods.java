
public class UseStringMethods {
    
    public static void main(String[] args) {        
        UseStringMethods stringMethods = new UseStringMethods();
        String Str = "The String class represents character strings.";
        String findStr = "string";
        
        stringMethods.printWords(Str);      
        stringMethods.findString(Str,findStr);
        stringMethods.findAnyCaseString(Str,findStr);
        stringMethods.countChar(Str,'s');
        stringMethods.printContainWords(Str,"ss");
    }
    // 문자열 단위로 나누기
    public void printWords(String str){
        String[] words = str.split(" ");
        for(String tempStr : words){
            System.out.println(tempStr);
        }        
    }
    // 해당 문자열이 나타나는지
    public void findString(String str, String findStr){
        int idx = str.indexOf(findStr);
        if(idx != -1){
            System.out.println(str + " is appeared at " + idx);    
        }        
    }
    // 대소문자 상관없이 찾는 문자는 어디에서 시작위치인지
    public void findAnyCaseString(String str, String findStr){
        String lowerStr = str.toLowerCase();        
        String lowerFindStr = findStr.toLowerCase();
        int idx = lowerStr.indexOf(lowerFindStr);
        
        if(idx != -1){
            System.out.println("string is appeared at " +idx );            
        }        
    }
    // 해당 문자 몇개 있는지 확인
    public void countChar(String str, char c){
        char[] strArray = str.toCharArray();
        int count = 0;
        for(char tempChar : strArray){
            if(tempChar == c){
                count ++;
            }
        }
        System.out.println("char \'" + c + "\' count is "+ count);
    }
    // 문자열 단위로 나눈후 찾는 문자열이 포함되는지
    public void printContainWords(String str, String findStr){
        String[] words = str.split(" ");
        int count = 0;
        for(String tempStr : words){
            if(tempStr.contains(findStr)){
               System.out.println(tempStr + " contains "+ findStr); 
                // count++;
            }
        }        
        // 해당 문자열이 여러개 있을 수 있어서 반복문 내에서 작동 안시킴
        if(count != 0){
            System.out.println("class contains "+ findStr);
        }
    }
}
