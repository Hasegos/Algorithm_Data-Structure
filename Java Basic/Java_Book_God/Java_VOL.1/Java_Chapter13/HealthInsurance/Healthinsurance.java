
public enum Healthinsurance {
    
    LEVEL_ONE(1000, 1.0),    
    LEVEL_TWO(2000, 2.0),
    LEVEL_THREE(3000, 3.2),
    LEVEL_FOUR(4000, 4.5),
    LEVEL_FIVE(5000, 5.6),
    LEVEL_SIX(6000, 7.1);
    
    private final int maxSalary;
    private final double ratio;
    Healthinsurance(int maxSalary, double ratio){
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }
    public double getRatio(){
        return ratio;
    }
    
    public static Healthinsurance getHealthinsurance(int salary){
        
       if(salary < 1000){
           return LEVEL_ONE;
       }
       else if(salary < 2000){
           return LEVEL_TWO;
       }
       else if(salary < 3000){
           return LEVEL_THREE;
       }
       else if(salary < 4000){
           return LEVEL_FOUR;
       }
       else if(salary < 5000){
           return LEVEL_FIVE;
       }
       else{
           return LEVEL_SIX;
       }
    }
    
    public static void main(String[] args){
        /*
            Healthinsurance타입 배열을 생성하고
            각 배열에 Healthinsurance을 반환해주는 곳에
            입력받은 봉급값들을 매개변수로 주고 반환된 값은 
            Healthinsurance타입 배열에 하나씩 넣어서 사용
        */
        int[] ArraySalary = new int[]{1500,5500,8000};
        Healthinsurance[] insurance = new Healthinsurance[3];
        insurance[0] = getHealthinsurance(ArraySalary[0]);
        insurance[1] = getHealthinsurance(ArraySalary[1]);
        insurance[2] = getHealthinsurance(ArraySalary[2]);
        
        
        for(int i = 0; i < 3; i++){
            System.out.println(ArraySalary[i] + " = " + insurance[i] + ", " + insurance[i].getRatio());
        }
    }    
}
