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

public class Test {
    public static void main(String[] args)
{
        Cirunferencia c1 = new Cirunferencia(5.5);
        Cirunferencia c2 = new Cirunferencia(10.1);
        Cirunferencia c3 = new Cirunferencia(10.9);

   if (c2.esIgual(false, c3))
            System.out.println("c2 y c3: iguales sin considerar decimales");

   if (c2.esIgual(true, c3))
       System.out.println("c2 y c3: iguales considerando decimales");
}
    
}
