import java.util.Scanner;
public class Main {
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {

    float NM;
    double precio = 0 ;
    double prima = 0;
    double descuento = 0;
    double deuda= 0 
    double cuota = 0;
    
       System.out.println ( " Ingrese el numero de meses : ");
       NM = entrada.nextFloat();
    
       if ( NM >= 1 && NM <= 65 ) {
          precio = 23000 * 1.13 ;
    
            if ( NM == 36 ) {
             descuento = precio*0.2 ;
             prima = ( precio-descuento)*0.15 ;
             deuda = ( precio-descuento) - prima ;
            } 
            else {
             prima = precio * 015; 
             deuda = precio - prima;
            }
         
          cuota = deuda / NM ;
          System.out.println ( " Precio : " + precio);
          System.out.println ( " Descuento : " + descuento);
          System.out.println ( " Deuda : " + deuda);
          System.out.println ( " Cuota : " + cuota);
       } 
       else {                   
          System.out.println ( " Lo siento corazon lea por favor ");
       }
    }   
} 
