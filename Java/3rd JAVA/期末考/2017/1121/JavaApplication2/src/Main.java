import com.abc.*;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("110001", "王小明", 'M');
        
        System.out.println("學號:" + s.getStuNo());
        System.out.println("姓名:" + s.getStuName());
        System.out.println("性別:" + s.getGender());
    }    
}