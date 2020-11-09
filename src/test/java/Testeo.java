import Cosos.Funcions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testeo {  
    public Testeo() {
    }
    Funcions x = new Funcions();
    @Test
    public void testComprobar1(){
       assertEquals(true, x.comprobar(0));
    }
     @Test
    public void testComprobar2(){
       assertEquals(false, x.comprobar(7));
    }
    public void testComprobar3(){
       assertEquals(true, x.comprobar(-2));
    }
    
    @Test
    public void testTartamudo1(){
       assertEquals("salero", x.tartamudeo("salero"));
    }
     @Test
    public void testTartamudo2(){
       assertEquals("montaña", x.tartamudeo("montaña"));
    } 
    @Test
    public void testTartamudo3(){
       assertEquals("animal", x.tartamudeo("animal"));
    } 
    @Test
    public void testTazas1(){
       assertEquals(7, x.tazas(6));
    }
     @Test
    public void testTazas2(){
       assertEquals(42, x.tazas(36));
    }
    @Test
    public void testTazas3(){
       assertEquals(12, x.tazas(11));
    }
    @Test
    public void testLeer1(){
       assertEquals(2, x.leer("Dios ayuda"));
    }
     @Test
    public void testLeer2(){
       assertEquals(6, x.leer("No se si esto este bien"));
    }
    @Test
    public void testLeer3(){
       assertEquals(3, x.leer("Hola como estan"));
    }
}
