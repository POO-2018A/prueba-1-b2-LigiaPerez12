/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria;

/**
 *
 * @author andres96
 */
public class ClsPedido {
    
    public int ced  = 0;
    public String nombrefru = "";

    public ClsPedido() {
    }
    
     public ClsPedido(int cedu, String fruta) {
        this.ced = cedu;
        this.nombrefru = fruta;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public String getNombrefru() {
        return nombrefru;
    }

    public void setNombrefru(String nombrefru) {
        this.nombrefru = nombrefru;
    }
    
    
    
    
}
