import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {                       
            int numero1 ;
            int numero2 ; 
                       
            System.out.print ( " Escriba el primer entero : " ) ;
            numero1 = entrada.nextInt ( ) ; 
                       
            System.out.print ( " Escriba el segundo entero : " ) ;
            numero2 = entrada.nextInt () ;
                       
            if ( numero1 == numero2 ) {
              System.out.println ( " El numero" + numero1 + " es igual a " + numero2);
            }
                    
            else if ( numero1 != numero2 ){
              System.out.println ( " El numero " + numero1 + " es distinto a " + numero2);
            }
         
            else if ( numero1 < numero2 ){
             System.out.println ( " El numero " + numero1 + " es menor a " + numero2); 
            }
                                   
            else if ( numero1 > numero2 ){
            System.out.println ( " El numero " + numero1 + " es mayor a " + numero2);
            }
                                   
            else if ( numero1 <= numero2 ){
            System.out.println ( " El numero " + numero1 + " es menor o igual a" + numero2);
            }
                               
           else if ( numero1 >= numero2 ){
            System.out.println ( " El numero " + numero1 + " es mayor o igual a " + numero2);
           }
           
     }                  
}       
