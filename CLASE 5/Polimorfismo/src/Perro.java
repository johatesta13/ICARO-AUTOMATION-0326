public class Perro extends Animal {


    public Perro() {
        super();
    }

    public Perro(String nombre, Integer edad) {
        super(nombre,edad);
    }

    @Override
    public String Comunicarse(){
        return "Ladrando...";
    }

}