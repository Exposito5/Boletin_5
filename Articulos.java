
package boletin_5_6;

public class Articulos {
    private float a1;
public Articulos(){  
}
public Articulos (int p1){
    this.a1=a1;
}    
public void compA (int a1,String n1){
    if (a1<=100){
            System.out.println("Se han vendido "+a1+" "+n1+" es un artículo de bajo consumo");}
    if (a1>100&&a1<=500){
            System.out.println("Se han vendido "+a1+" "+n1+" es un artículo de consumo medio");}
    if (a1>500&&a1<=1000){
            System.out.println("Se han vendido "+a1+" "+n1+" es un artículo de alto consumo");}
    if (a1>1000){
            System.out.println("Se han vendido "+a1+" "+n1+" es un artículo de primera necesidad");}
}
}

