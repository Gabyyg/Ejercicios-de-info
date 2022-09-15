import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

        String str = "dos" ;
        switch ( str )
        {
            case "uno" :
                System.out.println ( " uno " ) ;
                break ;
            case "dos" :
                System.out.println ( " dos " ) ;
                break ;
            case "tres" :
                System.out.println ( " tres " ) ;
                break ;
            default :
                System.out.println ( " no coincide " ) ;
        }
    }
} 
