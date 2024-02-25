
public class MemberDTO {
    public String name;
    public String phone;    
    public String email;
    
    public MemberDTO(String name){
        this.name = name;        
    }
    
    public MemberDTO(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    public static void main(String[] args){
        MemberDTO dto = new MemberDTO("Sangmin", "010XXXXYYYY", "javauning@gmail.com");
        
        // toString 안 했을 경우
        System.out.println("Name = " + dto.name + " Phone = " + dto.phone + " email = " + dto.email);        
        
        // toString 했을 경우
        System.out.println(dto);
    }
    // 해당 클래스를 불러낼시 return을 해줌
    public String toString(){
        return "Name = " + name + "Phone = " + phone + "email = " + email;
    } 
    
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result((email == null) ? 0 : email.hashCode());
        result = prime * result((name == null) ? 0 : name.hashCode());
        result = prime * result((phone == null) ? 0 : phone.hashCode());
        
    }
   
}
