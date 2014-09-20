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
import model.TimeRoom;
import model.TimeTable;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */
public class TimeTableManager {

    private static int result;

    public static List<TimeRoom> SelectallTimeRoom() throws SQLException {
        List<TimeRoom> TimeRoomList = new ArrayList<>();
        String sql = "SELECT * FROM TIME_ROOM";
        try {
            Connection cn = ConnectionManager.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TimeRoom timeRoom = new TimeRoom();
                timeRoom.setDAY(rs.getInt("DAY"));
                timeRoom.setLESSION_END(rs.getInt("LESSION_END"));
                timeRoom.setLESSION_START(rs.getInt("LESSION_START"));
                timeRoom.setROOM_ID(rs.getString("ROOM_ID"));
                timeRoom.setTIME_ID(rs.getInt("TIME_ID"));
                TimeRoomList.add(timeRoom);
            }
        } catch (Exception e) {

        }
        return TimeRoomList;
    }

    public static List<TimeTable> SelectallTimeTable() throws SQLException {
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

    public static boolean DeleteTimeRoom(String TIME_ID) {

        String sql = "DELETE FROM TIME_ROOM WHERE  TIME_ID=? ";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, TIME_ID);
            result = ps.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
        }

        return false;
    }

    public static boolean DeleteTimeTable(String ID) {

        String sql = "DELETE FROM TIMETABLE WHERE TIME_ID =?";
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
}
