/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author roagen
 */

public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ustawienia ustawienia = new Ustawienia();
        
        new Menu_glowne(ustawienia).setVisible(true);
        
    }
    
}
