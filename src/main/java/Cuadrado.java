/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chaco
 */
public class Cuadrado extends FiguraGeometrica {
    private double lado;
    private double resultadoC;
    public Cuadrado (double l){
        lado=l;
    }

    @Override
    public void perimetro() {
        resultadoC = lado*4;
        System.out.println("El perímetro del cuadrado es: " + resultadoC);
    }
  
   
    

    
}
