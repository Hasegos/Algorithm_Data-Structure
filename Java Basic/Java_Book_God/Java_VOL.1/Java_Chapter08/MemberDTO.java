 
public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    
    //  아무것도 모를 때
    public MemberDTO(){
        
    }
    // 이름만 알때
    public MemberDTO(String name){
        this.name = name;
    }
    // 폰 전화번호랑 이메일만 알때
    public MemberDTO(String phone , String email){
        this.phone = phone;
        this.email = email;
    }
    // 전부다 알때
    public MemberDTO(String phone , String email, String name){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    public MemberDTO getMemberDTO() {
        MemberDTO dto = new MemberDTO();
        return dto;
    }
}
