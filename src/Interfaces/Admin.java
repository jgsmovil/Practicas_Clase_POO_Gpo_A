/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author jjggs_000
 */
public class Admin implements Informacion {
    private String usuario;
    private String pass;
    
    public Admin(String usuario, String pass){
        this.usuario=usuario;
        this.pass=pass;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass=pass;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }

    @Override
    public String imprimir() {
        return this.usuario+"***"+this.pass;
    }
    
}
