package boletin_5_2;

import javax.swing.JOptionPane;

public class Boletin_5_2 {

    public static void main(String[] args) {
  short num1,num2;
      num1=Short.parseShort(JOptionPane.showInputDialog("Inserte numero 1"));
      num2=Short.parseShort(JOptionPane.showInputDialog("Inserte numero 2"));
      
      if(num1>=num2)
            System.out.println("La resta de "+num1+"-"+num2+" da "+(num1-num2));
      else 
            System.out.println("La suma de "+num1+"+"+num2+" da "+(num1+num2));
      
    }
    
}
