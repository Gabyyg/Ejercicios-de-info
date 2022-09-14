import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

    String nombre , pass ;
    
    System.out.print ( " Ingrese Nombre de usuario : " ) ;
    nombre = entrada.nextLine();
    
    System.out.print ( " Ingrese contraseña de usuario : " ) ;
    pass = entrada.nextLine ( ) ;
    
    if ( nombre.equals ( "Juan" ) && pass.equals ( "123456" ) ) {
      System.out.println ( " Bienvenido al Sistema " ) ;
    }
    else {
      System.out.println ( " Nombre de Usuario o contraseña Incorrecto " ) ;
    }
    
  }
} 
