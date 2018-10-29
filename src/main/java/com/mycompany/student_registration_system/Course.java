/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.student_registration_system;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 * @author Joe
 */
public class Course {
    
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students; 
    private DateTime startDate, endDate;
    
    public Course(String name ,int startYear, int startMonth, 
            int startDay, int finishYear, int finishMonth, int finishDay){
        this.name = name;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
        this.startDate = new DateTime(startYear, startMonth, startDay, 0, 0);
        this.endDate = new DateTime(finishYear, finishMonth, finishDay, 23, 59);
    
    }
    
    public void addModule(Module module){
        modules.add(module);
    }
    
    public void addStudent(Student student){
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    
}
