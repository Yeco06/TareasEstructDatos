/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chaco
 */
public class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;
    private double resultadoT;
    
    public Triangulo (double l1, double l2, double l3){
        lado1=l1;
        lado2=l2;
        lado3=l3;
    }
    @Override
    public void perimetro(){
        resultadoT= lado1+lado2+lado3;
        System.out.println("El perímetro del triángulo es: "+ resultadoT);
    }
}
