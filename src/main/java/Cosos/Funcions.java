package Cosos;
public class Funcions {
    public boolean comprobar(int a){
        boolean comprobar;
        if( a <= 0){
            comprobar = true;
            System.out.println("El valor " + a + " es menor o igual a 0 : " + comprobar);
        }else{
            comprobar = false;
            System.out.println("El valor " + a + " es menor o igual a 0 : " + comprobar);
        }
        return comprobar;
    }
}
