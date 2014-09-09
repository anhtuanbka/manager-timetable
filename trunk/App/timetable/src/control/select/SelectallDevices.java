/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.select;

import model.Device;
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
public class SelectallDevices {

    public List<Device> SelectallDevices() throws SQLException {
        List<Device> DeviceList = new ArrayList<>();
        String sql = "SELECT * FROM DEVICES";
        try {
            Connection cn = ConnectionManager.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Device device = new Device();
                device.setCELLING_FANS(rs.getInt("CELLING_FANS"));
                device.setCHAIRS(rs.getInt("CHAIRS"));
                device.setCOMPUTERS(rs.getInt("COMPUTERS"));
                device.setLAMPS(rs.getInt("LAMPS"));
                device.setPROJECTORS(rs.getInt("PROJECTORS"));
                device.setROOM_ID(rs.getString("ROOM_ID"));
                device.setTABLES(rs.getInt("TABLES"));
                DeviceList.add(device);
            }
        } catch (Exception e) {

        }
        return DeviceList;
    }

}
