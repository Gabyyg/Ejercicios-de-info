import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

        
        int year;
        System.out.println("Ingrese el año que cursa");
        year=entrada.nextInt();        
        
        switch ( year )
        {
            case 1 :
                System.out.println ( " Cursos electivos : Ingles , Calculo " ) ;
                break ;
            case 2 :
              String Curso;
              System.out.println("Ingrese branch que desee: CSE, CCE, ECE");
              Curso=entrada.nextLine(); 
              System.out.println(Curso);
            switch ( Curso )
                {
                    case "CSE" : 
                         break ; 
                    case "CCE" :
                         System.out.println ( " Cursos electivos : Machine Learning , Big Data " ) ;
                         break ;
                    
                    case "ECE" :
                        System.out.println ( " Cursos electivos : Programacion " ) ;
                        break ;
                    
                    default :
                         System.out.println ( " Cursos electivos : Ingenieria de Software " ) ;
            }
        }    
    }
}  
