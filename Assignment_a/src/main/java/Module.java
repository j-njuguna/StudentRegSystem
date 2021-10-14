import java.util.ArrayList;
import java.util.List;

public class Module {

    private String moduleId;
    private String moduleName;
    private List<Student> students;
    private List<Course> courses;

    public Module(String moduleId, String moduleName){
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        students = new ArrayList<>();
        courses = new ArrayList<>();

    }

    public String getModuleId() {
        return moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    //method to add a list of modules
    public void addStudents(Student student){
        students.add(student);
    }

    public void addCourses(Course course){
        courses.add(course);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
