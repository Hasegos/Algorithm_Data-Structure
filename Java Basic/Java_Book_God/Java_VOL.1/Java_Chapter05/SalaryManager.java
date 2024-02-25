 
public class SalaryManager {
    
    public static void main(String[] args) {
        SalaryManager salary = new SalaryManager();
        System.out.println("Real MonthlySalary : " + salary.getMonthlySalary(20000000));
    }
    public double getMonthlySalary(int yearlySalary){
        
        double monthSalary = yearlySalary / 12.0;
        
        double tax  = calculateTax(monthSalary);
        double NationalPension = calculateNationalPension(monthSalary);
        double HealthInsurance = calculateHealthInsurance(monthSalary);
        
        System.out.println("Tax per Month : " + tax);
        System.out.println("NationalPension per Month: " + NationalPension);
        System.out.println("HealthInsurance per Month: " + HealthInsurance);
        
        double total = tax + NationalPension + HealthInsurance;        
        monthSalary -= total;
        
        return monthSalary;
    }
    public double calculateTax(double monthSalary){
        double Tax = monthSalary * 0.125;        
        return  Tax;
    }
    public double calculateNationalPension(double monthSalary){
        double nationalPension = monthSalary * 0.081;       
        return  nationalPension;
    }
    public double calculateHealthInsurance(double monthSalary){
        double healthInsurance = monthSalary * 0.135;       
        return  healthInsurance;
    }
    
}
