
public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintNames();
    }
    public void callPrintNames(){
        Parent parent1 = new Parent();
        Child parent2 = new Child();
        ChildOther parent3 = new ChildOther();
        
        parent1.printName();
        parent2.printName();
        parent3.printName();
    }
}
