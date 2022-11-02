/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vsalinas.cajero;
import java.util.*;
/**
 *
 * @author Operador_Vsalinas
 */
public class Cajero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el importe a extraer, multiplo de 100: ");
        int extraccion = leer.nextInt();
        do{
            if (extraccion%100 != 0){
                System.out.println("Debe ingresar un multiplo de 100");
                System.out.println("Ingrese el importe a extraer, multiplo de 100: ");
                extraccion = leer.nextInt();
            }
            if(extraccion%100 == 0){
                int mil = extraccion/1000;
                int quinientos = (extraccion-(mil*1000))/500;
                int doscientos = (extraccion-(mil*1000)-(quinientos*500))/200;
                int cien = (extraccion-(mil*1000)-(quinientos*500)-(doscientos*200))/100;
                if (mil != 0){
                    System.out.println("Billetes 1000: "+mil);
                }
                if (quinientos != 0){
                    System.out.println("Billetes 500: "+quinientos);
                }
                if (doscientos != 0){
                    System.out.println("Billetes 200: "+doscientos);
                }
                if (cien != 0){
                    System.out.println("Billetes 100: "+cien);
                }
            }
        }while (extraccion%100 != 0);
    }
}
