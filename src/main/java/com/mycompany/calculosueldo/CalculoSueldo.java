/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculosueldo;

public class CalculoSueldo {

    double SueldoBase;
    double Gratificacion;
    private double Colacion;
    double liquido;

    public CalculoSueldo(double Colacion, double SueldoBase, double Gratificacion, double liquido) {
        this.SueldoBase = SueldoBase;
        this.Gratificacion = Gratificacion;
        this.Colacion = Colacion;
        this.liquido= liquido;
        

    }

    public double getLiquido() {
        return liquido;
    }

    public void setLiquido(double liquido) {
        this.liquido = liquido;
    }

    public double getGratificacion() {
        return Gratificacion;
    }

    public void setGratificacion(double Gratificacion) {
        this.Gratificacion = Gratificacion;
    }

    public double getColacion() {
        return Colacion;
    }

    public void setColacion(double Colacion) {
        this.Colacion = Colacion;
    }

    @Override
    public String toString() {
        return ("Sueldo Base: " + SueldoBase + "Gratificacion: " + Gratificacion + "Colacion: " + getColacion());
    }
    
    public static void main(String[] args) {

    }
}
