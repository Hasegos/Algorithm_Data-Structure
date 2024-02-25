
public class Student {
    String name, address, phone, email;
    
    public Student(String name, String address,String phone, String email){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }    
    // hashcode() 사용 x , 내가 한것
    public boolean equals(Object obj){
        if(obj instanceof Student){
           if(name == null ||  phone == null || address == null || email == null ){
               return false;
           }
            else {
                if(name == ((Student)obj).name &&
                   phone == ((Student)obj).phone && 
                   address == ((Student)obj).address && 
                   email == ((Student)obj).email){
                    return true;
                }
                else {
                    return false;
                }
            }
               
        }
        return false;       
    }
    
    // hashcode() 사용 o , 표준 방법    
    
    public int hashcode(){
        final int prime = 31;
        int result  = 1;                
        
        // 널값이 아닐때 1로 작용 즉, 0 과 1로 구분
        result = prime * result + ((name == null) ? 0 : hashcode());   
        result = prime * result + ((address == null) ? 0 : hashcode());
        result = prime * result + ((email == null) ? 0 : hashcode());
        result = prime * result + ((phone == null) ? 0 : hashcode());
        
        return result;          
    }  
    
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        // 가져온 값이 없다면
        if(obj == null){
            return false;                
        }
        // 가져온 클래스 타입이 다르다면
        if(getClass() != obj.getClass()){
            return false;
        }
        // 클래스 형 변환
        Student other = (Student)obj;
        
        // 널 값이라면 - name
        if(name == null){
            // 가져온게 널값이 아닐때
            if(other.name != null){
                return false;
            }            
        }
        // 가져온게 기존 값이랑 다르다면
        else if(!name.equals(other.name)){
            return false;
        }
        
        // 널 값이라면 - phone
        if(phone == null){
            // 가져온게 널값이 아닐때
            if(other.phone != null){
                return false;
            }            
        }else if(!phone.equals(other.phone)){ // 같은 수행
            return false;
        }        
        
        // 널 값이라면 - address
        if(address == null){
            // 가져온게 널값이 아닐때
            if(other.address != null){
                return false;
            }            
        }else if(!address.equals(other.address)){ // 같은 수행
            return false;
        }        
        
        // 널 값이라면 - email
        if(email == null){
            // 가져온게 널값이 아닐때
            if(other.email != null){
                return false;
            }            
        }else if(!email.equals(other.email)){ // 같은 수행
            return false;
        }        
        return true;        
    }
}
