/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public class ejecucion {
    JButton tablero[][] = new JButton[10][10];
    public ejecucion(JButton [][] tableroIn){
        tablero = tableroIn;        
    }
    
    void volverBlanco(){
        for(int i = 0;i<tablero.length; i++){
            for(int j=0; j<tablero.length; j++){
                if(tablero[i][j].getBackground().getBlue() == 0 && tablero[i][j].getBackground().getRed() == 0 && tablero[i][j].getBackground().getGreen()== 0){
                    tablero[i][j].setBackground(Color.red);
                }
            }
        }
    }
    
    JButton[][] actualizarTablero(JButton[][] tableroI) {
        for (int i = 0; i < tableroI.length; i++) {
            for (int j = 0; j < tableroI.length; j++) {
                if (tableroI[i][j].getBackground().getBlue() == 0 && tableroI[i][j].getBackground().getRed() == 0 && tableroI[i][j].getBackground().getGreen() == 0) {
                    tableroI[i][j].setBackground(Color.black);
                } else {
                    tableroI[i][j].setBackground(Color.white);
                }
            }
        }
        return tableroI;
    }
}
