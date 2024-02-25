
class Acconting {
    
    public  double valueOfSupply;
    public  double vatRate;
    public  double expenseRate;
    
    public  void print(){
            System.out.println("Value of supply : " + valueOfSupply);
            System.out.println("VAT : " + getVAT());   
            System.out.println("Total : " + getTotal());
            System.out.println("Expense : " + getExpense());
            System.out.println("Income : " + getIncome());
            System.out.println("Dividend 1 : " + getDividend1());
            System.out.println("Dividend 2 : " + getDividend2());
            System.out.println("Dividend 3 : " + getDividend3());
    }

    public  double getVAT(){
        return valueOfSupply * vatRate;
    }
    
    public  double getTotal(){
        return getVAT() + valueOfSupply;
    }
    public  double getExpense(){
        return valueOfSupply * expenseRate;
    }
    public  double getIncome(){
        return valueOfSupply - getExpense();
    }
    public  double getDividend1(){
        return getIncome() * 0.5;
    }
    public  double getDividend2(){
        return getIncome() * 0.3;
    }
    public  double getDividend3(){
        return getIncome() * 0.2;
    }    
}


public class AccountingClassApp {       
    
    /*
        인스턴스화 시키는 이유 
        class에 데이터가 그전과 다르다면 덮어씌우고 사용을 반복한다.
        이 과정에서 오류가 발생할 수 있으니, 클래스를 복제해서 서로다른 데이터 값을 넣어 사용한다.  
        instance를 사용시 해당 class안에 있는 static을 삭제해야함.
        이유 : static은 static영역에 있는 곳에서 관리하며 instance 객체를 만들기도 전에
        메모리에 올라가기에 사용을 못한다.
    */
    
    public static void main(String[] args) {            
        
        // instance
        Acconting a1 = new Acconting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;        
        a1.expenseRate = 0.3;            
        a1.print();
        
        
        Acconting a2 = new Acconting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;        
        a2.expenseRate = 0.2;            
        a2.print();
        
    }    
    
}
