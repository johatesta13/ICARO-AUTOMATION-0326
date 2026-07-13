
public class Main {
    public static void main(String[] args){
        //PRODUCTOS QUE VOY A AGREGAR AL CARRITO
        Producto leche=new Producto("Leche",2500);
        Producto pan=new Producto("Pan",1800);
        Producto arroz=new Producto("Arroz",3200);


        //iNSTANCIAMOS UN CARRTIO
        Carrito carrito=new Carrito();

        //Utilizamos el metodo agregar carrito que trabaja con listas de productos
        carrito.agregarProducto(leche);
        carrito.agregarProducto(pan);
        carrito.agregarProducto(arroz);



        Descuento descuento=new ClientePremium();
        System.out.println("Total: $"+carrito.calcularTotal());
        System.out.println("Total con descuento: $"+carrito.calcularTotalConDescuento(descuento));
    }
}