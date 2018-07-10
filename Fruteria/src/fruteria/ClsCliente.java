/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruteria;

/**
 *
 * @author ESFOT
 */
public class ClsCliente {
    
    public String Nombre = "";
    public int cedula = 0;

 
    
    public ClsCliente(String nom, int cedula) {
        this.Nombre = nom;
        this.cedula = cedula;
    }

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    
    
    
    
}
