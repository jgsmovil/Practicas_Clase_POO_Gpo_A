/*
 Ejercicio baasico que muestra sobrecarga metodos
 */
package Unidad_2;

/**
 *
 * @author jjggs_000
 */
public class SobreCargaMetodos {
   public void test(){
        System.out.println("Metodo Vacio");
        
    }
    public void test(int a){
        System.out.println("a: "+a);
    }
    
    public void test(int a, int b){
        System.out.println("a y b: "+a+""+b);
        
}
    public double test(double a){
        System.out.println("double de a: "+a);
        return a;
    }
}
