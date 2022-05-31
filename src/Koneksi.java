
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author D15kY
 */
public class Koneksi {
    String dbUrl = "jdbc:mysql://localhost/aslab_db";
    String dbUsername = "root";
    String dbPassword = "";
   
    Connection konek;
    
    public Koneksi() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            konek = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
            System.out.println("Koneksi Berhasil");
        } catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
        
    }
}
