
public class Main {
    public static void main(String[] args) {
        // POLIMORFISMO: una lista de MedioDePago que contiene distintos tipos
        MedioDePago[] pagos = {
                new TarjetaCredito("Johana", 30000, 3),
                new Efectivo("Carlos", 15000),
                new MercadoPago("Ana", 8000, "ana.mp")
        };

        System.out.println("=== Sobreescritura (Override) ===");
        for (MedioDePago pago : pagos) {
            pago.procesarPago(); // Java decide en RUNTIME qué versión ejecutar
        }



        System.out.println("\n=== Sobrecarga (Overload) ===");
        TarjetaCredito tc = new TarjetaCredito("Johana", 50000, 3);
        tc.procesarPago();                          // sin parámetros
        tc.procesarPago(5000);                       // con un parámetro
        tc.procesarPago(2000, "Ajuste por interés");  // con dos parámetros
    }
}