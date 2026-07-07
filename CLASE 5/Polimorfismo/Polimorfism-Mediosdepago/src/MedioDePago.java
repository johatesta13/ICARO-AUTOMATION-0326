// ===== CLASE BASE (padre) =====
public abstract class MedioDePago {
    protected String titular;
    protected double monto;

    public MedioDePago(String titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }

    // Método que será SOBREESCRITO (override) por cada subclase
    public void procesarPago() {
        System.out.println("Procesando pago genérico de $" + monto);
    }

    // SOBRECARGA (overload) dentro de la misma clase: mismo nombre, distintos parámetros
    public void procesarPago(double montoExtra) {
        this.monto += montoExtra;
        System.out.println("Se agregó un extra de $" + montoExtra);
        procesarPago(); // reutiliza el método sin parámetros
    }

    public void procesarPago(double montoExtra, String motivo) {
        System.out.println("Motivo del extra: " + motivo);
        procesarPago(montoExtra);
    }



}

