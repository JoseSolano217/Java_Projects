/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import model.Pan;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author yolima
 */
public class Panaderia {

    private Cliente[] clientes;
    private Pan[] almacen;
    private int[] ventasTotales;

    public Panaderia() {
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Pan[] getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Pan[] almacen) {
        this.almacen = almacen;
    }

    public int[] getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(int[] ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public void venderPan(Pan[] pan) {
        almacen = pan;
        Cliente cliente = new Cliente();
        int[] numeroPanes = new int[3];
        int totalPanes = 0;
        int[] dntv = new int[100];
        setVentasTotales(dntv);
        System.out.println("¿Cuál es su nombre?");
        Scanner keyboard = new Scanner(System.in);
        cliente.setNombre(keyboard.nextLine());
        System.out.println("Bienvenido, " + cliente.getNombre());
        System.out.println("Tipo de pan a la venta:");
        for (int i = 0; i < 3; i++) {
            System.out.println(almacen[i].getTipo());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("¿Cuántos panes de " + almacen[i].getTipo() + " desea comprar?");
            try {
                numeroPanes[i] = keyboard.nextInt();
                totalPanes += numeroPanes[i];
            } catch (InputMismatchException e) {
                System.err.println("El valor debe de ser un numero entero");
            } catch (Exception e) {
                System.err.println("No");
            }
        }
        Pan[] canastas = new Pan[totalPanes];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < numeroPanes[i]; j++) {
                canastas[count] = almacen[i];
                count++;
            }
        }
        cliente.setCanasta(canastas);
        int valorTotal = 0;
        for (int i = 0; i < cliente.getCanasta().length; i++) {
            valorTotal += cliente.getCanasta()[i].getPrecio();
        }
        System.out.println("El valor total es " + valorTotal);
    }
}
