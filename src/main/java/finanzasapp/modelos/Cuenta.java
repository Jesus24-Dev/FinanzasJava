
package finanzasapp.modelos;

import finanzasapp.modelos.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cuenta {
    protected final int id_cuenta;
    protected double saldo_actual;

    public Cuenta(int id_cuenta, double saldo_actual) {
        this.id_cuenta = id_cuenta;
        this.saldo_actual = saldo_actual;
    }

   public static double obtenerSaldo() {
    String sql = "SELECT saldo_actual FROM cuenta WHERE id_cuenta = 1";
    double saldo = 0;
    try (Connection conn = Conexion.connect();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
            saldo = rs.getDouble("saldo_actual");
        } 
    } catch (SQLException e) {
        e.printStackTrace(); // Muestra la excepción si ocurre un error
    }
    return saldo;
}

   
   
    
}
