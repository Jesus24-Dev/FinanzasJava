
package finanzasapp.modelos.conexion;

import java.sql.*;

public class Conexion {
    String url = "jdbc:sqlite:finanzas.db";
    Connection conn = null;
    
    public Conexion() throws SQLException{
        this.conn = DriverManager.getConnection(this.url);
    }
}
