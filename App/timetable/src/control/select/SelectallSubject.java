/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control.select;

import model.Subject;
import ultility.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dr.Cuong
 */
public class SelectallSubject {

    public List<Subject> SelectSubject() throws SQLException {
        List<Subject> SubjectsList = new ArrayList<>();
        String sql = "SELECT * FROM SUBJECTS";
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
        
    }


