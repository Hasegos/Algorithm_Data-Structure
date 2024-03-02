
public class GenericSample {
    /*
        제네릭 타입 이름
        
        E : 요소(Element, 자바 컬렉션Collection에서 주로 사용됨)
        K : 키
        N : 숫자
        T : 타입
        V : 값
        S,U,V : 두 번째, 세 번째, 네 번째에 선언된 타입
    
    */
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
        sample.checkGenericDTO();        
    }
    
    @SuppressWarnings("unused")
    public void checkCastingDTO(){
        // StringBuilder와 StringBuffer가 어디에 있는지 헷갈릴수있다.
        CastingDTO dto1 = new CastingDTO();
        dto1.setObject(new String());        
        
        CastingDTO dto2 = new CastingDTO();
        dto2.setObject(new StringBuffer());        
        
        CastingDTO dto3 = new CastingDTO();
        dto3.setObject(new StringBuilder());        
        
        String temp1 = (String)dto1.getObject();
        StringBuffer temp2 = (StringBuffer)dto2.getObject();
        StringBuilder temp3 = (StringBuilder)dto3.getObject();
    }    
    
    public void checkDTO(CastingDTO dto){
        // 이를 해결하기위해 instanceof를 통해 해결하 수 있다.
        Object tempObject = dto.getObject();
        if(tempObject instanceof StringBuilder){
            System.out.println("StringBuilder");
        }
        else if(tempObject instanceof StringBuffer){
            System.out.println("StringBuffer");
        }       
    }
    
    @SuppressWarnings("unused")
    public void checkGenericDTO(){
        // 제네릭을 사용해서 미리 구분을 지어주면 불러올때 casting안해도된다.
        CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
        dto1.setObject(new String());
        CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
        dto2.setObject(new StringBuffer());
        CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
        dto3.setObject(new StringBuilder());
                
        String temp1 = dto1.getObject();
        StringBuffer temp2 = dto2.getObject();
        StringBuilder temp3 = dto3.getObject();      
    }
}
