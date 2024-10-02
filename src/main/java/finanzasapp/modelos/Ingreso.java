
package finanzasapp.modelos;

import finanzasapp.modelos.conexion.Conexion;
import java.sql.*;

public class Ingreso {

    private int id_ingreso;
    private int id_cuenta;
    private String fecha;
    private String descripcion;
    private double monto;
    
    public static void guardarIngreso(String dia, String mes, String anio, String descripcion, double monto){
        String sql1 = "INSERT INTO ingreso (id_cuenta, dia, mes, anio, descripcion, monto) VALUES (?, ?, ?, ?, ?, ?)";
        String sql2 = "UPDATE cuenta SET saldo_actual = saldo_actual + ?";
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
  
    public static void verIngresos(){
        String sql = "SELECT fecha, descripcion, monto FROM ingreso WHERE id_cuenta = ?";
        try (Connection conn = Conexion.connect();
            Statement stmt = conn.createStatement();
            PreparedStatement psmt = conn.prepareStatement(sql) ){     
            psmt.setInt(1, 1);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                
                String fecha = rs.getString("fecha");
                String descripcion = rs.getString("descripcion");
                double monto = rs.getDouble("monto");
                
                System.out.println("Fecha: " + fecha + "\nDescripcion: " + descripcion + "\nMonto: " + monto);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
