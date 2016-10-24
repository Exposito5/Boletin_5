package boletin_5_4;

import javax.swing.JOptionPane;

public class Boletin_5_4 {

    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog("Inserte el nombre de la primera persona");
        float p1 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el peso de "+n1));
        String n2 = (JOptionPane.showInputDialog("Inserte el nombre de la segunda persona"));
        float p2 = Float.parseFloat(JOptionPane.showInputDialog("Inserte el peso de "+n2));
        
        Peso p = new Peso();
        p.VerPeso(p1, p2);
    }
    
}
