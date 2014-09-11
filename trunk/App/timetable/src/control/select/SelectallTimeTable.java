/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TimeTable;
import ultility.ConnectionManager;

/**
 *
 * @author Dr.Cuong
 */
public class SelectallTimeTable {

    public List<TimeTable> SelectSubject() throws SQLException {
        List<TimeTable> TimeTablesList = new ArrayList<>();
        String sql = "SELECT * FROM TIMETABLE";
        try {
            Connection cn = ConnectionManager.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TimeTable timetable = new TimeTable();
                timetable.setTIME_ID(rs.getInt("TIME_ID"));
                timetable.setSUBJECT_ID(rs.getString("SUBJECT_ID"));
                timetable.setSUBJECT_NAME(rs.getString("SUBJECT_NAME"));
                timetable.setMAX_STUDENTS(rs.getInt("MAX_STUDENTS"));
                timetable.setREGISTED(rs.getInt("REGISTED"));
                TimeTablesList.add(timetable);
            }
        } catch (Exception e) {

        }
        return TimeTablesList;
    }
}
