
package finanzasapp.modelos;

import finanzasapp.modelos.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

   public static Object[][] mostrarUltimosMovimientos() {
       List<Object> ultimosMovimientos = new ArrayList<>();
        String sql = "SELECT dia, mes, anio, monto, descripcion, 'INGRESO' AS tipo, " +
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
                 "END AS mes_numero FROM ingreso " +
                 "UNION " +
                 "SELECT dia, mes, anio, monto, descripcion, 'GASTO' AS tipo, " +
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
                 "END AS mes_numero FROM gasto " +
                 "ORDER BY anio DESC, mes_numero DESC, dia DESC " +
                 "LIMIT 10";

        try (Connection conn = Conexion.connect();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int dia = rs.getInt("dia");
                String mes = rs.getString("mes");
                int anio = rs.getInt("anio");
                double monto = rs.getDouble("monto");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                String fecha = dia + "-" + mes + "-" + anio; 
                ultimosMovimientos.add(new Object[]{tipo, monto, descripcion, fecha});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Object[][] movimientosArray = new Object[ultimosMovimientos.size()][];
        movimientosArray = ultimosMovimientos.toArray(movimientosArray); 
        return movimientosArray;
    }

   public static Object[][] mostrarTodosMovimientos(String mm, String yyyy) {
       List<Object> ultimosMovimientos = new ArrayList<>();
        String sql = "SELECT dia, mes, anio, monto, descripcion, 'INGRESO' AS tipo, " +
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
                 "END AS mes_numero FROM ingreso WHERE mes = ? AND anio = ?" +
                 "UNION " +
                 "SELECT dia, mes, anio, monto, descripcion, 'GASTO' AS tipo, " +
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
                 "END AS mes_numero FROM gasto WHERE mes = ? AND anio = ?" +
                 "ORDER BY anio DESC, mes_numero DESC, dia DESC ";

        try (Connection conn = Conexion.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, mm);
            stmt.setString(2, yyyy);
            stmt.setString(3, mm);
            stmt.setString(4, yyyy);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int dia = rs.getInt("dia");
                String mes = rs.getString("mes");
                int anio = rs.getInt("anio");
                double monto = rs.getDouble("monto");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                String fecha = dia + "-" + mes + "-" + anio; 
                ultimosMovimientos.add(new Object[]{tipo, monto, descripcion, fecha});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Object[][] movimientosArray = new Object[ultimosMovimientos.size()][];
        movimientosArray = ultimosMovimientos.toArray(movimientosArray); 
        return movimientosArray;
    }
   
    public static void eliminarCuenta() {
        String sql1 = "DELETE FROM ingreso";
        String sql2 = "DELETE FROM gasto";
        String sql3 = "UPDATE cuenta SET saldo_actual = 0";
        String sql4 = "VACUUM";

        try (Connection conn = Conexion.connect();
             PreparedStatement stmt = conn.prepareStatement(sql1);
             PreparedStatement stmt2 = conn.prepareStatement(sql2);
             PreparedStatement stmt3 = conn.prepareStatement(sql3)) {

            conn.setAutoCommit(false);

            stmt.executeUpdate();
            stmt2.executeUpdate();
            stmt3.executeUpdate();

            conn.commit();  // Finalizamos la transacción

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Ejecutamos VACUUM fuera de la transacción
        try (Connection conn = Conexion.connect();
             PreparedStatement stmt4 = conn.prepareStatement(sql4)) {
            stmt4.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
