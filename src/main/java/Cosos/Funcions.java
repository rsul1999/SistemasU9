package Cosos;

import java.util.StringTokenizer;

public class Funcions {
    //Funcion para comprobar si un numero es menor o igual a 0
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
    //Funcion de tartamudo
    
    //Funcion de regalo de tazas
    
    //Funcion de leer las palabras de una oracion
    public String leer(String palabra){
        StringTokenizer st = new StringTokenizer(palabra);
        System.out.println("La frase : '" + palabra + "', tiene : "+ st.countTokens() + " palabras");
        return palabra;
    }
}
