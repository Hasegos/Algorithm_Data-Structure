
public class ReferenceAtNested {
    
    static class StaticNested {
        private int staticNestedInt = 99;
    }
    class Inner {
        private int innerValue = 100;        
    }
    public void setValue(int value){
        // 안에서 밖으로 역으로 참조 가능
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        
        Inner inner = new Inner();
        inner.innerValue = value;
    }
        
}
