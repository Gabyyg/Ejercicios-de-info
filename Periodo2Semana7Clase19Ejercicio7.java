import java.util.Scanner;
import javax.swing.JOptionPane ;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {
    
        int daysLeft=0;
        String weekDay = JOptionPane.showInputDialog ( " Ingresar el día de la semana (en ingles) " ) ;
        
        switch (weekDay) {
        case "SUNDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (7));
                break;
        case "MONDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (6)); ; 
              break;
        case "TUESDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (5));;
                break;
        case "WEDNESDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (4)); ;
                break;
        case "THURSDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (3)); ;
                break;
        case "FRIDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (2)); ;
                  break;
        case "SATURDAY" :
                 daysLeft = Integer.parseInt(JOptionPane.showInputDialog (1));;
                break;
        default: break;    
        }    
    
        JOptionPane.showMessageDialog ( null , " Quedan  "  + daysLeft + " para terminar la semana " ) ;
    }
} 
