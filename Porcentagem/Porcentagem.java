package Porcentagem;
import java.lang.Math;

import javax.swing.JOptionPane;

 public class Porcentagem{

    void calculated(double a, double b){
        
        double c = (b / 100) * a ;
        String.format("%.2f", c);
        JOptionPane.showMessageDialog(null, 
        (String.format("The calculated value is: %.2f",  c)));
    }
    
    void calculated1(double a, double b){
        
        double c = (a / b) * 100;
        JOptionPane.showMessageDialog(null,
        (String.format("The calculated value is: %.2f ", c)));

    }
    
}


