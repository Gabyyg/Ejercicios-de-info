import java.util.Scanner;
public class Main {
  static Scanner ingresar = new Scanner(System.in);
  public static void main(String[] args) {
    
        double nota ;
  
        System.out.println ( " favor ingresar un valor desde 1 hasta 10 " ) ;
        nota = ingresar.nextDouble ( ) ;
  
        while ( nota < 1 || nota > 10 )
        {
        System.out.println ( " Lo siento mucho pero el valor proporcionado no es correcto, vuelva a ingesar el numero " ) ;
        nota = ingresar.nextDouble ( ) ;
        }
    }
}
