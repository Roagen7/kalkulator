/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author roagen
 */
public class FileHandler {
    
    public static void saveVariableToFile(String s, JFileChooser fileChooser){
        int odpowiedz = fileChooser.showSaveDialog(fileChooser.getParent());
        if(odpowiedz == fileChooser.APPROVE_OPTION){
            String filename = fileChooser.getSelectedFile().toString();
            File file = new File(filename);
            
            
            try {
                FileWriter out = new FileWriter(file);
                
                String lines[] = null;
                lines = s.split("\n");
                for(int i = 0; i < lines.length; i++){
                    out.write(lines[i] + "\r\n");
                }
                out.close();
            
            } catch (IOException e){
                System.out.println("Problem: " + e);
            }
            
            
        }
    
    }
    
    
    
    
}
