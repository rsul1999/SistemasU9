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
    public String tartamudeo(String palabra){
        char[] letra = new char[2];
        letra[0] = palabra.charAt(0);
        letra[1] = palabra.charAt(1);
        System.out.println(""+ letra[0] +letra[1]+"... "+ letra[0]+ letra[1] + "... " + palabra +"?");
        return palabra;
    }
    //Funcion de regalo de tazas
    public int tazas(int tazas){
        int numero = 6;
        int dividir = tazas/6;
            int resultado = tazas + dividir;
            System.out.println("Usted comrpo "+tazas +" tazas, pero le regalamos "+ dividir + " tazas, en total tiene : " + resultado + " tazas");
        return tazas;
    }
    //Funcion de leer las palabras de una oracion
    public String leer(String palabra){
        StringTokenizer st = new StringTokenizer(palabra);
        System.out.println("La frase : '" + palabra + "', tiene : "+ st.countTokens() + " palabras");
        return palabra;
    }
}
