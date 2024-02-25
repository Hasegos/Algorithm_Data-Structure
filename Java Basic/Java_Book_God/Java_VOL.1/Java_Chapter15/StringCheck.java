
public class StringCheck {
    
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();
        
        String[] address = new String[]{
            "서울시 구로구 신도림동",
            "경기도 성남시 분당구 정자동 개발 공자",
            "서울시 구로구 개봉동",
        };
        sample.checkAddress(address);  
        sample.containsAddress(address);
        sample.checkMathch();
        sample.checkIndexOf();
        sample.checkLastIndexOf();
        sample.checkSubstring();
        sample.checkSplit();
        sample.checkTrim();
        sample.checkReplace();
        sample.checkFormat();
        sample.toLowerUpperCase();
        sample.internCheck();
        sample.stringBuilder();
        
    }
    // startsWith() : 처음 시작하는 문자열이 같은지 확인
    // endsWith() : 끝이 해당 문자열로 끝나는지 확인
    // contains() : 중간의 값이 같은지 확인
    public void checkAddress(String[] addresses){
        int startCount = 0,endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for(String address : addresses){
            if(address.startsWith(startText)){
                startCount++;
            }
            if(address.endsWith(endText)){
                endCount++;
            }
        }
        System.out.println("Start with " +startCount + " count is " + startCount);
        System.out.println("end with " + endText + " count is " + endCount);
    }
    
    public void containsAddress(String[] addresses){
        int containCount = 0;
        String containText = "구로";
        for(String address : addresses){
            if(address.contains(containText)){
                containCount ++;
            }
        }
        System.out.println("Contains " +containText + " count is " + containCount);
    }
    
    public void checkMathch(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";
        /*
            4개는 대소문자 구분 
            2 : 비교 시작위치  compare1 : 해당 대상이 존재하는지
            0 : compare1 확인 시작 위치 1 : 비교할 char 개수
            text의 i 부터 비교 하며 비교대상은 compare1의 i 부터 문자열이 끝나는 곳 하나만 비교
            IgnoreCase : 대소문자 무시  toffset : 비교 대상 문자열의 확인 시작 위치 -> text
            other : 존재하는지 확인 -> compare1 ooffset : other 객체의 확인 시작 위치 -> compare1 시작 위치
            len : 비교할 char의 개수 -> 문자열 x 문자 단위
         */
        System.out.println(text.regionMatches(2, compare1, 0 , 1)); // 매개 변수가 4개인 메소드
        System.out.println(text.regionMatches(5, compare1, 0 , 2)); // 매개 변수가 4개인 메소드
        // 대소문자 비교 무시
        System.out.println(text.regionMatches(true , 0, compare2, 0 , 1)); // 매개 변수가 5개인 메소드
    }
    
    public void checkIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        // 숫자는 시작 위치
        System.out.println(text.indexOf('a',20));
        System.out.println(text.indexOf("a ",20));
        System.out.println(text.indexOf('z'));
    }
    
    public void checkLastIndexOf(){
        String text = "Java technology is both a programming language and a platform.";
        // 여기서 결과로 나오는 위치는 첫번쨰를 0으로 생각 x
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        // 숫자는 시작 위치 -> 첫번째가 0이라는거 생각
        System.out.println(text.lastIndexOf('a',20));
        System.out.println(text.lastIndexOf("a ",20));
        System.out.println(text.lastIndexOf('z'));
    }
    
    public void checkSubstring(){
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        String tech = text.substring(5,9);
        System.out.println(tech);
    }
    // split : 문자열 자르기
    public void checkSplit(){
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");
        for(String temp : splitArray){
            System.out.println(temp);
        }
    }
    
    public void checkTrim(){
        // 문자 가운데있는 공백은 제거가 불가능하다.
        String[] strings = new String[] {
            " a", " b", "    c", "d    ","e   f","   "
        };
        for(String string : strings){
            System.out.println("[" + string +"]");
            System.out.println("[" + string.trim() +"]");
        }
        
        String text = " a ";
        if(text != null && text.trim().length() > 0){
            System.out.println("OK");
        }
    }
    
    public void checkReplace() {
        // 교체시 기존값을 변경하는것은 아니다.
        String text = "The String class represents character strings.";
        System.out.println(text.replace('s' , 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring" , "trike"));
        System.out.println(text.replaceAll(" " , "|"));
        System.out.println(text.replaceFirst(" " , "|"));
    }
    
    public void checkFormat(){
        String text = "제 이름은 %s입니다. 지금까지 %d 권의 책을 썼고, "
            + "하루에 %f %%의 시간을 책을 쓰는데 할애하고 있습니다.";
        String realText = String.format(text , "이상민",7,10.5);
        String realText = String.format(text , "이상민",7);
        System.out.println(realText);
    }
    
    public void toLowerUpperCase(){
        String text = "The String class represents character strings.";
        String realText = text.toLowerCase();
        System.out.println(realText);
        
        String realText2 = text.toUpperCase();
        System.out.println(realText2);
    }    
    
    public void internCheck() {
        /*
            intern : 새로운 객체생성(new 키워드 사용)을 할지라도 풀(pool)값을 참조해서
            비교한다. 대신, 많은 문자열 비교시 억지로 문자열이 풀값에 할당하게됨으로
            메모리를 청소하는 단계에 거치게된다.
        */
        String text1 = "Java Basic";
        String text2 = "Java Basic";
        String text3 = new String("Java Basic");
        text3 = text3.intern();
        System.out.println(text1 == text2);
        System.out.println(text1 == text3);
        System.out.println(text1.equals(text3));
    }
    
    public void stringBuilder(){
        // String 으로 만든 문자에다가 +로 더하면 기존 객체는 버려지고
        // 새로운 객체를 만드는데 이는 Gc(Garbage Collection)가비지 컬렉션 쓰레기값이 된다.
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" world");
        
        sb.append("Hello").append(" world"); //  같음
        System.out.println(sb);
    }
}
