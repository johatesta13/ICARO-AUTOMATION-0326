
public class ClientePremium implements Descuento{
    @Override
    public double aplicarDescuento(double total){
        return total*0.85;
    }
}