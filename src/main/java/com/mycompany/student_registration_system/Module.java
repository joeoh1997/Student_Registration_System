/*
 * 
 */
package com.mycompany.student_registration_system;

import java.util.ArrayList;

/** 
 * @author Joe
 */
public class Module {
    
    private String name, id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses; 
    
    public Module(String name, String id){
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>(); 
    }
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public void addCourse(Course course){
        courses.add(course);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    
}
