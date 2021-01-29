/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chaco
 */
public class Circulo extends FiguraGeometrica {
    private double radio;
    private double resultadoC;
    
    public Circulo(double r){
        radio=r;
    }
    
    @Override
    public void perimetro(){
        resultadoC= 2*Math.PI*radio;
        System.out.println("La circunferencia del círculo es: "+ resultadoC);
    }
}
