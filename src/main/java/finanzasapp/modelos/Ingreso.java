
package finanzasapp.modelos;

import finanzasapp.modelos.conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Ingreso {

    public int id_cuenta;
    public String dia;
    public String mes;
    public String anio;
    public String descripcion;
    public double monto;

    public Ingreso(int id_cuenta, String dia, String mes, String anio, String descripcion, double monto) {
        this.id_cuenta = id_cuenta;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.descripcion = descripcion;
        this.monto = monto;
    }
    
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
    
    public static Object[][] verIngresos(String mm, String yyyy) {
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
               "FROM ingreso " +
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
    
    public void eliminarIngreso(){
        String sql = "DELETE FROM ingreso WHERE id_cuenta = ? " +
                "AND dia = ? AND mes = ? AND anio = ? AND descripcion = ? AND monto = ?";
        String sql2 = "UPDATE cuenta SET saldo_actual = saldo_actual - ?";
         try (Connection conn = Conexion.connect();
             PreparedStatement stmt = conn.prepareStatement(sql);
             PreparedStatement stmt2 = conn.prepareStatement(sql2)) {
             conn.setAutoCommit(false);
             
             stmt.setInt(1, this.id_cuenta);
             stmt.setString(2, this.dia);
             stmt.setString(3, this.mes);
             stmt.setString(4, this.anio);
             stmt.setString(5, this.descripcion);
             stmt.setDouble(6, this.monto);
             
             
             stmt2.setDouble(1, this.monto);
             stmt.executeUpdate();
             stmt2.executeUpdate();
             conn.commit();
         } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void editarIngreso(String dia, String mes, String anio, double monto, String descripcion, String diaViejo, String mesViejo, String anioViejo, double montoViejo, String descripcionVieja){
        String sql = "UPDATE ingreso SET dia = ?, mes = ?, anio = ?, monto = ?, descripcion = ? " +
                "WHERE dia = ? AND mes = ? AND anio = ? AND monto = ? AND descripcion = ?";
        String sql2 = "UPDATE cuenta SET saldo_actual = saldo_actual - ?";
        String sql3 = "UPDATE cuenta SET saldo_actual = saldo_actual + ?";
        
         try (Connection conn = Conexion.connect();
             PreparedStatement stmt = conn.prepareStatement(sql);
             PreparedStatement stmt2 = conn.prepareStatement(sql2);
             PreparedStatement stmt3 = conn.prepareStatement(sql3)) {
             conn.setAutoCommit(false);
             
             stmt.setString(1, dia);
             stmt.setString(2, mes);
             stmt.setString(3, anio);
             stmt.setDouble(4, monto);   
             stmt.setString(5, descripcion);
             stmt.setString(6, diaViejo);
             stmt.setString(7, mesViejo);
             stmt.setString(8, anioViejo);
             stmt.setDouble(9, montoViejo);   
             stmt.setString(10, descripcionVieja); 
             
             
             stmt2.setDouble(1, montoViejo);
             stmt3.setDouble(1, monto);
             
             stmt.executeUpdate();
             stmt2.executeUpdate();
             stmt3.executeUpdate();
             conn.commit();
         } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
