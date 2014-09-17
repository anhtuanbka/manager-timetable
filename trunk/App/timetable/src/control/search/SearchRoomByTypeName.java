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
import model.Room;
import ultility.ConnectionManager;

/**
 *
 * @author Dr.Cuong
 */
public class SearchRoomByTypeName {

    public List<Room> SearchRoomByTypeName(String stringInput) throws SQLException {
        List<Room> RoomList = new ArrayList<>();
        String sql = "SELECT * FROM ROOMS,ROOMTYPES WHERE ROOMS.TYPE_ID LIKE ROOMTYPES.TYPE_ID AND ROOMTYPES.TYPE_NAME LIKE ?";
        Connection cn = ConnectionManager.getConnection();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, "%" + stringInput + "%");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Room room = new Room();
            room.setROOM_ID(rs.getString("ROOM_ID"));
            room.setSTATUS(rs.getBoolean("STATUS"));
            room.setTYPE_ID(rs.getString("TYPE_ID"));
            RoomList.add(room);
        }
        return RoomList;

    }
}
