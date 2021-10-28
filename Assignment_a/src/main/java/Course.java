import org.joda.time.*;

import java.util.ArrayList;
import java.util.List;

public class Course {

    //initialise the variables
    private String courseName;
    private List<Module>modules;
    private List<Student>students;
    private DateTime startDate;
    private DateTime endDate;

    //create a constructor with the variables as parameters
    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<>();
        students = new ArrayList<>();

    }

    //method to add a list of students
    public void addStudents(Student student){
        students.add(student);
    }

    //method to add a list of modules
    public void addModules(Module module){
        modules.add(module);
    }

    //Accessor / Getter methods for the variables
    public String getCourseName() {
        return courseName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

      //returns all modules added to the student as a list
    public List<Module> getModules() {
        return modules;
    }

      //returns all students added to the student as a list
    public List<Student> getStudents() {
        return students;
    }
}
