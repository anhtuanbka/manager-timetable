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
public class searchRoomByID {

    public List<Room> searchRoomByID(String stringInput) throws SQLException {
        List<Room> RoomList = new ArrayList<>();
        String sql = "";
        Connection cn = ConnectionManager.getConnection();
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, "%" + stringInput + "%");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        }
        return null;

    }
}
