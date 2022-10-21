/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_fit;

import java.util.List;

/**
 *
 * @author Maira
 */
public class Setting {

      public static int ultimoBloqueAsignado = 0;

      public static int firtFit(List<int[]> controlList, int size) {

            int res = 0;

            for (int[] bloque : controlList) {

                  if (bloque[0] == 0 && bloque[2] >= size) {

                        break;

                  }

                  res++;

            }

            if (res == controlList.size()) {

                  res = -1;

            }

            return res;

      }
}