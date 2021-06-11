/*
    Llam a java class sobrecarga de contructores
 */
package Unidad_2;

/**
 *
 * @author jjggs_000
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja c1= new Caja(10,20,15);
        Caja c2= new Caja();
        Caja c3= new Caja(5);
        
        System.out.println("Caja_1: "+c1);
        System.out.println("Caja_2: "+c2);
        System.out.println("Caja_3: "+c3);
    }
    
}
