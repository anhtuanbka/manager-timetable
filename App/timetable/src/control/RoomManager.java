/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.RoomManager.DeleteRoom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Room;
import model.RoomType;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */
public class RoomManager {

    private static int result;

    //GET DATA
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
//SEARCH ...

    public static List<Room> SearchRoomByTypeName(String stringInput) throws SQLException {
        List<Room> RoomList = new ArrayList<>();
        String sql = "SELECT ROOMS.ROOM_ID,ROOMS.STATUS,ROOMS.TYPE_ID FROM ROOMS,ROOMTYPES WHERE ROOMS.TYPE_ID LIKE ROOMTYPES.TYPE_ID AND ROOMTYPES.TYPE_NAME LIKE ?";
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

    public static List<Room> searchRoomByID(String stringInput) throws SQLException {
        List<Room> RoomList = new ArrayList<>();
        String sql = "SELECT * FROM ROOMS WHERE ROOM_ID LIKE ?";
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

//DELETE
    public static boolean DeleteRoom(String ID) {

        String sql = "DELETE FROM ROOMS WHERE ROOM_ID =?";
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

    public static boolean DeleteRoomType(String ID) {

        String sql = "DELETE FROM ROOMTYPES WHERE TYPE_ID =?";
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
