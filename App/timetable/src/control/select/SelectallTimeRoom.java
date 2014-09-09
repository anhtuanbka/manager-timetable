/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.select;

import model.TimeRoom;
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
public class SelectallTimeRoom {

    public List<TimeRoom> SelectallTimeRoom() throws SQLException {
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

}
