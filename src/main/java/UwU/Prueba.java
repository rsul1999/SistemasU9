package UwU;
public class Prueba {
    public static void main(String[] args){
        Funciones x = new Funciones();
    //Imprimir funcion comprobacion
         System.out.println("Funcion de comprobación\n");
        x.comprobar(4);
        x.comprobar(0);
        x.comprobar(-2);  
    //Imprimir Funcion tartamudear
        System.out.println("\nFuncion de tartamudear\n");
        x.tartamudeo("Etto");
        x.tartamudeo("Nevera");
        x.tartamudeo("Mieloso");
        
    //Imprimir Funcion regalar tazas
        System.out.println("\nFuncion de regalar tazas\n");
        x.tazas(6);
        x.tazas(14);
        x.tazas(248);
    //Imprimir Funcion leer
        System.out.println("\nFuncion de leer\n");
        x.leer("Hola gamer");
        x.leer("Pastel de queso");
        x.leer("Dios posh");
    }
}
