/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author roagen
 */
public class InformatycznyFunkcje {
    
   
   public static int binToDec(String bin){
        int wynik = 0;
       
        for(int i = 0; i < bin.length(); i++){
            char c = bin.charAt(i);
            if(c == '1'){
                wynik += Math.pow(2.0, bin.length() - i - 1);
            }
            
        
        }
        return wynik;
    }
    
   public static String decToBin(int num){
        String bin = "";
       
        while(num != 0){
            bin = (num % 2) + "" + bin;
            num /= 2;
        }
        return bin;
    }
    
   public static String changeStringAt(int index, char c, String str){
        
        char[] myNameChars = str.toCharArray();
        myNameChars[index] = c;
        str = String.valueOf(myNameChars);
        return str;
   }
   
   

    /*
    public static void checkStateOfButtons(JPanel panel){
        for(Component comp : panel){
            if(comp instanceof JToggleButton){
            
            
            }
        }
      }  
    */
    
    
    
    
   
    
    
}
