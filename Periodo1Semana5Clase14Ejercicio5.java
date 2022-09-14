import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

      int reglas ;
      double nota ;
    
      System.out.println ( "Usted cumple las reglas de la universidad : " ); 
          
      System.out.println ( "Ingrese un numero :") ;
      System.out.println ( "\n1. Siempre " ); 
      System.out.println ( "\n2. Aveces " ); 
      System.out.println ( "\n3. Nunca " ); 
      reglas = entrada.nextInt ( ) ;
    
        System.out.println ( "Que nota obtuvo en el laboratorio : " ) ;
        nota = entrada.nextDouble ( ) ;
        if ( reglas == 1 ) {
             
          if ( nota >= 8 & nota <= 10 ) {
                nota = 10 ;                     
              }
          else {
                System.out.println ( "Se mantiene la misma nota " ) ;
                }
        } 
        else if ( reglas == 2 ) {
              
          if ( nota < 6 && nota>0) { 
            nota = nota + 0.5;
          }
          else if ( nota >= 6 & nota < 8 ) {
            nota = nota + 0.7;
          }
          else {
            System.out.println ( "Se mantiene la misma nota " ) ;
          }
                    
        } 
        else {        
            System.out.println ( "Usted debe cumplir las reglas " ) ;
        }    
        System.out.println ( "La nueva nota es : " + nota ) ;   
    }
}     
