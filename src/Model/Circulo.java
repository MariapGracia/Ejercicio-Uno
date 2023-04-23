package Model;

    /**
 * Esta clase define objetos de tipo Circulo con su radio como atributo.
 * @version 1.0/2023
 * Define un atributo llamado radio de tipo entero variable global en la clase
 */
public class Circulo {
    private int radio;

    /**
     * Constructor de la clase circulo 
     * @param radio  parametro que define el circulo
     */
    public Circulo (int radio){
        this.radio = radio;
    }


/*
*  Constructor de la clase circurlo sin parametro o esta vacio 
*/
public Circulo(){

}
/**
 * Metodo que calcula y devuleve el area de un circulo como pi multiplicado por
 * el radio al cuadrado
 * @return Area de un ciruculo
 */
public double calcularArea() {
    return Math.PI * Math.pow(radio, 2);
} 
/**
 * Metodo que calcula y devuleve el perimetro de un circulo como pi multiplicado por
 * el radio al cuadrado
 * @return perimetro de un circulo
 */
public double calcularPerimetro () {
    return 2 * Math.PI * radio; 
}

}

