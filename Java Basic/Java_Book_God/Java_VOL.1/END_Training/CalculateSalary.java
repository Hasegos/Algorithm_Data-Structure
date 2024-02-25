
public class CalculateSalary {
    
    public static void main(String[] args) {
        CalculateSalary salary = new CalculateSalary();
        salary.calculateSalaries();
    }
    // 계산 부분에서 long을 double로 casting 안됨
    public long getSalaryIncrease(Employee employee){
        long result = 0;
        switch(employee.getType()){
            case 1:                
                result = (employee.getSalary() / 100) * 5;                
                break;
            case 2:
                result = (employee.getSalary() / 10) * 11;                
                break;
            case 3:
                result = (employee.getSalary() / 10) * 12;                
                break;
            case 4:
                result = (employee.getSalary() / 10) * 13;                
                break;
            case 5:
                result = employee.getSalary() * 2;                
                break;
            default:
                break;
        }
        return result;
    }
    public void calculateSalaries(){
        Employee[] employee = new Employee[5];        
        employee[0] = new Employee("LeeDaeRi",1,1000000000);
        employee[1] = new Employee("KimManager",2,100000000);
        employee[2] = new Employee("WhangDesign",3,70000000);
        employee[3] = new Employee("ParArchi",4,80000000);
        employee[4] = new Employee("LeeDevelop",5,60000000);  
        
        for(Employee employees : employee){
            System.out.println(employees.getName() + " = " + getSalaryIncrease(employees));
        }
    }
    
}
