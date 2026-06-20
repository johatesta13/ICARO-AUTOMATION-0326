public class PracticaGuiada7 {

    public static void main(){

        int a = 15;
        int b= 4;

        System.out.println("SUMA:  " + (a+b));
        System.out.println("RESTA:  " + (a-b));
        System.out.println("MULTIPLICACION:  " + (a*b));
        System.out.println("DIVISION:  " + (a/b));
        System.out.println("MODULO:  " + (a%b));


        //RELACIONALES

        System.out.println("a > b "  + (a > b));
        System.out.println("a == b "  + (a == b));
        System.out.println("a != b "  + (a != b));


        //LOGICOS

        System.out.println("Operadores logicos");

        boolean esmayorque0 = a > 0;

        boolean esmenorque100 = a < 100 ;

        boolean esiguala16 = a == 16;

        System.out.println(esmayorque0 && esmenorque100);

        System.out.println(esmayorque0 && esiguala16);

        System.out.println(esmayorque0 || esiguala16);






    }

}
