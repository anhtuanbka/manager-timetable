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
import java.util.logging.Level;
import java.util.logging.Logger;
import ultility.ConnectionManager;

/**
 *
 * @author My PC
 */
public class CheckLogin {

    public static boolean check(String user, String pass) {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            pstm = conn.prepareStatement("select * from USERS where USERNAME=? and PASSWORD=?");
            pstm.setString(1, user);
            pstm.setString(2, pass);
            rs=pstm.executeQuery();
            while (rs.next()) {                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CheckLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
