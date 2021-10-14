import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private String dateOfBirth;
    private List<Module>modules;
    private List<Course>courses;

    public Student(int id, String name, int age, String dateOfBirth)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        modules = new ArrayList<>();
        courses = new ArrayList<>();

    }

    //Accessor / Getter methods
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    //method to add a list of modules
    public void addModules(Module module){
        modules.add(module);
    }

    public void addCourses(Course course){
        courses.add(course);
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getUserName(){
        return name + age;
    }
}
