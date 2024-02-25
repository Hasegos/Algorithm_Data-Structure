 
public class InterestManager {
    
    public static void main(String[] args) {
        InterestManager manager = new InterestManager();      
        for(int i = 10; i <= 370; i+= 10){
            double amount = manager.calculateAmount(i,1000000);
            System.out.println(i + " : " + amount+ " ");
        }       
    }
    public double getInterestRate(int day){
        double InterestRate;
        if(0 < day && day < 91){
            InterestRate = 0.5 / 100.0;
        }
        else if(day < 181){
            InterestRate = 1 / 100.0;
        }
        else if(day < 365){
            InterestRate = 2 / 100.0;
        }
        else{
            InterestRate = 5.6 / 100.0;
        }
        return InterestRate;
    }
    public double calculateAmount(int day,long amount){
        double Amount = amount + (amount * getInterestRate(day));
        return Amount;
    }
    
}
