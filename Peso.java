package boletin_5_4;

public class Peso {
    private float p1,p2;
public Peso(){  
}
public Peso (float p1,float p2){

}
public void VerPeso (float p1,float p2){
    if(p1<0||p2<0)
        System.out.println("El peso no puede ser negativo");
    else if(p1>p2)
        System.out.println("La diferencia de peso es de "+(p1-p2)+" kg");
    else if(p1==p2)
        System.out.println("El peso de ambos es el mismo");
    else
        System.out.println("La diferencia de peso es de "+(p2-p1)+" kg");

}
}
