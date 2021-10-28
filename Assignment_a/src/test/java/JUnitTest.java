import org.junit.jupiter.api.Test;
import org.joda.time.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTest {

    public static void main(String args[]){
        JUnitTest test = new JUnitTest();
        test.runTest();
    }


    @Test
    public void runTest(){

        /***** Student Class Test ****/

        //Testing Student class
        Student student = new Student(18280070, "Joy", 20, "05/03/2001");

        assertEquals(student.getId(), 18280070);
        assertEquals(student.getName(),"Joy" );
        assertEquals(student.getUserName(), "Joy20");
        assertEquals(student.getDateOfBirth(), "05/03/2001");
        assertEquals(student.getAge(), 20);

        //Returning a list of Modules associated with the student
        Module module1 = new Module("CT417", "Software Engineering");
        Module module2 = new Module("SE98", "Computer Systems");

        //adds modules to a student
        student.addModules(module1);
        student.addModules(module2);

        //checks if module objects are equal
        assertEquals(student.getModules().get(0), module1);
        assertEquals(student.getModules().get(1), module2);

        //Returning a list of courses the student is registered for
        Course course1 = new Course("Software Engineering", new DateTime(2018, 9, 5, 8, 30), new DateTime(2022, 5, 15, 7, 29));
        Course course2 = new Course("Computer Systems", new DateTime(2018, 9, 5, 8, 30), new DateTime(2022, 5, 15, 7, 29));

        //adds courses to a student
        student.addCourses(course1);
        student.addCourses(course2);

        //checks if course objects are equal
        assertEquals(student.getCourses().get(0), course1);
        assertEquals(student.getCourses().get(1), course2);


        /**** Module Class Test ******/

        //Testing Module class
        Module module = new Module("CT5106", "Information Retrieval");

        assertEquals(module.getModuleId(), "CT5106");
        assertEquals(module.getModuleName(), "Information Retrieval");

        //Returning a list of students registered for the module
        Student student1 = new Student(18280070, "Joy", 20, "05/03/2001");
        Student student2 = new Student(18286780, "Ben", 21, "02/07/2000");

        //adds students to a module
        module.addStudents(student1);
        module.addStudents(student2);

        //checks if student objects are equal
        assertEquals(module.getStudents().get(0), student1);
        assertEquals(module.getStudents().get(1), student2);

        //Returning a list of courses associated with the module
        Course c1 = new Course("Software Engineering", new DateTime(2018, 9, 5, 8, 30), new DateTime(2022, 5, 15, 7, 29));
        Course c2 = new Course("Computer Systems", new DateTime(2018, 9, 5, 8, 30), new DateTime(2022, 5, 15, 7, 29));

        //adds courses to a module
        module.addCourses(c1);
        module.addCourses(c2);

        //checks if course objects are equal
        assertEquals(module.getCourses().get(0), c1);
        assertEquals(module.getCourses().get(1), c2);


        /**** Course Class Test ******/

        //Testing Course
        Course course = new Course("Software Engineering", new DateTime(2018, 9, 5, 8, 30), new DateTime(2022, 5, 15, 7, 29));

        assertEquals(course.getCourseName(), "Software Engineering");
        assertEquals(course.getStartDate(), new DateTime(2018, 9, 5, 8, 30));
        assertEquals(course.getEndDate(), new DateTime(2022, 5, 15, 7, 29));

        //Returning a list of Modules associated with the course
        Module m1 = new Module("CT417", "Software Engineering");
        Module m2 = new Module("SE98", "Computer Systems");

        //adds modules to a course
        course.addModules(m1);
        course.addModules(m2);

        //checks if module objects are equal
        assertEquals(course.getModules().get(0), m1);
        assertEquals(course.getModules().get(1), m2);

        //Returning a list of students registered for the course
        Student s1 = new Student(18280070, "Joy", 20, "05/03/2001");
        Student s2 = new Student(18286780, "Ben", 21, "02/07/2000");

        //adds students to a course
        course.addStudents(s1);
        course.addStudents(s2);

        //checks if student objects are equal
        assertEquals(course.getStudents().get(0), s1);
        assertEquals(course.getStudents().get(1), s2);
    }
}
