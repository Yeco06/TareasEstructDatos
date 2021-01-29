/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chaco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado square= new Cuadrado (5);
        Triangulo triangle= new Triangulo (7,6,10);
        Circulo circle= new Circulo (7);
        square.perimetro();
        triangle.perimetro();
        circle.perimetro();
        
    }
    
}
