/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author My PC
 */
public class ConnectionManager {

    public static Connection getConnection() {
        Connection conn = null;

        BufferedReader bf = null;
        String line;
        String[] props = null;
        try {
            File f = new File("connection.txt");
            bf = new BufferedReader(new FileReader(f));
            line = bf.readLine();
            props = line.split(",");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Cannot load the connection settings");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot load the connection settings");
        } finally {
            try {
                bf.close();
            } catch (IOException ex) {
            }
        }

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //System.out.println("jdbc:sqlserver://"+props[0]+"\\"+props[1]+":"+props[2]+";username="+props[3]+";password="+props[4]+";databasename="+props[5]);
            conn = DriverManager.getConnection("jdbc:sqlserver://"+props[0]+"\\"+props[1]+":"+props[2]+";username="+props[3]+";password="+props[4]+";databasename="+props[5]);
//            conn=DriverManager.getConnection("jdbc:sqlserver://localhost\\VuDucCanh:1433;databasename=Project", "sa", "1234567");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ok");
        return conn;
    }
    
    public static void closeAll(Connection conn,PreparedStatement pstm,ResultSet rs){
        if(conn!=null) try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(pstm!=null) try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(rs!=null) try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        getConnection();
    }
}
