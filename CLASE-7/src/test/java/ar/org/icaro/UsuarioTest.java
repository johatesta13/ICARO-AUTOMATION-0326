package ar.org.icaro;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsuarioTest {

    private Usuario usuario;


    @BeforeMethod
    public void SetUp(){
       usuario = new Usuario("Juan","password123");
    }


    //Login exitoso con la pass correcta

    @Test
    public void ValidarInicioDeSesion(){
        boolean resultado = usuario.login("password123");
        Assert.assertTrue(resultado,"Login con password correcta deberia ser True");
        Assert.assertTrue(usuario.isEstaLogueado(),"Usuario deberia estar logueado despues de iniciar sesion");


    }

    //Login fallido con credenciales invalidas

    @Test
    public void ValidarQueNoInicieSesionConCredencialesInvalidas(){

        boolean resultad = usuario.login("111111111");

        Assert.assertFalse(resultad, "No deberia iniciar sesion con credenciales invalidas");

        Assert.assertFalse(usuario.isEstaLogueado(), "No deberia iniciar sesion con credenciales invalidas");
    }


    @Test
    public void PasswordCortaNoEsValida(){

        Usuario usuario1 = new Usuario("pedro","abd");

        Assert.assertFalse(usuario1.esValido(),"Usuario con contraseña invalida deberia fallar");


    }

    @Test
    public void verificarGetUserName(){

        String usuario1 = usuario.getUsername();
        Assert.assertEquals(usuario1,"Juan","El nombre deberia ser el instanciado (Juan)");

    }

}
