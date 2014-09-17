/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultility.ConnectionManager;

/**
 *
 * @author VuDucCanh
 */
public class DeleteRoomType {
    private static int result;
     public static boolean DeleteRoomType(String ID) {
        try {
            String sql = "DELETE FROM ROOMTYPES WHERE TYPE_ID =?";
            Connection conn = ConnectionManager.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            result = ps.executeUpdate();
            if (result > 0) {   
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DeleteRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
