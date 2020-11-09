package Cosos;
public class Probar {
    public static void main(String[] args){
        Funcions x = new Funcions();
        //Imprimir funcion comprobar
         System.out.println("Funcion de comprobar\n");
        x.comprobar(7);
        x.comprobar(0);
        x.comprobar(-2);
        //Imprimir Funcion tartamudo
        System.out.println("\nFuncion de tartamudo\n");
        
        //Imprimir Funcion regalo de tazas
        System.out.println("\nFuncion de regalo de tazas\n");
        
        //Imprimir Funcion leer
        System.out.println("\nFuncion de leer palabras\n");
        x.leer("Hola como estan");
        x.leer("No se si esto este bien");
        x.leer("Dios ayuda");
    }
}
