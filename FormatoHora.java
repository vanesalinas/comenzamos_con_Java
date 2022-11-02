/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vsalinas.formatohora;
import javax.swing.*;
       
/**
 *
 * @author Vane_
 */
public class FormatoHora {
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Ingrese hora y minutos","Formato 24hs",1);
        int hh = Integer.parseInt(JOptionPane.showInputDialog("Hora:"));
        int mm = Integer.parseInt(JOptionPane.showInputDialog("Minutos:"));
        if(hh<=23 && hh>=0){
            if(mm<=59 && mm>=0){
                if(hh<=12 && hh>=0){
                    JOptionPane.showMessageDialog(null,hh+":"+mm+"AM","Formato 12hs",1);
                }else{
                    int hora = hh-12;
                    JOptionPane.showMessageDialog(null,hora+":"+mm+"PM","Formato 12hs",1);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Minutos incorrectos","ERROR",0);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Hora incorrecta","ERROR",0);
        }
    }
}
