
public class Cal3 extends Cal{
    
    public int minus(int v1, int v2){
        return v1 - v2;
    }
    // Overriding
    public int sum(int v1,int v2){
        System.out.println("Cal3!");
        return super.sum(v1,v2);
    }
    // OverLoading
    public int sum(int v1,int v2,int v3){
        return v1 + v2 + v3;
    }
    
    Cal3(int v1,int v2){
        super(v1,v2);
        System.out.println("Cal3 init!!");
    }
    public int minus(){return this.v1 - this.v2;}
}
