import java.util.ArrayList;
import java.util.List;

public class Module {

    //initialise the variables
    private String moduleId;
    private String moduleName;
    private List<Student> students;
    private List<Course> courses;

    //create a constructor with the variables as parameters
    public Module(String moduleId, String moduleName){
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        students = new ArrayList<>();
        courses = new ArrayList<>();

    }

    //method to add a list of modules
    public void addStudents(Student student){
        students.add(student);
    }

    //method to add a list of courses
    public void addCourses(Course course){
        courses.add(course);
    }

    //Accessor / Getter methods for the variables
    public String getModuleId() {
        return moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

      //returns all modules added to the student as a list
    public List<Student> getStudents() {
        return students;
    }

      //returns all courses added to the student as a list
    public List<Course> getCourses() {
        return courses;
    }
}
