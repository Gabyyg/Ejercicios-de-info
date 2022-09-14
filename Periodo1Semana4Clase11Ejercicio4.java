import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

        float notal , nota2 , nota3 , promedio ;
        System.out.println ( " Ingrese la primera nota " ) ;
        notal = entrada.nextFloat ( ) ;
        System.out.println ( " Ingrese la segunda nota " ) ;
        nota2 = entrada.nextFloat ( ) ;
        System.out.println ( " Ingrese la tercera nota " ) ;
        nota3 = entrada.nextFloat ( ) ;
        promedio = ( notal + nota2 + nota3 ) / 3 ;
        System.out.println ( " El promedio es : " + promedio ) ;
        if ( promedio >= 7 ) {
            System.out.println ( " Promocionado " ) ;
        } else if ( promedio >= 4 ) {
            System.out.println ( " Regular " ) ;
        } else {
            System.out.println ( " Reprobado " ) ;
        }
    }
}  
