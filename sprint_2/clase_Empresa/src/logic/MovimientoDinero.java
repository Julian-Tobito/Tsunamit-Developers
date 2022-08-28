package logic;

public class MovimientoDinero {

    private double transaccion;
    private String concepto;
    private Empleado usuario;

    public MovimientoDinero() {
    }

    public MovimientoDinero(double transaccion, String concepto, Empleado usuario) {

        this.transaccion = transaccion;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public double getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(double transaccion) {
        this.transaccion = transaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "Transacción=" + transaccion +
                ", Concepto='" + concepto + '\'' +
                ", Usuario=" + usuario +
                '}';
    }
}
