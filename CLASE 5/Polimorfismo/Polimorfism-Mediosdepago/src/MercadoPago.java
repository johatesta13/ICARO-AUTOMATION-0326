// ===== SUBCLASE 3 =====
class MercadoPago extends MedioDePago {
    private String alias;

    public MercadoPago(String titular, double monto, String alias) {
        super(titular, monto);
        this.alias = alias;
    }

    @Override
    public void procesarPago() {
        System.out.printf("Pago vía MercadoPago (alias: %s) de %s: $%.2f%n",
                alias, titular, monto);
    }
}
