package boletin_5_6;

import javax.swing.JOptionPane;

public class Boletin_5_6 {

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Inserte el nombre del artículo");
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte las ventas totales de "+n1));
        
        Articulos m = new Articulos();
            m.compA(a1,n1);
    }
    
}
