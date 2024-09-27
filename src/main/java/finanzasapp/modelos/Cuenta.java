
package finanzasapp.modelos;

public class Cuenta {
    protected final int id_cuenta;
    protected double saldo_actual;

    public Cuenta(int id_cuenta, double saldo_actual) {
        this.id_cuenta = id_cuenta;
        this.saldo_actual = saldo_actual;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }
    
    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
   
}
