
public class Cupon10 implements Descuento{
    @Override
    public double aplicarDescuento(double total){
        return total*0.90;
    }
}