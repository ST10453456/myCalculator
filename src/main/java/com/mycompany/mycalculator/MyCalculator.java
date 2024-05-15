package com.mycompany.mycalculator;
import javax.swing.JOptionPane;

public class MyCalculator {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog( null, "calculator");
        
        String input1 = JOptionPane.showInputDialog("Enter the first number");
        double num1 = Double.parseDouble(input1);
        
        String input2 = JOptionPane.showInputDialog("Enter the second number");
        double num2 = Double.parseDouble(input2);
        
        String operation = JOptionPane.showInputDialog("Enter operation(+,-,*/");
        
        if(operation.equals("+")){
            JOptionPane.showMessageDialog(null,"The result is:  " + (num1 + num2));
            
        }
        else if(operation.equals("-")){
            JOptionPane.showMessageDialog(null,"The result is:  " + (num1 - num2));
        }
    else if(operation.equals("*")){
            JOptionPane.showMessageDialog(null,"The result is:  " + (num1 * num2));
        }
        else if(operation.equals("/")){
            JOptionPane.showMessageDialog(null,"The result is:  " + (num1 / num2));
        }
    }
}
