
public class Guard_Number {
    public int point;
    public Guard_Number(int order, int point){

        if(order == 1){
            Guard_Leader gl = new Guard_Leader(point);            
            this.point += gl.Point();
        }
        else if(order == 2){
            Rice_Shift rs = new Rice_Shift(point);
            this.point += rs.Point();
        }
        else{
            System.out.println("잘못된 경우입니다.");
            System.exit(0);            
        }        
    }
}
