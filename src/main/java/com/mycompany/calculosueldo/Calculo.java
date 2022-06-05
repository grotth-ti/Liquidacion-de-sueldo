/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculosueldo;

public class Calculo {

    public static void main(String[] args) {

        CalculoSueldo calculoSueldo = new CalculoSueldo(500000, 50000, 50000, 0);

        calculoSueldo.liquido = (calculoSueldo.Gratificacion + calculoSueldo.SueldoBase + calculoSueldo.getColacion());

        System.out.println("Impresion: " + calculoSueldo.getColacion() + "Sueldo Base: " + calculoSueldo.SueldoBase + "Gratificacion: " + calculoSueldo.Gratificacion);
        System.out.println("Impresion: " + calculoSueldo.liquido);
        System.out.println("Prueba Impresion: " + calculoSueldo); // Calculo sueldo solo con toString , disminuye codigo linea 15
    }
}
