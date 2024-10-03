
package finanzasapp.modelos;

import finanzasapp.modelos.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    
    public static Object[][] verGastos(String mm, String yyyy) {
       List<Object> ingresos = new ArrayList<>();
       String sql = "SELECT dia, mes, anio, monto, descripcion, " +
               "CASE mes " +
               "WHEN 'Enero' THEN 1 " +
               "WHEN 'Febrero' THEN 2 " +
               "WHEN 'Marzo' THEN 3 " +
               "WHEN 'Abril' THEN 4 " +
               "WHEN 'Mayo' THEN 5 " +
               "WHEN 'Junio' THEN 6 " +
               "WHEN 'Julio' THEN 7 " +
               "WHEN 'Agosto' THEN 8 " +
               "WHEN 'Septiembre' THEN 9 " +
               "WHEN 'Octubre' THEN 10 " +
               "WHEN 'Noviembre' THEN 11 " +
               "WHEN 'Diciembre' THEN 12 " +
               "END AS mes_numero " +
               "FROM gasto " +
               "WHERE mes = ? AND anio = ? " +
               "ORDER BY anio DESC, mes_numero DESC, dia DESC;";

        try (Connection conn = Conexion.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mm);
            stmt.setString(2, yyyy);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int dia = rs.getInt("dia");
                String mes = rs.getString("mes");
                int anio = rs.getInt("anio");
                double monto = rs.getDouble("monto");
                String descripcion = rs.getString("descripcion");
                String fecha = dia + "-" + mes + "-" + anio; 
                ingresos.add(new Object[]{monto, descripcion, fecha});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Object[][] movimientosArray = new Object[ingresos.size()][];
        movimientosArray = ingresos.toArray(movimientosArray); 
        return movimientosArray;
    }
    
}
