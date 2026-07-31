package ar.org.icaro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PrimerTestSelenium {


    //SE declara la variable que vamos a usar para iniciar el navegador

    private WebDriver driver;


    @BeforeClass
    public void SetUp(){


        //WEBdriver  manager descarga automaticamente la version de chrome que tenemos instalada

        WebDriverManager.chromedriver().setup();


        //Crear una instancia del chrome driver
        //Esto abre una ventana de chrome

        driver = new ChromeDriver();

        driver.manage().window().maximize();



    }

    @Test
    public void navegarASauceDemo(){


        driver.get("https://www.saucedemo.com/");

        String titulo = driver.getTitle();


        Assert.assertEquals(titulo,"Swag Labs","El titulo no es el esperado");

        System.out.println("Navegamos correctamente a SauceDemo");
        System.out.println("Titulo de la pagina" + titulo);


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
