package ar.org.icaro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginSauceDemo {


    private WebDriver driver;
    private static final String BASE_URL ="https://www.saucedemo.com/";
    private static final String USUARIO_STANDARD = "standard_user";
    private static final String USUARIO_BLOQUEADO = "locked_out_user";
    private static final String PASSWORD_CORRECTO = "secret_sauce";
    private static final String PASSWORD_INCORRECTO = "secret_sau";



    @BeforeClass
    public void SetUp(){


        //WEBdriver  manager descarga automaticamente la version de chrome que tenemos instalada

        WebDriverManager.chromedriver().setup();


        //Crear una instancia del chrome driver
        //Esto abre una ventana de chrome

        driver = new ChromeDriver();

        driver.manage().window().maximize();



    }



    @BeforeMethod
    public void irAlogin(){
        driver.get(BASE_URL);
    }


    @Test
    public void loginExitoso(){

        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys(USUARIO_STANDARD);

        WebElement campoContraseña = driver.findElement(By.id("password"));
        campoContraseña.sendKeys(PASSWORD_CORRECTO);

        WebElement botonLogin= driver.findElement(By.id("login-button"));

        botonLogin.click();

        String urlActual= driver.getCurrentUrl();

        Assert.assertNotNull(urlActual);

        Assert.assertTrue(urlActual.contains("inventory.html"),"Luego del login deberia estar en la pag de inventario");


        System.out.println("Ingreso correctamete a la pagina");
    }

    @Test
    public void LoginConCredencialesInvalidas(){
        driver.findElement(By.id("user-name")).sendKeys(USUARIO_STANDARD);
        driver.findElement(By.id("password")).sendKeys(PASSWORD_INCORRECTO);
        driver.findElement(By.id("login-button")).click();

        WebElement contenedorError = driver.findElement(By.className("error-message-container"));

        Assert.assertTrue(contenedorError.isDisplayed(), "Deberia arrojar mensaje de error");

        String urlActual = driver.getCurrentUrl();

        Assert.assertFalse(urlActual.contains("inventory.html"),"No deberia haber navegado a inventory");


        System.out.println("Credenciales invalidas, el mensaje de error fue mostrado");

    }






    @AfterClass
    public void tearDown() throws InterruptedException{

        Thread.sleep(3000);
        if (driver != null){
            driver.quit();
            System.out.println("Navegador cerrado correctamente");
        }
    }
}
