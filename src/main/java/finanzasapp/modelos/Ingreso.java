
package finanzasapp.modelos;

public class Ingreso {
    private int id_ingreso;
    private int id_cuenta;
    private String fecha;
    private String descripcion;
    private double monto;

    public Ingreso(int id_ingreso, int id_cuenta, String fecha, String descripcion, double monto) {
        this.id_ingreso = id_ingreso;
        this.id_cuenta = id_cuenta;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public int getId_ingreso() {
        return id_ingreso;
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
