/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.student_registration_system;
import java.util.*;
import org.joda.time.DateTime;
/**
 *A student class should contain some attributes such as (Name, Age, DOB, ID, username, 
 * courses and modules registered for, etc.).  A specific method (getUsername()) 
 * will generate the student’s username by concatenating their name and age. 
 * @author Joe
 */
public class Student {
    private String name, DOB, ID, username;
    private int age;
    private ArrayList<Module> modules;
    private ArrayList<Course> courses; 
    
    public Student(String name, String DOB, String ID, int age){
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
        this.age = age;
        this.modules = new ArrayList<>();
        this.courses = new ArrayList<>();
    
    }
    
    public String getUsername(){
        return name+age;
    }
    
    public void addModule(Module module){
        modules.add(module);
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
