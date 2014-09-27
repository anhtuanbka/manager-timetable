/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Subject;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */
public class SubjectManager {

    private static int result;

    public static List<Subject> SelectSubject() throws SQLException {
        List<Subject> SubjectsList = new ArrayList<>();
        String sql = "SELECT * FROM SUBJECTS ORDER BY SUBJECT_ID";
        try {
            Connection cn = ConnectionManager.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Subject subjects = new Subject();
                subjects.setSUBJECT_ID(rs.getString("SUBJECT_ID"));
                subjects.setSUBJECT_NAME(rs.getString("SUBJECT_NAME"));
                subjects.setMASTER_SUBJECT(rs.getString("MASTER_SUBJECT"));
                SubjectsList.add(subjects);
            }
        } catch (Exception e) {

        }
        return SubjectsList;
    }

    public static List<Subject> searchSubjectbyName(String stringInput) throws SQLException {
        List<Subject> SubjectList = new ArrayList<>();
        String sql = "SELECT * FROM SUBJECTS WHERE SUBJECT_NAME LIKE ?";
        Connection cn = ConnectionManager.getConnection();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, "%" + stringInput + "%");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Subject subject = new Subject();
            subject.setSUBJECT_ID(rs.getString("SUBJECT_ID"));
            subject.setSUBJECT_NAME(rs.getString("SUBJECT_NAME"));
            subject.setMASTER_SUBJECT(rs.getString("MASTER_SUBJECT"));
            SubjectList.add(subject);
        }
        return SubjectList;

    }

    public static List<Subject> searchSubjectbyID(String stringInput) throws SQLException {
        List<Subject> SubjectList = new ArrayList<>();
        String sql = "SELECT * FROM SUBJECTS WHERE SUBJECT_ID LIKE ?";
        Connection cn = ConnectionManager.getConnection();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, "%" + stringInput + "%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Subject subject = new Subject();
            subject.setSUBJECT_ID(rs.getString("SUBJECT_ID"));
            subject.setSUBJECT_NAME(rs.getString("SUBJECT_NAME"));
            subject.setMASTER_SUBJECT(rs.getString("MASTER_SUBJECT"));
            SubjectList.add(subject);
        }
        return SubjectList;

    }

    public static List<Subject> searchSubjectbyMaster(String stringInput) throws SQLException {
        List<Subject> SubjectList = new ArrayList<>();
        String sql = "SELECT * FROM SUBJECTS WHERE MASTER_SUBJECT LIKE ?";
        Connection cn = ConnectionManager.getConnection();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, "%" + stringInput + "%");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Subject subject = new Subject();
            subject.setSUBJECT_ID(rs.getString("SUBJECT_ID"));
            subject.setSUBJECT_NAME(rs.getString("SUBJECT_NAME"));
            subject.setMASTER_SUBJECT(rs.getString("MASTER_SUBJECT"));
            SubjectList.add(subject);
        }
        return SubjectList;

    }

    public static boolean DeleteSubject(String ID) {

        String sql = "DELETE FROM SUBJECTS WHERE SUBJECT_ID=?";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
        }

        return false;
    }

    public static boolean InsertSubject(Subject subject) {
        String sql = "INSERT INTO SUBJECTS VALUES(?,?,?)";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, subject.getSUBJECT_ID());
            ps.setString(2, subject.getSUBJECT_NAME());
            ps.setString(3, subject.getMASTER_SUBJECT());
            int i = ps.executeUpdate();
            if (i != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean UpdateSubject(Subject subject) {
        String sql = "UPDATE SUBJECTS SET SUBJECT_NAME=?,MASTER_SUBJECT=? WHERE SUBJECT_ID=?";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, subject.getSUBJECT_NAME());
            ps.setString(2, subject.getMASTER_SUBJECT());
            ps.setString(3, subject.getSUBJECT_ID());
            int i = ps.executeUpdate();
            if (i != 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean checkSubjectID(String subjectID) {
        String sql = "SELECT * FROM SUBJECTS WHERE SUBJECT_ID=?";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, subjectID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean checkSubjectName(String subjectName) {
        String sql = "SELECT * FROM SUBJECTS WHERE SUBJECT_NAME=?";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, subjectName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static Subject GetSubjectbyID(String subject) {
        Subject item = new Subject();
        String sql = "SELECT * FROM SUBJECTS WHERE SUBJECT_ID=?";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, subject);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                item.setSUBJECT_ID(rs.getString("SUBJECT_ID"));
                item.setMASTER_SUBJECT(rs.getString("MASTER_SUBJECT"));
                item.setSUBJECT_NAME(rs.getString("SUBJECT_NAME"));
            }
        } catch (Exception e) {
        }
        return item;

    }
}
