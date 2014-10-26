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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Room;
import model.RoomType;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */
public class RoomManager {

    private static int result;

    public static List<Room> getAllRooms() {
        List<Room> listRooms = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("select * from ROOMS,ROOMTYPES where ROOMS.TYPE_ID=ROOMTYPES.TYPE_ID");
            rs = pstm.executeQuery();
            while (rs.next()) {
                listRooms.add(new Room(rs.getString("ROOM_ID"), rs.getString("TYPE_NAME"), rs.getBoolean("STATUS")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Load rooms failed!");
            //Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionManager.closeAll(conn, pstm, rs);
        }

        return listRooms;
    }

    public static List<RoomType> getAllRoomTypes() {
        List<RoomType> listRoomType = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("select * from ROOMTYPES");
            rs = pstm.executeQuery();
            while (rs.next()) {
                listRoomType.add(new RoomType(rs.getString("TYPE_ID"), rs.getString("TYPE_NAME")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Load room type failed!");
            //Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionManager.closeAll(conn, pstm, rs);
        }

        return listRoomType;
    }

    public static List<Room> searchRooms(String roomid, String roomtype, String status) {
        List<Room> listRoom = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("select * from ROOMS,ROOMTYPES where STATUS like '%" + status + "%' and ROOMTYPES.TYPE_NAME like N'%" + roomtype + "%' and ROOM_ID like '%" + roomid + "%' and ROOMS.TYPE_ID=ROOMTYPES.TYPE_ID");
            //pstm.setString(1, status);
            //pstm.setString(2, roomtype);
            //pstm.setString(3, roomid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                listRoom.add(new Room(rs.getString("ROOM_ID"), rs.getString("TYPE_NAME"), rs.getBoolean("STATUS")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionManager.closeAll(conn, pstm, rs);
        }

        return listRoom;
    }

    public static boolean insertNewRoom(Room r) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int rs = 0;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("insert into ROOMS(ROOM_ID,TYPE_ID,STATUS) values (?,?,?)");
            pstm.setString(1, r.getROOM_ID());
            pstm.setInt(2, Integer.parseInt(r.getTYPE_ID()));
            pstm.setBoolean(3, r.isSTATUS());
            rs=pstm.executeUpdate();
            if(rs==0) return false;
        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionManager.closeAll(conn, pstm, null);
        }
        return true;
    }
    
    public static boolean updateRoom(Room r){
        Connection conn = null;
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("update ROOMS set TYPE_ID=?,STATUS=? where ROOM_ID=?");
            pstm.setString(3, r.getROOM_ID());
            pstm.setInt(1, Integer.parseInt(r.getTYPE_ID()));
            pstm.setBoolean(2, r.isSTATUS());
            rs=pstm.executeUpdate();
            if(rs==0) return false;
        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionManager.closeAll(conn, pstm, null);
        }
        return true;
    }
    
    public static boolean deleteRoomByID(String id){
        Connection conn = null;
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("delete from ROOMS where ROOM_ID=?");
            pstm.setString(1, id);
            rs=pstm.executeUpdate();
            if(rs==0) return false;
        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            ConnectionManager.closeAll(conn, pstm, null);
        }
        return true;
    }

    public static Vector convertRoomToVector(Room r) {
        Vector v = new Vector();
        v.add(r.getROOM_ID());
        v.add(r.getTYPE_ID());
        if (r.isSTATUS()) {
            v.add("Có thể sử dụng");
        } else {
            v.add("Không thể sử dụng");
        }
        return v;
    }

}
