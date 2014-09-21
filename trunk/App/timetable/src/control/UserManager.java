/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */


public class UserManager {

    private static int result;

    public static List<User> SelectAllUsers() {
        List<User> list = new ArrayList<>();
        String sql = "Select * FROM USERS ORDER BY ID";
        try {

            Connection conn = ultility.ConnectionManager.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User item = new User();
                item.setENAME(rs.getString("ENAME"));
                item.setADDRESS(rs.getString("ADDRESS"));
                item.setADMIN(rs.getBoolean("ADMIN"));
                item.setID(rs.getString("ID"));
                item.setPASSWORD(rs.getString("PASSWORD"));
                item.setPHONE(rs.getInt("PHONE"));
                item.setUSERNAME(rs.getString("USERNAME"));
                list.add(item);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static boolean DeleteUser(String ID) {

        String sql = "DELETE FROM USERS WHERE ID =?";
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

    public static User GetUserByUsername(String user) {
        User item = new User();
        String sql = "Select * FROM USERS where USERNAME=?";
        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                item.setENAME(rs.getString("ENAME"));
                item.setADDRESS(rs.getString("ADDRESS"));
                item.setADMIN(rs.getBoolean("ADMIN"));
                item.setID(rs.getString("ID"));
                item.setPASSWORD(rs.getString("PASSWORD"));
                item.setPHONE(rs.getInt("PHONE"));
                item.setUSERNAME(rs.getString("USERNAME"));
            }
        } catch (Exception e) {
        }
        return item;

    }
}