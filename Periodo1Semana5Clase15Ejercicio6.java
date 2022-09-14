import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.println ( "Ingrese la base : " ) ;
    double base = entrada.nextDouble ( ) ;
        
    System.out.println ( "Ingrese el exponente : " ) ;  
    double exponente = entrada.nextDouble ( ) ;
        
    double resultado = Math.pow ( base , exponente ) ;
    System.out.println ( "El resultado es : " + resultado ) ;
    }
} 
