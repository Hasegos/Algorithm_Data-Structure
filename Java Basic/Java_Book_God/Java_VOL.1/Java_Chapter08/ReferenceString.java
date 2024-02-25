 
public class ReferenceString {
    String instanceVariable;
    public ReferenceString(){}
    public ReferenceString(String arg){
        
    }
    public static void main(String[] args){
        ReferenceString reference = new ReferenceString();
    }
    public String getString(){
        return instanceVariable;
    }
    public void setString(String str){
        instanceVariable = str;
    }
    
}
