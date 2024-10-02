
package finanzasapp.modelos;

import finanzasapp.modelos.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Gasto {
    private int id_gasto;
    private int id_cuenta;
    private String fecha;
    private String descripcion;
    private double monto;

    public Gasto(int id_gasto, int id_cuenta, String fecha, String descripcion, double monto) {
        this.id_gasto = id_gasto;
        this.id_cuenta = id_cuenta;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
    }
    
    public static void guardarGasto(String dia, String mes, String anio, String descripcion, double monto){
        String sql1 = "INSERT INTO gasto (id_cuenta, dia, mes, anio, descripcion, monto) VALUES (?, ?, ?, ?, ?, ?)";
        String sql2 = "UPDATE cuenta SET saldo_actual = saldo_actual - ?";
        try (Connection conn = Conexion.connect();
            PreparedStatement stmt = conn.prepareStatement(sql1);
            PreparedStatement stmt2 = conn.prepareStatement(sql2)){ 
            conn.setAutoCommit(false);
            stmt.setInt(1, 1);
            stmt.setString(2, dia);
            stmt.setString(3, mes);
            stmt.setString(4, anio);
            stmt.setString(5, descripcion);
            stmt.setDouble(6, monto);
            
            
            stmt2.setDouble(1, monto);
            stmt.executeUpdate();
            stmt2.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
