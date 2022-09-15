public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

     int day = 5 ;
        String dayName ;
        switch ( day )
        {
            case 1:  dayName = " Lunes " ;
                     break ;
            case 2:  dayName = " Martes " ;
                     break ;
            case 3:  dayName = " Miercoles " ;
                     break ;
            case 4:  dayName = " Jueves " ;
                     break ;
            case 5:  dayName = " Viernes " ;
                     break ;
            case 6:  dayName = " Sabado " ;
                     break ;
            case 7:  dayName = " Domingo " ;
                     break ;
            default: dayName = " Dia inválido " ;
                     break ;
        }    
        System.out.println ( dayName ) ;
    }
}   
