/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author TranTien
 */
public class lophoc {
    int id_class;
    student Student;
    course Course;
    String tengiangvien;

    public lophoc(int id_class, student Student, course Course, String tengiangvien) {
        this.id_class = id_class;
        this.Student = Student;
        this.Course = Course;
        this.tengiangvien = tengiangvien;
    }

    public lophoc(student Student, course Course, String tengiangvien) {
        this.Student = Student;
        this.Course = Course;
        this.tengiangvien = tengiangvien;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public student getStudent() {
        return Student;
    }

    public void setStudent(student Student) {
        this.Student = Student;
    }

    public course getCourse() {
        return Course;
    }

    public void setCourse(course Course) {
        this.Course = Course;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
    }
    
    

    
    
    
}
