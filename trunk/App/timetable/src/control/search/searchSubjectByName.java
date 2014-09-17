/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.search;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Subject;
import ultility.ConnectionManager;

/**
 *
 * @author Dr.Cuong
 */
public class searchSubjectByName {

    public static List<Subject> searchSubjectByname(String stringInput) throws SQLException {
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
}
