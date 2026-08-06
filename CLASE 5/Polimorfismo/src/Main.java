public class Main{

    public static void main() {
        Perro max = new Perro("Max",3);

        Gato michi = new Gato("Michi",4);


        //IMPRIMIR UTILIZANDO EL METODO SOBREESCRITO

        System.out.println("El perro: " + max.getNombre() + " dice " + max.Comunicarse());
        System.out.println("El gato: " + michi.getNombre() + " dice " + michi.Comunicarse());


        //POLIMORFISMO

        Animal animal1 = new Perro("Firulais", 4);
        Animal animal2 = new Gato("Garfield",5);

        System.out.println("ANIMAL 1: " + animal1.Comunicarse());
        System.out.println("ANIMAL 2: " + animal2.Comunicarse());

        Animal animal3 = new Animal("Paloma",3);
        System.out.println("ANIMAL 3: " + animal3.Comunicarse());






    }


}//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
