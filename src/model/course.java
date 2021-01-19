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
public class course {
    int id_course;
    String course_name;
    String description;
    Date start_date;
    Date end_day;

    public course(int id_course, String course_name, String description, Date start_date, Date end_day) {
        this.id_course = id_course;
        this.course_name = course_name;
        this.description = description;
        this.start_date = start_date;
        this.end_day = end_day;
    }

    public course(String course_name, String description, Date start_date, Date end_day) {
        this.course_name = course_name;
        this.description = description;
        this.start_date = start_date;
        this.end_day = end_day;
    }
    
    

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setName_course(String course_name) {
        this.course_name = course_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_day() {
        return end_day;
    }

    public void setEnd_day(Date end_day) {
        this.end_day = end_day;
    }

   
    
}
