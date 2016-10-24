
package boletin_5_1;

import javax.swing.JOptionPane;

public class Boletin_5_1 {

    public static void main(String[] args) {
        int num1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte número"));
        if(num1>0)
        System.out.println(num1+" é positivo");
        System.out.println("Adiós");
        
    }
    
}
