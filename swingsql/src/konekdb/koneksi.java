/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konekdb;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author herkel 
 */
public class koneksi {
    Connection cn;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/pabrik","root","");
            return cn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            return null;
        }
    }
    
}
