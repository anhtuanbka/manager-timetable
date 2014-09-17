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
import model.RoomType;
import ultility.ConnectionManager;

/**
 *
 * @author Dr.Cuong
 */
public class SelectallRoomsType {

    public static List<RoomType> SelectallRoomsType() throws SQLException {
        List<RoomType> RoomsTypesList = new ArrayList<>();
        String sql = "SELECT * FROM ROOMTYPES";
        try {
            Connection cn = ConnectionManager.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RoomType roomType = new RoomType();
                roomType.setTYPE_ID(rs.getString("TYPE_ID"));
                roomType.setTYPE_NAME(rs.getString("TYPE_NAME"));
                RoomsTypesList.add(roomType);
            }
        } catch (Exception e) {

        }
        return RoomsTypesList;
    }
}
