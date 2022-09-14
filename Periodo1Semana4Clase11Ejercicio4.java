package clasell.pkgl ;
import java.util.Scanner ;
public class Clasel11 (
    public static void main ( String [ ] args ) {
        Scanner Entrada = new Scanner ( System.in ) ;
        float notal , nota2 , nota3 , promedio ;
        System.out.println ( " Ingrese la primera nota " ) ;
        notal = Entrada.next Float ( ) ;
        System.out.println ( " Ingrese la primera nota " ) ;
        nota2 = Entrada.nextFloat ( ) ;
        System.out.println ( " Ingrese la primera nota " ) ;
        nota3 = Entrada.nextFloat ( ) ;
        promedio = ( notal + nota2 + nota3 ) / 3 ;
        System.out.println ( " El promedio es : " + promedio ) ;
        if ( promedio > = 7 ) {
            System.out.println ( " Promocionado " ) ;
        } else if ( promedio > = 4 ) {
            System.out.println ( " Regular " ) ;
        } else {
            System.out.println ( " Reprobado " ) ;
        }
    }
}  
