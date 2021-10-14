import org.joda.time.*;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private List<Module>modules;
    private List<Student>students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        modules = new ArrayList<>();
        students = new ArrayList<>();

    }

    public String getCourseName() {
        return courseName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }



    //method to add a list of modules
    public void addStudents(Student student){
        students.add(student);
    }

    public void addModules(Module module){
        modules.add(module);
    }



    public List<Module> getModules() {
        return modules;
    }

    public List<Student> getStudents() {
        return students;
    }
}
