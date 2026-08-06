public class Main {


    public static void main (){


        Estudiante estudiante1 = new Estudiante(1001,"Johana Testa",7.0f);

        System.out.println("DATOS DEL ESTUDIANTE");

        System.out.println("ID: " + estudiante1.getId());
        System.out.println("Nombre: " + estudiante1.getNombreCompleto());
        System.out.println("Promedio: " + estudiante1.getPromedio());


        Estudiante estudiante2 = new Estudiante(1002,"Joaquin testa",7.0f);

        System.out.println("ID: " + estudiante2.getId());
        System.out.println("Nombre: " + estudiante2.getNombreCompleto());
        System.out.println("Promedio: " + estudiante2.getPromedio());








    }

}