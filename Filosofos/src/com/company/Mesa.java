package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {
    private boolean[] tenedores;

    public Mesa(int numTenedores) {
        this.tenedores = new boolean[numTenedores];
    }
    // Tenedor de la derecha = indice del filosofo
    // Tenedor de la izquierda = indice del filosofo -1, en caso de 0, la ultima posición

    public int tenedorIzquierda(int i){
        return i;
    }

    public int tenedorDerecha(int i){
        if(i == 0){
            return this.tenedores.length - 1;
        }else{
            return i - 1;
        }
    }
    // Map Reduce
    // Si los dos tenedores adyacentes están ocupados, el filosofo espera.
    // Al tomar tenedores, la mesa cambia su booleano a falso.

    public synchronized void cogerTenedores(int comensal){

        while(tenedores[tenedorIzquierda(comensal)] || tenedores[tenedorDerecha(comensal)]){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tenedores[tenedorIzquierda(comensal)] = true;
        tenedores[tenedorDerecha(comensal)] = true;
    }

    // Al dejar tenedores, la mesa cambia su booleano a verdadero y notifica a todos los otros filosofos para que revisen si pueden comer otra vez.

    public synchronized void dejarTenedores(int comensal){
        tenedores[tenedorIzquierda(comensal)] = false;
        tenedores[tenedorDerecha(comensal)] = false;
        notifyAll();
    }
}
