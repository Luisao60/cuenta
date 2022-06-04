/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Zoraida
 */
public class Cirunferencia {

    private double radio;

    public Cirunferencia(double radio) {
        this.radio = radio;
    }

    public double getRad() {
        return radio;
    }

    public void setRad(double rad) {
        this.radio = rad;
    }

    /*
    * Comentario añadido
    */
    public void imprimir() {
        String color = "rojo";
        System.out.println("Di�metro: " + 2 * radio);
        System.out.println("Color: " + color);
        double area1 = 2 * 3.1416 * radio * radio;
        double area = area1;
        System.out.println(area);
    }


    public boolean esIgual(boolean considerarDecimales, Cirunferencia otro) {
        double radio1 = this.radio;
        double radio2 = otro.getRad();
        if (considerarDecimales) {
            if (radio1 == radio2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (Math.abs(radio1 - radio2) < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
