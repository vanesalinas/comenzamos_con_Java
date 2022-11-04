/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vsalinas.ejercicio3;

import java.util.*;

/**
 *
 * @author Vane_
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int HS=350;
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese cantidad de horas trabajadas:");
	int horas=datos.nextInt();
        System.out.println("El sueldo del empleado es "+(horas*HS));
    }
}
