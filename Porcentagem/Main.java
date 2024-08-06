package Porcentagem;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double per, value, max;
        Porcentagem cont1 = new Porcentagem();
        String[] options = {"Percentage", "Value"};
        int choice = JOptionPane.showOptionDialog(null, "Options", "How do you want to calculate the percentage?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);

        if (choice != JOptionPane.CLOSED_OPTION) {
            if(choice == 0){
                per = Double.parseDouble(JOptionPane.showInputDialog(null,"Write the percentage:"));
                max = Double.parseDouble(JOptionPane.showInputDialog(null,"Write the max value:"));
                cont1.calculated(per, max);
            }
            else if(choice == 1){
                value = Double.parseDouble(JOptionPane.showInputDialog(null, "Write the value:"));
                max = Double.parseDouble(JOptionPane.showInputDialog(null, "Write the max value: "));
                cont1.calculated1(value, max);
            }
        } else {
            System.out.println("Dialog closed without selection.");
        }
    }
}