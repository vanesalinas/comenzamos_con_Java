/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vsalinas.seg_a_hs;

import java.util.*;

/**
 *
 * @author Operador_Vsalinas
 */
public class Seg_a_hs {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos: ");
        int seg = leer.nextInt();
        int hh = seg/3600;                 //convierte en horas
        int mm = (seg-(hh*3600))/60;              //convertimos el resto de segundos en minutos
        int ss = seg - (hh*3600) - (mm*60);            //los segundos no convertimos, solo restamos los segundos que ya se utilizaron para calcular las horas y los minutos 
        System.out.println("El tiempo transcurrido fue de:");
        System.out.println(hh+" horas, "+mm+" minutos y "+ss+" segundos");
    }
}
