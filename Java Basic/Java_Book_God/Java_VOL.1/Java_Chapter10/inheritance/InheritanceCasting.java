
public class InheritanceCasting {
    
    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
        // inheritance.objectCast();
        // inheritance.objectCast2();
        inheritance.objectCastArray();
        
    }
    public void objectCast(){
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();
        
        ParentCasting part2 = new ChildCasting();
        
        // 단순히 parent는 객체일 뿐이지 해당 변수를 완전히 사용을 못하기 떄문
        ChildCasting child2 = (ChildCasting)parent;
    }
    
    public void objectCast2(){        
        ChildCasting child = new ChildCasting();        
        ParentCasting part2 = child;
        ChildCasting child2 = (ChildCasting) part2;      
    }
    public void objectCastArray(){
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
        
        objectTypeCheck(parentArray);
        
    }    
    
    // instaceof : 객체 타입을 확인함.
    public void objectTypeCheck(ParentCasting[] parentArray){
       for(ParentCasting tempParent : parentArray){
           if(tempParent instanceof ChildCasting){
               System.out.println("ChildCasting");
               // tempParent : ChildCasting 타입임.
               ChildCasting tempChild = (ChildCasting)tempParent;
               tempChild.printAge();
           }
           else if(tempParent instanceof ParentCasting){
               System.out.println("ParentCasting");
           }
       }
        
    }
    
}
