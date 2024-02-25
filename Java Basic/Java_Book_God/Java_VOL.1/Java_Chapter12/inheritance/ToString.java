
public class ToString {
    
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
        // thisObject.toStringMethod2();
    }
    public void toStringMethod(Object obj){       
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }
    // 여기서 this 는 ToString 클래스를 가르키고
    // Object에서 정의된 toString() 에 해당되는 내용을 반환해준다.
    public void toStringMethod2(){
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }  
    
    public String toString(){
        return "ToString class";
    }
}
