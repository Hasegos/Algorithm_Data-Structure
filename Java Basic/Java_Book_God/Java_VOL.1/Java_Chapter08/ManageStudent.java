
public class ManageStudent {
    
    public static void main(String[] args) {
        ManageStudent manage = new ManageStudent();
        Student[] student = null;
        student = manage.addStudent();
        manage.printStudents(student);
    }
    
    public Student[] addStudent(){
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXYYYY", "ask@godofjava.com");
        return student;
    }
    public void printStudents(Student[] student) {
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i]);
        }
        
        for(Student data : student){
            System.out.println(data);
        }
    }

}
