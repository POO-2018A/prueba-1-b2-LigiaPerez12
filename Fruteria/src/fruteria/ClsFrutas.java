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
public class ClsFrutas {
    String nombreFru = "";
    int codigo =0;
    double precio =0.0;

    public ClsFrutas() {
    }
    
    public ClsFrutas(String nomFru, int cod, double pre) {
        this.nombreFru = nomFru;
        this.codigo = cod;
        this.precio = pre;
    }
    
    

    public String getNombreFru() {
        return nombreFru;
    }

    public void setNombreFru(String nombreFru) {
        this.nombreFru = nombreFru;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return getNombreFru();
    }
    
    
    
    
    
}
