
public class Student {
    String name, address, phone, email;
    
    public Student(String name){
        this.name = name;
    }
    
    public Student(String name,String address,String phone,String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    // String 은 toString()을 인터페이스로 상속받는다
    public String toString(){
        return name + " " + address + " " + phone + " " + email;
    }
}
