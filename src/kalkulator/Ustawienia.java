package kalkulator;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author roagen
 */
public class Ustawienia {
    
    //domyślne wartości
    Color font_color = Color.BLACK;
    Color button_color = Color.GRAY;
    Color background_color = Color.WHITE;

    public Ustawienia() {
        
    }
    
    
    public Color getFontColor(){
        
        return font_color;
    }
    
    public void setFontColor(Color color){ 
        font_color = color;
    }
    
    public Color getBackgroundColor(){
        
        return background_color;
    }
    
    public void setBackgroundColor(Color color){ 
        background_color = color;
    }
    
    
    public Color getButtonColor(){
        
        return button_color;
    }
    
    
     public void setButtonColor(Color color){ 
        button_color = color;
    }
     
     
    public void applyComponentSettings(Component comp){
        if(comp instanceof JPanel || comp instanceof JTabbedPane || comp instanceof JScrollPane){
            comp.setBackground(background_color);
            this.applySettings(comp);
        }
        if(comp instanceof JButton || comp instanceof JToggleButton || comp instanceof JTextField || comp instanceof JComboBox){
            comp.setBackground(button_color);
        }
            comp.setForeground(font_color);    
    }
     
     
     public void applySettings(Component body){
         body.setBackground(background_color);
         if(body instanceof JPanel){
             
            for(Component comp : ((JPanel) body).getComponents()){
                applyComponentSettings(comp);
            }
         
         }
         
         if(body instanceof JTabbedPane){
            for(Component comp : ((JTabbedPane) body).getComponents()){
                applyComponentSettings(comp);
            }
         
         }
         
          if(body instanceof JScrollPane){
            for(Component comp : ((JScrollPane) body).getComponents()){
                
                
                applyComponentSettings(comp);
            }
         
         }
        
         
     
     }
    
    
    
    
    
    
    
}
