
public class AccountingArrayLoopApp {
    
    public static void main(String[] args) {
        
        double valueOfSupply = 10000.0;
        // double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = vatRate * valueOfSupply;
        double total = vat + valueOfSupply;
        double expense = expenseRate * valueOfSupply;
        double income = valueOfSupply - expense;             
        
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+total);
        System.out.println("Expense : "+ expense);
        System.out.println("income : "+ income);       
        
        double[] dividendRates = new double[3];
        dividendRates [0] = 0.5;
        dividendRates [1] = 0.3;
        dividendRates [2] = 0.2;
        
  
        
        int i = 0;
        while(i< dividendRates.length){
            System.out.println("Dividend : " + income * dividendRates[i]);
            i++;
        }
    }
}
