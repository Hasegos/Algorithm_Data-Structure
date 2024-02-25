
public class FinalReferenceType {
    // FinalReferenceType 에서 MemberDTO 두번이상 생성이 불가능하지만
    // MemberDTO에 존재하는 객체들은 여러번 초기화가 가능하다.
    // MemberDTO객체에 존재하는 객체들이 final로 선언된것은 아니니..    
    final MemberDTO dto = new MemberDTO();
    
    public static void main(String[] args){
        FinalReferenceType referenceType = new FinalReferenceType();
        referenceType.checkDTO();        
    }
    public void checkDTO(){
        System.out.println(dto);
        // dto = new MemberDTO();
        dto.name = "Sanmin";
        System.out.println(dto);
    }
}
