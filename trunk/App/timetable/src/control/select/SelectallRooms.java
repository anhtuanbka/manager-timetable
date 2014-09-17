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
import model.Room;
import ultility.ConnectionManager;

/**
 *
 * @author Dr.Cuong
 */
public class SelectallRooms {

    public static List<Room> SelectallRooms() throws SQLException {
        List<Room> RoomsList = new ArrayList<>();
        String sql = "SELECT * FROM ROOMS";
        try {
            Connection cn = ConnectionManager.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room room = new Room();
                room.setROOM_ID(rs.getString("ROOM_ID"));
                room.setSTATUS(rs.getBoolean("STATUS"));
                room.setTYPE_ID(rs.getString("TYPE_ID"));
                RoomsList.add(room);
            }
        } catch (Exception e) {

        }
        return RoomsList;
    }
}
