import java.util.Scanner;
public class Main {
  static Scanner objeto = new Scanner(System.in);
  public static void main(String[] args) {
    
        int valor , conteo = 0 ;
        double suma = 0 ;
        boolean seguir = false ;
        
        while ( ! ( seguir ) )
        {
        System.out.println ( " Ingresar un valor entero , el proceso finalizará cuando ingrese un múltiplo de 8 " );
        valor = objeto.nextInt ( ) ;
            
           if ( ( valor % 8 ) == 0 )
           {
            seguir = true ;
           }
           else
           {
           conteo ++ ;
           suma += valor ;
           }
        }
        
        if (conteo != 0)
        {
             System.out.println ( " La cantidad de valores ingresados es " + conteo ) ;
        System.out.println ( " La suma de todos los valores es " + suma ) ;
        }
        else
        {
               System.out.println ( " ♥ ♥ ♥ chao , lea indicaciones ♥ ♥ ♥ ");
        }
    }
}
