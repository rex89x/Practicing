import com.abc.*; //import com.abc.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("110001", "王小明");
        
        System.out.println("學號:" + s.getStuNo());
        System.out.println("姓名:" + s.getStuName());
    }    
}