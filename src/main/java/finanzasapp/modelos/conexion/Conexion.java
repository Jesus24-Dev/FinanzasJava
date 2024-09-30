
package finanzasapp.modelos.conexion;

import java.sql.*;

public class Conexion {
    private static String url = "jdbc:sqlite:finanzas.db";
    private static Connection conn;
    
    public static Connection connect () {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            return null;
        }
        return conn;
    }
}
