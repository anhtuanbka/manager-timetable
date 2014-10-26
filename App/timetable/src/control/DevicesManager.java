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
import model.Device;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */
public class DevicesManager {

    public static List<Device> getAllDevices() {
        List<Device> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("select * from DEVICES");
            rs = pstm.executeQuery();
            Device d = new Device();
            while (rs.next()) {
                d = new Device(rs.getString("DEVICE_NAME"), rs.getString("DESCRIPTION"));
                d.setDeviceID(rs.getInt("DEVICE_ID"));
                list.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DevicesManager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionManager.closeAll(conn, pstm, rs);
        }

        return list;
    }
    
    public static Device getDeviceByID(int id){
        Device d = new Device();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("select * from DEVICES where DEVICE_ID=?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            d = new Device();
            while (rs.next()) {
                d = new Device(rs.getString("DEVICE_NAME"), rs.getString("DESCRIPTION"));
                d.setDeviceID(rs.getInt("DEVICE_ID"));
                break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DevicesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    
    public static boolean insertNewDevice(Device d) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int rs = 0;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("insert into DEVICES (DEVICE_NAME,DESCRIPTION) values(?,?)");
            pstm.setString(1, d.getDeviceName());
            pstm.setString(2, d.getDescription());
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
    
    public static boolean updateDeviceByID(Device d) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int rs = 0;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("update DEVICES set DEVICE_NAME=?,DESCRIPTION=? where DEVICE_ID=?");
            pstm.setString(1, d.getDeviceName());
            pstm.setString(2, d.getDescription());
            pstm.setInt(3, d.getDeviceID());
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
        
    public static boolean deleteDeviceByID(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        int rs = 0;

        try {
            conn = ConnectionManager.getConnection();
            pstm = conn.prepareStatement("delete from DEVICES where DEVICE_ID=?");
            pstm.setInt(1, id);
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
    
    public static boolean isValidDevice(Device d){
        if(d.getDeviceName()==null||d.getDeviceName().equals("")){
            JOptionPane.showMessageDialog(null, "Device name is null or empty");
            return false;
        }
        
        return true;
    }
    
    public static Vector convertDeviceToVector(Device d) {
        Vector v = new Vector();
        v.add(d.getDeviceID());
        v.add(d.getDeviceName());
        v.add(d.getDescription());
        return v;
    }

}
