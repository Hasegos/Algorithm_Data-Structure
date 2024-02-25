
public class Equals {
    
    /*
        객체로 만든 애들을 비교할때는 equals을 사용하며,
        하나도 빠짐없이 equals에 대해 재정의를 해야한다. 
        단, String은 이미 재정의가 되어있어 할필요가 없다.
        오버라이딩할때 비교하는 클래스 내부에서 재정의해야한다.
    */
    public static void main(String[] args) {
        Equals thisObject = new Equals();
       
        thisObject.equalMethod();
        thisObject.equalMethod2();       
    }
    public void equalMethod(){
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same");
        }
        else{
            System.out.println("obj1 and obj2 is different");
        }
    }
    
    public void equalMethod2(){
        /*
            여기 있는 obj1 이랑 obj2 가 같을려면 MemberDTO 클래스내부에서 equals를 재정의해야한다.
            예시)
             public boolean equals(Object obj){
                   if(obj instanceof MemberDTO){
                       return this.name == ((MemberDTO)obj).name;
                   }
                    else
                        return false;
             }       
        */        
        
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is same");
        }
        else{
            System.out.println("obj1 and obj2 is different");
        }
    }
    // equals 는 object가 가지고있는 method이고 이를 오버라이딩을 했다.    
    public boolean equals(Object obj){
        
        // this : 클래스 객체 가르키고 obj또한 클래스 객체를 가르키기에 같다.
        // 주소가 같으므로 당연히 true
        if(this == obj) return true; 
        
        // obj가 null이므로 당연히 false
        if(obj == null) return false;
        
        // 클래스의 종류가 다르므로 false
        if(getClass() != obj.getClass()) return false;
        
        // 같은 클래스이므로 형 변환 실행
        MemberDTO other =(MemberDTO)obj;
        
        // 이제부터는 각 인스턴스 변수가 같은지 비교하는 작업 수행
        
        // name이 null일때
        if(name == null){
            // 비교 대상의 name이 null이 아니면 false
            if(other.name != null) return false;
            // 두 개의 email 값이 다르면 false
            else if(!name.equals(other.name)) return false;
        }
        // name과 같은 비교 수행
        if(email == null){
            if(other.email != null) return false;
            else if(!email.equals(other.email)) return false;
        }
        
        if(phone == null){
            if(other.phone != null) return false;
            else if(!phone.equals(other.phone)) return false;
        }
        
        // 모든 난관을 거쳐서 false를 리턴하지 않은 객체는 같은 값을 가지는 객체로 생각해서 true를 리턴한다.
        return true;
    }   
        
    
}
