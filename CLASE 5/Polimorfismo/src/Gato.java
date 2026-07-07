public class Gato extends Animal{

    public Gato() {
        super();
    }

    public Gato(String nombre, Integer edad) {
        super(nombre,edad);
    }

    @Override
    public String Comunicarse(){
        return "Maullando...";
    }
}
