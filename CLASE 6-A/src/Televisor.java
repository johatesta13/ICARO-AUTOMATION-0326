public class Televisor implements Encendible {

    String Marca;
    boolean encendido;

    public Televisor(String marca) {
        this.Marca = marca;
        this.encendido= false;

    }

    @Override
    public void encender(){
        this.encendido=true;
        System.out.println( "Televisor de " + Marca + " encendida..");
    }

    @Override
    public void apagar(){
        this.encendido=false;
        System.out.println("Televisor de " + Marca + " apagada");
    }



}
