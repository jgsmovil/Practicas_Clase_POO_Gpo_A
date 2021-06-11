/*
 invoca a java class SobrecargaMetodos
 */
package Unidad_2;

/**
 *
 * @author jjggs_000
 */
public class Git_Pruebas_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SobreCargaMetodos datos = new SobreCargaMetodos();
        double res;
        datos.test();
        datos.test(123.2);
        datos.test(10);
        datos.test(10,20);
        //comentar
        res = datos.test(123.2);
        
        System.out.println(res);
        
    }
    
}
