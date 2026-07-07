public class Animal {

    protected String nombre;
    protected Integer edad;


    public Animal() {
    }

    public Animal(String nombre, Integer edad) {

        this.nombre = nombre;
        this.edad = edad;
    }


    //METODO POLIMORFICO

    public String Comunicarse(){
        return "El animal se esta comunicando...";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}
