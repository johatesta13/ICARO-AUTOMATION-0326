package ar.org.icaro;

import org.testng.Assert;
import org.testng.annotations.*;

public class MatematicaTest {

      @Test
    public void ValidarSumarDosPositivos(){
          int resultado = Matematica.Suma(5,8);
          Assert.assertEquals(resultado,13,"SE ESPERABA QUE EL RESULTADO SEA 13");

      }

      @Test
      public void ValidarSumarCero(){
          int resultado = Matematica.Suma(1,0);
          Assert.assertEquals(resultado,2,"se esperaba que al sumar 0 de el mismo numero");
      }

      @Test
    public void ValidarRestaDelMismoNumero(){
          int resultado = Matematica.Suma(5,5);

          Assert.assertEquals(resultado,0,"Se esperaba que el resultado de un numero restado por el mismo de 0");
      }
}
