import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private final List<Producto> productos=new ArrayList<>();
    public void agregarProducto(Producto p){ productos.add(p); }

    public double calcularTotal(){
        double total=0;
        for(Producto p:productos){ total+=p.getPrecio(); }
        return total;
    }
    public double calcularTotalConDescuento(Descuento descuento){
        return descuento.aplicarDescuento(calcularTotal());
    }
}