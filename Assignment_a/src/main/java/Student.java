import java.util.ArrayList;
import java.util.List;

public class Student {

    //initialise the variables
    private int id;
    private String name;
    private int age;
    private String dateOfBirth;
    private List<Module>modules;
    private List<Course>courses;

    //create a constructor with the variables as parameters
    public Student(int id, String name, int age, String dateOfBirth)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        modules = new ArrayList<>();
        courses = new ArrayList<>();

    }

    //method to add a list of modules
    public void addModules(Module module){
        modules.add(module);
    }

    //method to add a list of courses
    public void addCourses(Course course){
        courses.add(course);
    }

    //Accessor / Getter methods for the variables
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

      //returns username which is a result of concatenating name and age
    public String getUserName(){
        return name + age;
    }

      //returns all modules added to the student as a list
    public List<Module> getModules() {
        return modules;
    }

      //returns all courses added to the student as a list
    public List<Course> getCourses() {
        return courses;
    }
}
