import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class PracticaGuiada6 {

    public static void main(){


        //Array

        int [] numeros = {10, 20, 30};

        System.out.println("Array");
        System.out.println("Posicion 0: " + numeros[0]);
        System.out.println("Posicion 1: " + numeros[1]);
        System.out.println("Posicion 2: " + numeros[2]);
        System.out.println("Longitud del array: " + numeros.length);


        //Lista (tamaño dinamico)

        List<Integer> lista = new ArrayList<>();

        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(10);

        System.out.println("Lista");
        System.out.println("Lista completa: " + lista);
        System.out.println("Tamaño de la lista" + lista.size());
        System.out.println("Primer elemento: " + lista.get(0));



        //ELiminar elementos

        lista.remove(Integer.valueOf(200));
        System.out.println("Lista completa: " + lista);












    }
}
