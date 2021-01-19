/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author TranTien
 */
public class student {

   
    String id_student;
    String name;
    String phone;
    String address;
    String birthday;
    String gender;
   // lophoc LopHoc;

    public student(String id_student, String name, String phone, String address, String birthday, String gender) {
        this.id_student = id_student;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
  
    }
    
 
    public student() {
        
    }

  

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
