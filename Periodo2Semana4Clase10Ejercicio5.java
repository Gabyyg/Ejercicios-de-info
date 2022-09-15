import java.util.Scanner;
public class Main {
  static Scanner ingresar = new Scanner(System.in);
  public static void main(String[] args) {

    int suma = 0 , num ;
       double promedio ;
        for (int i= 1 ; i<= 5 ; i ++) {
             System.out.println ( "Ingresar el numero " + i ) ;
             num = ingresar.nextInt ( ) ;
             suma = suma + num ;
        }  
        promedio = suma / 5 ;
        System.out.println ( " El promedio es: " + promedio ) ;
    }
}   
