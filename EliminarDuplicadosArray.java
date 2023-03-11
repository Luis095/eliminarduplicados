/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eliminarduplicados;

/**
 *
 * @author LuisRaymundo
 */
import java.util.Arrays;

public class EliminarDuplicadosArray {

  public static int[] eliminarDuplicados(int[] array) {
    
    // Utilizamos la clase Arrays para ordenar el array
    Arrays.sort(array);
    
    // Contamos cuántos elementos únicos hay en el array
    int numUnicos = 0;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] != array[i + 1]) {
        numUnicos++;
      }
    }
    numUnicos++;
    
    // Creamos un nuevo array con los elementos únicos
    int[] arrayUnicos = new int[numUnicos];
    int j = 0;
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] != array[i + 1]) {
        arrayUnicos[j] = array[i];
        j++;
      }
    }
    arrayUnicos[j] = array[array.length - 1];
    
    return arrayUnicos;
  }
  
  public static void main(String[] args) {
    int[] array = {1, 2, 1, 2, 3, 4, 4, 4, 5, 6, 6, 7, 8, 9, 10,};
    int[] arrayUnicos = eliminarDuplicados(array);
    System.out.println(Arrays.toString(arrayUnicos)); // Imprime [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,]
  }
}

