
public class Employee {
    private String name; // 이름
    private int type; // 업무 역할
    private long salary; // 연봉   
    
    // 저장
    public void setName(String name){
        this.name = name;
    }
    public void setType(int type){
        this.type = type;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
    
    // 전달
    public String getName(){
        return name;
    }
    public int getType(){
        return type;
    }
    public long getSalary(){
        return salary;
    }
    
    // 불러낼시 저장
    public Employee(String name, int type, long salary){
        setName(name);
        setType(type);
        setSalary(salary);
    }   
}
