
public class Cal {
    
    public int sum(int v1,int v2){
        return v1 + v2;
    }
    // OverLoading
    public int sum(int v1,int v2,int v3){
        return this.sum(v1,v2) + v3;
    }
    
    int v1,v2;
    Cal(int v1,int v2){
        System.out.println("Cal init!!");
        this.v1 = v1;
        this.v2 = v2;
    }
    public int sum(){ return this.v1 + this.v2;}
}
