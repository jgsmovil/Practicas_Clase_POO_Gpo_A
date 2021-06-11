/*
 Permitir al usuario ingresar datos sin usar Scanner 
 */
package Excepciones;
//Modificado por garduño
import java.io.IOException;

/**
 *
 * @author jjggs_000
 */
public class Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        
        int c;
        int contador=0;
        
    //Se lee hasta encontrar el final de la linea
      System.out.println("Introduzca su nombre");
      
      while((c=System.in.read())!='\n'){
          contador++;
          System.out.print((char)c);
          
          
      }
      //Escriba el fin de la linea
      System.out.println();
      System.out.println("Contados son: "+contador+"Total de bytes");
        
    }
    
}
