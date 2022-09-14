package comparacion ;
import java.util.Scanner;
public class Comparacion {
    public static void main ( String [ ] args ) {
        // TODO code application logic here
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner ( System.in ) ;
        int numerol ; // primer número a comparar
        int numero2 ; // segundo número a comparar
        System.out.print ( " Escriba el primer entero : " ) ; // indicador
        numerol = entrada.nextInt ( ) ; // lee el primer número del usuario
        System.out.print ( " Escriba el segundo entero : " ) ; // indicador
        numero2 entrada.nextInt ( ) ; // lee el segundo número del usuario
        if ( numerol numero2 )
        System.out.println ( " El numero " + numerol + " es igual a " + numero2 ) ;
        if ( numerol ! = numero2 )
        System.out.println ( " El numero + numerol + es distinto a " + numero2 ) ;
        if ( numerol < numero2 )
        System.out.println ( " El numero + numerol + " es menor a
        if ( numerol > numero2 )
        System.out.println ( " El numero " 1 numerol + " es mayor a
                                                                    + numero2 ) ;
        if ( numerol > = numero2 )
        System.out.println ( " El numero " + numerol + numero2 ) ;
        if ( numerol < = numero2 )
        System.out.println ( " El numero + numerol + " es menor o igual a " + numero2 ) ;
                                                       es mayor o igual a " + numero2 ) ;
                            }}
