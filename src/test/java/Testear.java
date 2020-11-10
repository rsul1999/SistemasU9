import UwU.Funciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Testear {  
    public Testear() {
    }
    Funciones x = new Funciones();
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
       assertEquals("Etto", x.tartamudeo("Etto"));
    }
     @Test
    public void testTartamudo2(){
       assertEquals("Nevera", x.tartamudeo("Nevera"));
    } 
    @Test
    public void testTartamudo3(){
       assertEquals("Mieloso", x.tartamudeo("Mieloso"));
    } 
    @Test
    public void testTazas1(){
       assertEquals(7, x.tazas(6));
    }
     @Test
    public void testTazas2(){
       assertEquals(14, x.tazas(12));
    }
    @Test
    public void testTazas3(){
       assertEquals(248, x.tazas(213));
    }
    @Test
    public void testLeer1(){
       assertEquals(2, x.leer("Dios posh"));
    }
     @Test
    public void testLeer2(){
       assertEquals(3, x.leer("Pastel de queso"));
    }
    @Test
    public void testLeer3(){
       assertEquals(2, x.leer("Hola gamer"));
    }
}
