package JUintTests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.student_registration_system.Course;
import com.mycompany.student_registration_system.Module;
import com.mycompany.student_registration_system.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;
/**
 *
 * @author Joe
 */
public class Student_Reg_Tests {
    
    private Student student;
    private Course course;
    private Module module;
    
    //private Student student;
    public Student_Reg_Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        student = new Student("John", "14/05/1995", "14352788", 23);
        course = new Course("Electronic Engineering" , 2018, 9, 3, 2019, 4,
                26);
        module = new Module("Fun Electronics", "EE111");
        student.addCourse(course);
        student.addModule(module);
        course.addModule(module);
        course.addStudent(student);
        module.addCourse(course);
        module.addStudent(student);
        
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void student_test_getUsername(){
        String username = "John23";
        String test_username = student.getUsername();
        assertEquals(username, test_username );
    }

    @Test
    public void student_test_getModules() {
        String module_name = "Fun Electronics";
        String test_module_name = student.getModules().get(0).getName();
        assertEquals(module_name, test_module_name);
    }
    
    @Test
    public void student_test_getCourses() {
        String course_name = "Electronic Engineering";
        String test_course_name = student.getCourses().get(0).getName();
        assertEquals(course_name, test_course_name);
        
    }

    @Test
    public void course_test_getName() {
        String course_name = "Electronic Engineering";
        String test_course_name = course.getName();
        assertEquals(course_name, test_course_name);
    }

    @Test
    public void course_test_getModules() {
        String module_name = "Fun Electronics";
        String test_module_name = course.getModules().get(0).getName();
        assertEquals(module_name, test_module_name);
    }

    @Test
    public void course_test_getStudents() {
        String student_name = "John";
        String test_student_name = course.getStudents().get(0).getName();
        assertEquals(student_name, test_student_name);
    }

    @Test
    public void course_test_getStartDate() {
        DateTime start_date = new DateTime(2018, 9, 3, 0, 0);
        String startDate = start_date.toString();
        DateTime test_start_date = course.getStartDate();
        String testStartDate = test_start_date.toString();
        assertEquals(startDate, testStartDate);
    }
    
    @Test
    public void course_test_getEndDate() {
        DateTime end_date = new DateTime(2019, 4, 26, 23, 59);
        String endDate = end_date.toString();
        DateTime test_end_date = course.getEndDate();
        String testEndDate = test_end_date.toString();
        assertEquals(endDate, testEndDate);
    }
    

    public void module_test_getName() {
        String name = "Fun Electronics";
        String test_name = module.getName();
        assertEquals(name, test_name);
    }


    public void module_test_getId() {
        String id = "EE111";
        String test_id = module.getId();
        assertEquals(id, test_id);
    }


    public void module_test_getStudents() {
        String student_id = "14352788";
        String test_student_id = module.getStudents().get(0).getID();
        assertEquals(student_id, test_student_id);
    }


    public void module_test_getCourses() {
        String course_name = "Electronic Engineering";
        String test_course_name = module.getCourses().get(0).getName();
        assertEquals(course_name, test_course_name);
    }


}
