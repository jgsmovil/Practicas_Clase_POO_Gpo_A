/*
 
 */
package Pruebas;

/**
 *
 * @author jjggs_000
 */
public class Numero {
    int num;
    public Numero(int num){
        this.num=num;
    }
    
    public int getNum(){
        return num;
    } 
    
    public void setNum(){
        this.num=num;
    }
    @Override
    public String toString(){
        return "Numero("+num+")";
    }
    
    
    
}
