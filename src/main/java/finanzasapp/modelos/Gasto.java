
package finanzasapp.modelos;

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

    public int getId_gasto() {
        return id_gasto;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
