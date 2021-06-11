/*
 
 */
package Mis_Figuras;

/**
 *
 * @author jjggs_000
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1= new Rectangulo(2.0,4.0);
        
        System.out.println("RECTANGULOS");
        System.out.println("Perimetros");
        //Perimetro  (1er.objeto)
        System.out.println("Rectangulo base "+r1.getBase()+"altura"+r1.getAltura()+"es"+r1.calcularPerimetro());
        //Area       (1er.objeto)
        System.out.println("Rectangulo base "+r1.getBase()+"y altura"+r1.getAltura()+"es: "+r1.calcularArea());
    
        //Circulos  (1er.objeto)
        Circulo c1=new Circulo(2);
        
        System.out.println("Circulos");
        System.out.println("Perimetros");
        //Perimetro (1er objeto)
        System.out.println("Circulo radio: "+c1.getRadio()+":"+c1.calcularPerimetro());
        
        
        //Areas
        System.out.println("Area: ");
        System.out.println("Circulo radio: "+c1.getRadio()+":"+c1.calcularArea());
        
      
    }
    
}
