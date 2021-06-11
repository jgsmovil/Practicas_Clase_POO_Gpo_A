/*
 
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Imprimir  {
    private Informacion ob;
    
    public Imprimir(Informacion ob){
        this.ob=ob;
    }
    public void imprimirObjetoPorImpresora(){
        System.out.println(this.ob.imprimir());
    }
}

