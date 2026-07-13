public class Main {

    public static void main(String[] args) {

        LoginService login = new LoginService();

        try {

            login.iniciarSesion("admin", "12345");

        } catch (LoginException e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("El programa continúa ejecutándose.");
    }
}
