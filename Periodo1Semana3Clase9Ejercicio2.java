package comparacion ;
import java.util.Scanner ;
public class Comparacion {
     public static void main ( String [ ] args ) {
           
            Scanner entrada = new Scanner ( System.in ) ;
                       
            int numerol ;
            int numero2 ; 
                       
            System.out.print ( " Escriba el primer entero : " ) ;
            numerol = entrada.nextInt ( ) ; 
                       
            System.out.print ( " Escriba el segundo entero : " ) ;
            numero2 = entrada.nextInt () ;
                       
            if ( numerol == numero2 )
            System.out.println ( " El numero" + numerol + " es igual a " + numero2);
                       
            if ( numerol ! = numero2 )
            System.out.println ( " El numero " + numerol + " es distinto a " + numero2);
                       
            if ( numerol < numero2 )
            System.out.println ( " El numero " + numerol + " es menor a " + numero2);
                       
            if ( numerol > numero2 )
            System.out.println ( " El numero " + numerol + " es mayor a " + numero2);
                       
            if ( numerol < = numero2 )
            System.out.println ( " El numero " + numerol + " es menor o igual a" + numero2);
                       
            if ( numerol > = numero2 )   
            System.out.println ( " El numero " + numerol + " es mayor o igual a " + numero2);
     }                  
}    
