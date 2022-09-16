/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package filmhallms;

/**
 *
 * @author HP
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
Connection conn;

public Connection Connect(){

try{
    
   String dbPath=("jdbc:mysql://localhost:3306/regal?zeroDateTimeBehavior=CONVERT_TO_NULL");
   conn = DriverManager.getConnection(dbPath, "root", "");
          

}

catch (SQLException e) {

JOptionPane.showMessageDialog(null, e);
    
}
return conn; 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
