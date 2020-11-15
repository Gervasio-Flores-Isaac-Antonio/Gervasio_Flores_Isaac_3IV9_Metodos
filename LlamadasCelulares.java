import java.util.Scanner;
public class LlamadasCelulares {
    
    private static int credito;
    private static int numero_celular;
    private static double costoT;
       
    public static void main(String[] args) {
    
    credito();   
    numeroCel();
    obtenerCostoLlamada();
    verCredito();
  
    }
     
     public static void credito (){                
         
         System.out.println("Ingrese el credito");
         Scanner teclado = new Scanner(System.in);
         credito = teclado.nextInt();
                  
     }
     
     public static void obtenerCostoLlamada (){                
     
         Scanner cs = new Scanner(System.in);
         double costo;
         System.out.println("Ingrese los minutos usados");
         int costoS=cs.nextInt();
         
         System.out.println("Ingrese el tipo de llamada que va a hacaer");
         System.out.println("Presione 1.- para tipo de llamada nacional");
         System.out.println("Presione 2.- para tipo de llamada internacional");
         System.out.println("Presione 3.- para tipo de llamada celular");
         Scanner tipoLlamadas = new Scanner(System.in);     
         int tipoLlamada = tipoLlamadas.nextInt();
         
         
         
         
         switch (tipoLlamada) {
            
             
            case 1:
            
                System.out.println("El numero de telefono ");
                
            
            costoT = 0.5 * costoS;
            System.out.println("El numero de telefono " +numero_celular);
            
            break;   
            
            case 2:                          
                
            
            costoT = 0.6 * costoS;
            System.out.println("El numero de telefono " +numero_celular);
            
            break;
            
            case 3:
            
            
            costoT = 0.2 * costoS;
            System.out.println("El numero de telefono " +numero_celular);
      
            break;
         }
        
     }
     
     public static void numeroCel (){                
         
         System.out.println("Ingrese el numero de celular");
         Scanner teclado = new Scanner(System.in);
         numero_celular = teclado.nextInt();
         
     
     }
     
      public static void verCredito (){  
          
          System.out.println("El credito restante es: " +(credito-costoT) );
          
      }
     
}