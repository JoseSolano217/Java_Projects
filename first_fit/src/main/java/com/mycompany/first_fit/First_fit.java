/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.first_fit;

import java.util.LinkedList;
import java.util.List;
 

public class First_fit {

       public static final int MemoryLength= 64;

       public static List<int[]> controlList;

       public static int[] memory;

       public static int ultimatePid;

       private static void initializeMemory() {

             controlList = new LinkedList<>();

             memory = new int[MemoryLength];

             ultimatePid = 0;

             int[] hueco = { 0, 0, MemoryLength, 0 };

            controlList.add(hueco);

       }


       private static void escribeMemoria(int direction, int size, int data) {

             for (int i = 0; i < size; i++) {

                    memory[direction + i] = data;
                }

       }


       public static boolean createProcess(int pid, int size) {

              int hueco = Setting.firtFit(controlList, size);

            

             boolean res = (hueco != -1);

             if (res) {

                    int direcc = controlList.get(hueco)[1];

                    int[] proceso = { 1, direcc, size, pid };

                    int espacioRestante = controlList.get(hueco)[2] - size;

                    // Inserta el proceso en el lugar del hueco

                    controlList.set(hueco, proceso);

                    // Si el proceso es más pequeño que el hueco, inserta un hueco

                    if (espacioRestante > 0) {

                           int[] bloqRestante = { 0, direcc + size, espacioRestante, 0 };

                           controlList.add(hueco + 1, bloqRestante);

                    }

                    escribeMemoria(direcc, size, 1);

             }

             return res;

       }

       public static boolean destructionProcess(int pid) {

             // Busca el índice del proceso en la lista de control

             int indice = 0;

             for (int[] bloque : controlList) {

                    indice++;

                    if (bloque[3] == pid) {

                           break;

                    }

             }

             indice--;

             boolean encontrado = (indice != -1);

             // Si lo ha encontrado, lo borra de la memoria y de la lista de control

             if (encontrado) {

                    int[] bloqueABorrar = controlList.get(indice);

                    controlList.get(indice)[0] = 0;

                    controlList.get(indice)[3] = 0;

                    escribeMemoria(bloqueABorrar[1], bloqueABorrar[2], 0);

                    function(indice);

                    function(indice - 1);

             }

             return encontrado;

       }

 
       private static boolean function(int indice) {

             boolean fusionable = false;

             if (indice >= 0 && (indice + 1) < controlList.size()) {

                    fusionable = controlList.get(indice)[0] == 0

                                  && controlList.get(indice + 1)[0] == 0;

             }

             if (fusionable) {

                    int tamanyo = controlList.remove(indice + 1)[2];

                    controlList.get(indice)[2] += tamanyo;
             }

             return fusionable;

       }

 

         //Muestra en pantalla el estado de la lista de control y la memoria.


       public static void printMemory() {

             String s = "Control List: {[EST-DIR-TAM-PROC]:";

             for (int[] bloque : controlList) {

                    s += "[" + bloque[0] + "-" + bloque[1] + "-" + bloque[2] + "-"

                                  + bloque[3];

                    s += "]";

             }

             s += "}\nMemory: ";

             for (int i : memory) {

                    s += i;

             }

             System.out.println(s + "\n");

       }


       public static void main(String[] args) {

             initializeMemory();

            

             createProcess(1, 6);

             printMemory();

            

             createProcess(2, 6);

             printMemory();

            

             createProcess(3, 8);

             printMemory();

            

             createProcess(4, 7);

             printMemory();

            

             destructionProcess(2);

             destructionProcess(4);

             createProcess(5, 7);

             printMemory();

            

             destructionProcess(1);

             createProcess(6,5);

             printMemory();

            

             destructionProcess(5);

             printMemory();

            

             destructionProcess(3);

             destructionProcess(6);

             printMemory();

       }

 

}