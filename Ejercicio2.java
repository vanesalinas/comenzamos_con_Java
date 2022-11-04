/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vsalinas.ejercicio2;

/**
 *
 * @author Vane_
 */
import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Ingrese nombre del alumno:");
	String nombre=datos.nextLine();
        
        System.out.println("Ingrese la primer nota:");
        int n1=datos.nextInt();
        
        System.out.println("Ingrese la segunda nota:");
        int n2=datos.nextInt();
        
        System.out.println("Ingrese la tercer nota:");
        int n3=datos.nextInt();
        
        double prom=(double)(n1+n2+n3)/3;
        
        System.out.println("Alumno: "+nombre);
        System.out.println("Su promedio es: "+prom);
    }
}
