/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yolima
 */
public class Cliente {
    
    private String nombre;
    private Pan[] Canasta;

    public Cliente() {
    }

    public Cliente(String nombre, Pan[] Canasta) {
        this.nombre = nombre;
        this.Canasta = Canasta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pan[] getCanasta() {
        return Canasta;
    }

    public void setCanasta(Pan[] Canasta) {
        this.Canasta = Canasta;
    }
    
    
}
