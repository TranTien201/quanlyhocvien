package motify;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.student;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import myConnection.myConnection;

/**
 *
 * @author TranTien
 */
public class studentmotify {
    public static List<student> findAll() {
        List<student> studentList = new ArrayList<>();
        // quàn lý dữ liệu đầu ra
        Connection con = myConnection.getConnection();
        String sql = "SELECT * FROM `student`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // lay du lieu tra ve
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 student std = new student(rs.getInt("id_student"),
                         rs.getString("name"),
                         rs.getString("phone"), 
                         rs.getString("address"), 
                         rs.getString("birthday"),
                         rs.getString("gender"));
                 studentList.add(std);
             }
        } catch (SQLException ex) {
            Logger.getLogger(studentmotify.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return studentList;
    }
    public static void insert(student std) {
        Connection con = myConnection.getConnection();
        String sql = "INSERT INTO `student`(`name`, `phone`, `address`, `birthday`, `gender`) VALUES (?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, std.getName());
            ps.setString(2, std.getPhone());
            ps.setString(3, std.getAddress());
            ps.setString(4, std.getBirthday());
            ps.setString(5, std.getGender());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(studentmotify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void update(student std) {
        Connection con = myConnection.getConnection();
        String sql = "UPDATE `student` SET `name`=?,`phone`=?,`address`=?,`birthday`=?,`gender`=? WHERE id_student = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
           
           
            ps.setString(1, std.getName());
            ps.setString(2, std.getAddress());
            ps.setString(3, std.getPhone());
            ps.setString(4, std.getGender());
            ps.setString(5, std.getBirthday());
            ps.setInt(6, std.getId_student());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(studentmotify.class.getName()).log(Level.SEVERE, null, ex);
        } 
              
    }
    public static void delete(int id_student) {
        Connection con = myConnection.getConnection();
        String sql = "DELETE FROM `student` WHERE id_student = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_student);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(studentmotify.class.getName()).log(Level.SEVERE, null, ex);
        } 
              
    }
     public static List<student> findByFullName(String name) {
        List<student> sl = new ArrayList<>();
        // quàn lý dữ liệu đầu ra
        Connection con = myConnection.getConnection();
        String sql = "SELECT * FROM `student` WHERE name LIKE ? ";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, "%"+name+"%");
            // lay du lieu tra ve
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 student std = new student(rs.getInt("id_student"),
                         rs.getString("name"),
                         rs.getString("phone"), 
                         rs.getString("address"), 
                         rs.getString("birthday"),
                         rs.getString("gender"));
                 sl.add(std);
             }
        } catch (SQLException ex) {
            Logger.getLogger(studentmotify.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return sl;
    }
}