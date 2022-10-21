/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import controller.Panaderia;
import model.Pan;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yolima
 */
public class Inicio {

   private Panaderia tienda;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // añadir panes
        Pan hojaldrado = new Pan("Hojaldrado", 300);
        Pan baguette = new Pan("Baguette", 2500);
        Pan regular = new Pan("Regular", 300);
        Pan[] panes = new Pan[3];
        panes[0] = hojaldrado;
        panes[1] = baguette;
        panes[2] = regular;
        //corregir errores (sintaxis y de lógica)
        Panaderia tienda = new Panaderia();
        Inicio m = new Inicio();
        int choice = m.menu();
        while (choice != 2) {
            while (choice < 1 || choice > 2) {
                System.err.println("El numero debe estar entre 1 y 2");
                choice = m.menu();
            }
            switch (choice) {
                case 1:
                    tienda.venderPan(panes);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Que");
                    break;
            }
        }
        //agregar try/catch correcta y realizar la guía de error para que no se dañe el programa
    }
    public int menu() {
        int choice = 0;
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Registrar venta\n" +
                "2. Salir");
        Scanner keyboard = new Scanner(System.in);
        try {
            choice = keyboard.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("El dato ingresado debe ser un entero");
        } catch (Exception e) {
            System.err.println("No");
        }
        return choice;
    }
}
